package github.coderbuck.jetpackdemo.lifecycles

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

class MyLifecycleOwner : LifecycleOwner {

    val lifecycleRegistry = LifecycleRegistry()

    override fun getLifecycle(): Lifecycle {

    }
}