package id.web.dedekurniawan.dailyreminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.web.dedekurniawan.dailyreminder.dzikir.DzikirActivity
import id.web.dedekurniawan.dailyreminder.dzikir.DzikirViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, DzikirActivity::class.java).apply {
            putExtra(DzikirViewModel.DZIKIR_EXTRA, DzikirViewModel.DZIKIR_EXTRA)
        }
        startActivity(intent)
    }
}