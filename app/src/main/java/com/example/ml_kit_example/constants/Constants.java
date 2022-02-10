package com.example.ml_kit_example.constants;

import android.Manifest;

public class Constants {

    public static String pInternetString = Manifest.permission.INTERNET;
    public static String pCameraString = Manifest.permission.CAMERA;
    public static Boolean pInternetGranted = false;
    public static Boolean pCameraGranted = false;
    public static String[] permissionApp = {pInternetString, pCameraString};
    public static int pRequestCodeApp = 111;
    public static int pRequestCodeInternet = 112;
    public static int pRequestCodeCamera = 113;

}
