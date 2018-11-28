package com.daffaalam.example.simpleasynctasks;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

class MainAsyncTasks extends AsyncTask<String, Void, String> {

    @SuppressLint("StaticFieldLeak")
    private final Context context;

    private ProgressDialog progressDialog;
    private final ArrayList<String> stringArrayListTitle, stringArrayListSub, stringArrayListImage;
    private final MainAdapter mainAdapter;

    MainAsyncTasks(Context context, MainAdapter mainAdapter, ArrayList<String> stringArrayListTitle, ArrayList<String> stringArrayListSub, ArrayList<String> stringArrayListImage) {
        this.context = context;
        this.mainAdapter = mainAdapter;
        this.stringArrayListTitle = stringArrayListTitle;
        this.stringArrayListSub = stringArrayListSub;
        this.stringArrayListImage = stringArrayListImage;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    @Override
    protected String doInBackground(String... strings) {

        HttpsURLConnection httpsURLConnection;
        BufferedReader bufferedReader;
        StringBuilder stringBuilder;
        String lines, result;

        try {
            httpsURLConnection = (HttpsURLConnection) new URL(strings[0]).openConnection();
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.connect();
            bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            stringBuilder = new StringBuilder();
            while ((lines = bufferedReader.readLine()) != null) {
                stringBuilder.append(lines);
            }
            result = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        progressDialog.dismiss();

        JSONArray jsonArray;
        String title, sub, image;

        try {
            jsonArray = new JSONObject(s).getJSONArray("results");
            for (int position = 0; position < jsonArray.length(); position++) {
                title = jsonArray.getJSONObject(position).getString("original_title");
                sub = "RATING (" + jsonArray.getJSONObject(position).getDouble("vote_average") + "/10) " + jsonArray.getJSONObject(position).getInt("vote_count");
                image = MainActivity.BASE_IMAGES + jsonArray.getJSONObject(position).getString("poster_path");
                stringArrayListTitle.add(title);
                stringArrayListSub.add(sub);
                stringArrayListImage.add(image);
            }
            mainAdapter.notifyDataSetChanged();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
