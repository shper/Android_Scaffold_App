package cn.shper.scaffold

import android.app.Application
import cn.shper.tklogger.TKLogger
import cn.shper.tklogger.destination.TKLogConsoleDestination

/**
 * Author : Shper
 * EMail : me@shper.cn
 * Date : 2021/12/07
 */
class ScaffoldApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        setupLibrary()
    }

    private fun setupLibrary() {
        TKLogger.setup(tag = "Android_Scaffold")
        TKLogger.addDestination(TKLogConsoleDestination())
    }

}