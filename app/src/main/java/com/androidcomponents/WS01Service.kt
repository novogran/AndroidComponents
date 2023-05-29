package com.androidcomponents

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast
import java.util.Timer
import kotlin.concurrent.timerTask

class WS01Service : Service() {

    private val timer = Timer()

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Service starts", Toast.LENGTH_SHORT).show()
        timer.scheduleAtFixedRate(
            timerTask {}, 500, 1000
        )
        return START_STICKY
    }

    override fun onDestroy() {
        Toast.makeText(this, "Service stopped", Toast.LENGTH_SHORT).show()
        timer.cancel()
    }
}