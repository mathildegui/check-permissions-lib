package com.mathilde.libcheckpermissions;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mathilde.checkpermissions.Permissions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] m = new String[]{ Manifest.permission.WRITE_CONTACTS, Manifest.permission.READ_CONTACTS,Manifest.permission.CAMERA};
        Permissions.checkPermission(this, m);
    }
}
