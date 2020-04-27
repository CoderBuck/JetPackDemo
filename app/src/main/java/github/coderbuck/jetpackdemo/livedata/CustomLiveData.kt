package github.coderbuck.jetpackdemo.livedata

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import timber.log.Timber

class CustomLiveData<T> : MutableLiveData<T>() {

    override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        super.observe(owner, observer)
        if (value == null) {
            // 请求业务
            Timber.d("value == null")
        } else {
            Timber.d("value != null")
        }
    }



}

fun <T> CustomLiveData<T>.default(initialValue: T) = apply { setValue(initialValue) }
