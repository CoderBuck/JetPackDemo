package github.coderbuck.jetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import github.coderbuck.jetpackdemo.lifecycles.MyLifecyclesListener
import github.coderbuck.jetpackdemo.livedata.NvData
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("ON_CREATE")
        setContentView(R.layout.activity_main)

//        lifecycle.addObserver(MyLifecyclesListener())
        NvData.screenNum.observe(this, Observer { Timber.d("onChanged $it") })
        NvData.screenNum.postValue(1000)

        var i = 1
        btn.setOnClickListener {
            Thread {
//                i++
                NvData.screenNum.postValue(i)
            }.start()
        }
    }

//    override fun onStart() {
//        super.onStart()
//        Timber.d("ON_START")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Timber.d("ON_STOP")
//    }


}
