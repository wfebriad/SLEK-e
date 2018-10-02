package id.web.wfebriadi.cataloguemovie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpcomingModel {

    @SerializedName("dates")
    private DatesModel datesModel;

    @SerializedName("page")
    private int page;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("results")
    private List<ItemResults> results;

    @SerializedName("total_results")
    private int totalResults;

    public UpcomingModel(DatesModel dates, int page, int totalPages, List<ItemResults> results, int totalResults) {
        this.datesModel = dates;
        this.page = page;
        this.totalPages = totalPages;
        this.results = results;
        this.totalResults = totalResults;
    }

    public DatesModel getDatesModel() {
        return datesModel;
    }

    public int getPage() {
        return page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<ItemResults> getResults() {
        return results;
    }

    public int getTotalResults() {
        return totalResults;
    }

}
