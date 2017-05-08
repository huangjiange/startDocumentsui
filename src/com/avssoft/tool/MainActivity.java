package com.avssoft.tool;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Intent i = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        
        String pkg = "com.android.settings";
        String cls = "com.android.settings.applications.InstalledAppDetails";
         
        i.setComponent(new ComponentName(pkg, cls));
        i.setData(Uri.parse("package:" + "com.android.documentsui"));
        startActivity(i);
        finish();
    }
}
