package com.plcoding.backgroundlocationtracking


import android.content.Context
import android.content.pm.PackageManager

fun Context.hasPermissions() =
    REQUIRED_PERMISSIONS.all {
        checkSelfPermission(it) == PackageManager.PERMISSION_GRANTED
    }
