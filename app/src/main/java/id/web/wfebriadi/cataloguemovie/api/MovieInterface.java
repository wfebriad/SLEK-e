package id.web.wfebriadi.cataloguemovie.api;

import id.web.wfebriadi.cataloguemovie.model.CreditsMovieModel;
import id.web.wfebriadi.cataloguemovie.model.DetailModel;
import id.web.wfebriadi.cataloguemovie.model.NowPlayingModel;
import id.web.wfebriadi.cataloguemovie.model.PopularModel;
import id.web.wfebriadi.cataloguemovie.model.SearchModel;
import id.web.wfebriadi.cataloguemovie.model.UpcomingModel;
import id.web.wfebriadi.cataloguemovie.model.people.CombinedCreditsModel;
import id.web.wfebriadi.cataloguemovie.model.people.PersonModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieInterface {

    @GET("search/movie")
    Call<SearchModel> getSearchMovie (@Query("query") String query, @Query("api_key") String apiKey, @Query("languange") String languange);

    @GET("movie/upcoming")
    Call<UpcomingModel> getUpcomingMovie (@Query("api_key") String apiKey, @Query("languange") String languange, @Query("page") int pageNumber);

    @GET("movie/now_playing")
    Call<NowPlayingModel> getNowPlayingMovie (@Query("api_key") String apiKey, @Query("languange") String languange, @Query("page") int pageNumber);

    @GET("movie/popular")
    Call<PopularModel> getPopularMovie (@Query("api_key") String apiKey, @Query("languange") String languange, @Query("page") int pageNumber);

    @GET("movie/{movie_id}")
    Call<DetailModel> getDetailMovie(@Path("movie_id") int movie_id, @Query("api_key") String apiKey, @Query("language") String language);

    @GET("movie/{movie_id}/credits")
    Call<CreditsMovieModel> getCreditsMovie(@Path("movie_id") int movie_id, @Query("api_key") String apiKey, @Query("language") String languange);

    @GET("person/{person_id}/combined_credits")
    Call<CombinedCreditsModel> getCombinedCredit(@Path("person_id") int person_id, @Query("api_key") String apiKey, @Query("language") String languange);

    @GET("person/{person_id}")
    Call<PersonModel> getDetailPeople (@Path("person_id") int person_id, @Query("api_key") String apiKey, @Query("language") String language);

}
