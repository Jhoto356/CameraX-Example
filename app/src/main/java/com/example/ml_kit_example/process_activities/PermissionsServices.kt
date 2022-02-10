package com.example.ml_kit_example.process_activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

import com.example.ml_kit_example.constants.Constants.*
import pub.devrel.easypermissions.EasyPermissions

class PermissionsServices (private val context: Context): AppCompatActivity(){

     private fun verifyPermissionInternet (): Boolean {
        pInternetGranted = EasyPermissions.hasPermissions(context, pInternetString)
        return pInternetGranted
    }

    private fun verifyPermissionCamera (): Boolean {
        pCameraGranted = EasyPermissions.hasPermissions(context, pCameraString)
        return pCameraGranted
    }

    fun requestPermissionApp (activity: AppCompatActivity) {
        val rationale: String
        if (!verifyPermissionInternet() && !verifyPermissionCamera()){
            rationale = "Camera and Internet"
            EasyPermissions.requestPermissions(activity, rationale, pRequestCodeInternet, pInternetString)
            EasyPermissions.requestPermissions(activity, rationale, pRequestCodeInternet, pCameraString)
        } else if (verifyPermissionInternet() && !verifyPermissionCamera()) {
            rationale = "Camera"
            EasyPermissions.requestPermissions(activity, rationale,
                pRequestCodeInternet,
                pCameraString
            )
        } else {
            rationale = "Internet"
            EasyPermissions.requestPermissions(activity, rationale, pRequestCodeInternet, pInternetString)
        }
    }

}