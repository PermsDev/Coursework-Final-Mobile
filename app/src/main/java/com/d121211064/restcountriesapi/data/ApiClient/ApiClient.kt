package com.d121211064.restcountriesapi.data.ApiClient

// ApiClient.kt
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.d121211064.restcountriesapi.data.CountryApiService.CountryApiService

object ApiClient {
    private const val BASE_URL = "https://restcountries.com/v3.1/"
    private var retrofit: Retrofit? = null

    fun getApiService(): CountryApiService {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!.create(CountryApiService::class.java)
    }
}
