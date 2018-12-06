package ru.gb.fragmentlifecycle;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "GBLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "запущен onCreate() MainActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change(View view) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.button1:
                fragment = new ImageFragment1();
                break;
            case R.id.button2:
                fragment = new ImageFragment2();
                break;
        }

        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.main_fragment, fragment);
        ft.commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "запущен onSaveInstanceState() MainActivity");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "запущен onRestoreInstanceState() MainActivity");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "запущен onStart() MainActivity");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "запущен onResume() MainActivity");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "запущен onPause() MainActivity");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "запущен onStop() MainActivity");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "запущен onRestart() MainActivity");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "запущен onDestroy() MainActivity");
        super.onDestroy();
    }
}
