package com.usfuchsia.foodcorner.model


import com.google.gson.annotations.SerializedName

data class FoodRecipes(
    @SerializedName("number")
    val number: Int,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("totalResults")
    val totalResults: Int
)