package com.daffaalam.example.simpleasynctasks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String BASE_IMAGES = "https://image.tmdb.org/t/p/w500";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvMain = findViewById(R.id.rvMain);
        ArrayList<String> stringArrayListTitle = new ArrayList<>();
        ArrayList<String> stringArrayListSub = new ArrayList<>();
        ArrayList<String> stringArrayListImage = new ArrayList<>();
        MainAdapter mainAdapter = new MainAdapter(this, stringArrayListTitle, stringArrayListSub, stringArrayListImage);

        rvMain.setHasFixedSize(true);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setAdapter(mainAdapter);

        String apiKey = "1aabd71c3dff7de313cbfb0d920fdc9f";
        String baseUrl = "https://api.themoviedb.org/4/list/1";

        new MainAsyncTasks(MainActivity.this, mainAdapter, stringArrayListTitle, stringArrayListSub, stringArrayListImage).execute(baseUrl + "?api_key=" + apiKey);
    }
}
