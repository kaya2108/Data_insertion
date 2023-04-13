package com.example.data_insertion;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface EntryAPI {
    @FormUrlEncoded
    @POST("exec")
    Call<Model> createPost(
            @Query("action") String fxn,
            @Field("name") String name,
            @Field("regNo") String regNo,
            @Field("phone") String phone,
            @Field("year") String year,
            @Field("branch") String branch,
            @Field("size") String size,
            @Field("amtPaid") String amtPaid
    );
}
