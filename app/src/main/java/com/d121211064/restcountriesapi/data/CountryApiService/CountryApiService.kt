package com.d121211064.restcountriesapi.data.CountryApiService

import com.d121211064.restcountriesapi.data.Country.Country
import retrofit2.Call
import retrofit2.http.GET

interface CountryApiService {
    @GET("all")
    fun getCountries(): Call<List<Country>>
}