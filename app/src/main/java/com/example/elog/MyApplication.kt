package com.example.elog

import android.app.Application
import android.util.Log
import com.android.lipy.elog.ELog
import com.android.lipy.elog.ELogConfigs
import java.text.SimpleDateFormat

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //init
        val configs = ELogConfigs.Builder()
                .setTag("MyTestConfigs")
                .enableLogcat()
                .enableDiskLog()
                .setDiskTag("TestDiskTagA")
                .setLogcatTag("TestLogcatTagA")
                .setLogcatMethodCount(7)
                .setDiskDateFormat(SimpleDateFormat("yyyy.MM.dd HH:mm"))
                .setLogcatDebugPriority(Log.VERBOSE)
                .setDiskDebugPriority(ELogConfigs.DEBUG_STOP)
                .build()
        ELog.init(configs)
    }
}