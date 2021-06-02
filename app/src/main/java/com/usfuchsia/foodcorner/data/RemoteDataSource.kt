package com.usfuchsia.foodcorner.data

import com.usfuchsia.foodcorner.data.network.FoodRecipeApi
import com.usfuchsia.foodcorner.model.FoodRecipes
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipeApi: FoodRecipeApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipes> {
        return foodRecipeApi.getRecipes(queries)
    }
}