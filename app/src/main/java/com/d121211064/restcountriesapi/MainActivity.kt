// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.d121211064.restcountriesapi.R
import com.d121211064.restcountriesapi.data.ApiClient.ApiClient
import com.d121211064.restcountriesapi.data.Country.Country
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menggunakan Retrofit untuk mendapatkan data dari API
        val apiService = ApiClient.getApiService()
        val call: Call<List<Country>> = apiService.getCountries()

        call.enqueue(object : Callback<List<Country>> {
            override fun onResponse(call: Call<List<Country>>, response: Response<List<Country>>) {
                if (response.isSuccessful) {
                    val countries: List<Country>? = response.body()
                    // Lakukan sesuatu dengan data negara
                } else {
                    // Tangani respon tidak berhasil
                }
            }

            override fun onFailure(call: Call<List<Country>>, t: Throwable) {
                // Tangani kesalahan koneksi atau kegagalan permintaan
            }
        })
    }
}
