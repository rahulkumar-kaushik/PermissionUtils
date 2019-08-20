package com.grdt.gopics

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.grdt.checkpermissions.PermissionCheck.checkPermissions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intchk= intArrayOf(2,4,6,11)
        val fab = findViewById(R.id.floatingActionButton) as FloatingActionButton
        fab.setOnClickListener {
            if (checkPermissions(this,intchk)) {
                Toast.makeText(
                    applicationContext,
                    "Permission Granted",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Permission Denied",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
