package com.grdt.checkpermissions;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import static com.grdt.checkpermissions.Constants.PERMISSIONS;

public class PermissionCheck extends AppCompatActivity {

    public static boolean checkPermissions(Activity c, int[] pchk) {
        List<String> permissionlist=new ArrayList<>();

            for (int i : pchk) {
                if (ContextCompat.checkSelfPermission(c, PERMISSIONS[i - 1])
                        != PackageManager.PERMISSION_GRANTED) {
                    permissionlist.add(PERMISSIONS[i -
                            1]);
                }
            }

        if(!permissionlist.isEmpty()) {
            ActivityCompat.requestPermissions(c,permissionlist.toArray(new String[permissionlist.size()]), 101);
            return false;
        }
        return true;
    }
}
