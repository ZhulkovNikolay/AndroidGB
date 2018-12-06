package ru.gb.weatherfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TemperatureFragment extends Fragment {
private long temperatureId;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.temperature_fragment,container,false);
    }

    public void setTemperature(long id){
        this.temperatureId = id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.temperatureText);
            title.setText("TEST");
            TextView description = (TextView) view.findViewById(R.id.temperatureText);
            description.setText("TEST");
        }
    }
}
