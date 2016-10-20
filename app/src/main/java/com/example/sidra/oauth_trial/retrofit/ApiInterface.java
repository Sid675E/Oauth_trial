package com.example.sidra.oauth_trial.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by sidra on 16-10-2016.
 */

public interface ApiInterface {
    ///
    // @GET("/firstt")
    //Call<CustomViewResponse> getJsonFromSid();

    @POST("/gconnect")
    Call<Void> createTask(@Body String task);

}
