package com.chores.restaurantreview

import retrofit2.Call
import retrofit2.http.*
import java.sql.RowId

interface ApiService {
    @GET("detail/{id}")

    fun getRestaurant(
        @Path("id") id:String
    ): Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id")id: String,
        @Field("name")name: String,
        @Field("review")review: String
    ): Call<PostReviewResponse>

}