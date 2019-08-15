package com.google.androidstudio.motionlayoutexample.mydemo

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.androidstudio.motionlayoutexample.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.motion_my_00.*
import kotlinx.android.synthetic.main.motion_my_00.recyclerview

/**
 * <pre>
 *     author : JX
 *     e-mail : liyayu@ffde.com
 *     time   : 2019/08/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class MyFirstMotionActivity : AppCompatActivity() {
    private val items = (1..20).map { "item $it" }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.motion_my_00)
        ml_root.setDebugMode(MotionLayout.DEBUG_SHOW_PATH)
        recyclerview.run{
            adapter = SimpleAdapter(items)
            layoutManager = LinearLayoutManager(this@MyFirstMotionActivity,RecyclerView.VERTICAL,false)
        }
    }
}