package com.mathilde.checkpermissions;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * @author mathilde on 19/01/16.
 */
public class Permissions extends Application {

    public static void checkPermission(Activity a, String[] listPermissions) {
        int permissionCheck = ContextCompat.checkSelfPermission(a,
                Manifest.permission.READ_CONTACTS);
        if(permissionCheck != PackageManager.PERMISSION_GRANTED) {
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(a,
                    Manifest.permission.READ_CONTACTS)) {

                // Show an expanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                try {

                    ActivityCompat.requestPermissions(a,
                            listPermissions,
                            Constants.PERMISSION_REQUEST_INTERNET);
                    //new String[]{Manifest.permission.READ_CONTACTS},
                } catch (Exception e ) {
                    e.printStackTrace();
                }
                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }
    }
}
