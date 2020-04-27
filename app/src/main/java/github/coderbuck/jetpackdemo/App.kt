package github.coderbuck.jetpackdemo

import android.app.Application
import github.coderbuck.jetpackdemo.livedata.NvData
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(object : Timber.DebugTree() {
            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                super.log(priority, "kd-$tag", message, t)
            }
        })

        initGlobalObserve()
    }

    // 全局监听 LiveData
    fun initGlobalObserve() {

        NvData.screenNum.observeForever {screenNum ->
            Timber.d("screenNum = $screenNum")
        }
    }
}