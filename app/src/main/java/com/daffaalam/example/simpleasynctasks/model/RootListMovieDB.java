package com.daffaalam.example.simpleasynctasks.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootListMovieDB {

    @SerializedName("object_ids")
    private ObjectIds objectIds;

    @SerializedName("comments")
    private Comments comments;

    @SerializedName("iso_3166_1")
    private String iso31661;

    @SerializedName("description")
    private String description;

    @SerializedName("runtime")
    private int runtime;

    @SerializedName("average_rating")
    private double averageRating;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("sort_by")
    private String sortBy;

    @SerializedName("iso_639_1")
    private String iso6391;

    @SerializedName("created_by")
    private CreatedBy createdBy;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("total_results")
    private int totalResults;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("revenue")
    private long revenue;

    @SerializedName("public")
    private boolean jsonMemberPublic;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("page")
    private int page;

    @SerializedName("results")
    private List<ResultsItem> results;

    public void setObjectIds(ObjectIds objectIds) {
        this.objectIds = objectIds;
    }

    public ObjectIds getObjectIds() {
        return objectIds;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Comments getComments() {
        return comments;
    }

    public void setIso31661(String iso31661) {
        this.iso31661 = iso31661;
    }

    public String getIso31661() {
        return iso31661;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public String getIso6391() {
        return iso6391;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setJsonMemberPublic(boolean jsonMemberPublic) {
        this.jsonMemberPublic = jsonMemberPublic;
    }

    public boolean isJsonMemberPublic() {
        return jsonMemberPublic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setResults(List<ResultsItem> results) {
        this.results = results;
    }

    public List<ResultsItem> getResults() {
        return results;
    }
}