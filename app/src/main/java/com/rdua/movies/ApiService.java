package com.rdua.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiService {
 @GET("v1.4/movie?token=YV69DSM-1FD4EH0-HK8WJ5P-TMN60T1&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

/*    @GET("v1.4/movie?token=YV69DSM-1FD4EH0-HK8WJ5P-TMN60T1&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);*/

    @GET("v1.4/movie/{ID}?token=YV69DSM-1FD4EH0-HK8WJ5P-TMN60T1")
    Single<TrailerResponse> loadTrailers(@Path("ID") int id);

    @GET("v1.4/review?token=YV69DSM-1FD4EH0-HK8WJ5P-TMN60T1")
    Single<ReviewResponse> loadReviews(@Query("movieId") int idFilms);
}
