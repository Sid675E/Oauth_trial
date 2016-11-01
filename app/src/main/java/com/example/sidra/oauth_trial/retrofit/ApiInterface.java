package com.example.sidra.oauth_trial.retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by sidra on 16-10-2016.
 */

public interface ApiInterface {
    ///
    // @GET("/firstt")
    //Call<CustomViewResponse> getJsonFromSid();

    @POST("/gconnect")
    Call<Void> createTask(@Body String task);

    @POST("/users/{username}/{email_id}")
    Call<Void> createUsers(@Path("username") String usrname,@Path("email_id") String emai_id);

    //@Header(Aut)
    @GET("/token")
    Call<ResponseBody> getToken();

    /*@GET("/users")
    void getUsers(
            @Header("Authorization") String auth
            //Callback<Void> callback
    );

    @POST("api/v1/customers")
    Call<UserAPIResponse> userUpdate(@Body UserUpdateRequest userUpdateRequest);*//*

    public interface LoginService {
        @GET("/token")
        Call<Void> basicLogin();
    }*/

}
