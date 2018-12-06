package ru.gb.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImageFragment2 extends Fragment {

    private static final String TAG = "GBLogs";

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "запущен onAttach() ImageFragment2");
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG,"запущен onCreateView() ImageFragment2");
        return inflater.inflate(R.layout.image2, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "запущен onActivityCreated() ImageFragment2");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "запущен onStart() ImageFragment2");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "запущен onResume() ImageFragment2");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "запущен onPause() ImageFragment2");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "запущен onPause() ImageFragment2");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "запущен onDestroyView() ImageFragment2");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,"запущен onDestroy() ImageFragment2");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG,"запущен onDetach() ImageFragment2");
        super.onDetach();
    }
}
