package idlework.eegreader.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import idlework.eegreader.generics.GenericApplication;

public class ConnectionUtils {
  public static boolean isConnectedToInternet() {
    ConnectivityManager connectivityManager = (ConnectivityManager) GenericApplication.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting());
  }
}
