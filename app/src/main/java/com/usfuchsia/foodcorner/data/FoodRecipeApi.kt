package com.usfuchsia.foodcorner.data

import com.usfuchsia.foodcorner.model.FoodRecipes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipeApi {
    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap query: Map<String, String>
    ): Response<FoodRecipes>
}