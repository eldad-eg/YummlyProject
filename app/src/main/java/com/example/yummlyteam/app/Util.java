package com.example.yummlyteam.app;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class Util {
    public static final double DOUBLE_EQUALITY_DEFAULT_EPSILON = 0.001d;

    public static boolean isNetworkConnectionAvailable(Context context) {
        boolean isNetworkConnectionAvailable = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            isNetworkConnectionAvailable = (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED);
        }
        return isNetworkConnectionAvailable;
    }

    public static String timeFormatter(Integer timeInSeconds) {
        int min = timeInSeconds / 60;
        if (min >= 60) {
            int hour = min/60;
            return String.valueOf(hour) + "h";
        }
        return String.valueOf(min) + "m";

    }

    public static boolean doublesEqual(Double a, Double b) {
        return doublesEqual(a, b, DOUBLE_EQUALITY_DEFAULT_EPSILON);
    }

    public static boolean doublesEqual(Double a, Double b, Double epsilon) {
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        } else {
            return Math.abs(a - b) <= epsilon;
        }
    }

}
