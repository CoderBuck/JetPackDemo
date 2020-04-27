package github.coderbuck.jetpackdemo.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object NvData {

    var screenNum : CustomLiveData<Int> = CustomLiveData<Int>().default(10)

//    init {
////        screenNum.postValue(100)
//        screenNum.value= 100
//    }

}