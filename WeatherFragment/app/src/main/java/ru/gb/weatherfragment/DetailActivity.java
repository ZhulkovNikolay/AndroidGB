package ru.gb.weatherfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public static final String TEMPERATURE_ID = "id";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TemperatureFragment temperatureFragment = (TemperatureFragment)getSupportFragmentManager().findFragmentById(R.id.temperatureText);
        int temperatureId = (int) getIntent().getExtras().get(TEMPERATURE_ID);
        temperatureFragment.setTemperature(temperatureId);
    }
}
