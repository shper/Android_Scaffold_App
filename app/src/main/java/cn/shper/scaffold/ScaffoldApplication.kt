package cn.shper.scaffold

import android.app.Application
import cn.shper.tklogger.TKLogger

/**
 * Author : Shper
 * EMail : me@shper.cn
 * Date : 2021/12/07
 */
class ScaffoldApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    TKLogger.setup(tag = "Scaffold")
  }

}