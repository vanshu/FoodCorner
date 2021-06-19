package com.usfuchsia.foodcorner.util

import android.content.Context
import android.content.pm.PackageManager

fun getVersionName(context: Context): String {
    val versionName: String
    try {
        versionName = context.packageManager.getPackageInfo(context.packageName, 0).versionName
    } catch (e: PackageManager.NameNotFoundException) {
        return ""
    }
    return versionName
}