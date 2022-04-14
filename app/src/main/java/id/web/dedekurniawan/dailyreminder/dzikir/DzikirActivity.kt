package id.web.dedekurniawan.dailyreminder.dzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import id.web.dedekurniawan.dailyreminder.R
import id.web.dedekurniawan.dailyreminder.databinding.ActivityDzikirBinding

class DzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: DzikirViewModel = ViewModelProvider.AndroidViewModelFactory(application).create(DzikirViewModel::class.java)

        val binding: ActivityDzikirBinding = DataBindingUtil.setContentView(this, R.layout.activity_dzikir)

        binding.viewModel = viewModel

        viewModel.dzikirCounter.observe(this, Observer {
            binding.counterText.text = it.toString()
        })
    }
}