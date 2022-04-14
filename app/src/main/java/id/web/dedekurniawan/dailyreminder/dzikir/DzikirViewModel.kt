package id.web.dedekurniawan.dailyreminder.dzikir

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DzikirViewModel: ViewModel() {
    private val _dzikirCounter = MutableLiveData<Int>()
    val dzikirCounter: LiveData<Int> = _dzikirCounter

    init {
        _dzikirCounter.value = 0
    }

    fun increaseCounter(){
        _dzikirCounter.value = _dzikirCounter.value?.plus(1)
    }

    fun reset(){
        _dzikirCounter.value = 0
    }

    companion object{
        const val DZIKIR_EXTRA = "id.web.dedekurniawan.dailyreminder.dzikir.DZIKIR_EXTRA"
    }
}