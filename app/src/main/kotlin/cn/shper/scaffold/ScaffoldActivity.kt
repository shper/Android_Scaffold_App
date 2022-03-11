package cn.shper.scaffold

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scaffold.*

/**
 * Author : Shper
 * EMail : me@shper.cn
 * Date : 2021/12/07
 */
class ScaffoldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scaffold)

        action_button.setOnClickListener {
            hello_text.text = "Hello Android!"
        }
    }

}