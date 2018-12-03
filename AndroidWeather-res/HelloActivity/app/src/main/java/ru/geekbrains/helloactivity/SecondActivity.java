package ru.geekbrains.helloactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DeliverBox deliverBox = getIntent().getParcelableExtra(DeliverBox.class.getCanonicalName());
        TextView textView = findViewById(R.id.textView);
        textView.setText(deliverBox.text);

        TextView weatherOut = findViewById(R.id.activity_second);
        weatherOut.setText(getResources().getString(R.string.weatherStatement));
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonBack:
                Intent intentResult = new Intent();
                setResult(Activity.RESULT_OK, intentResult);

                finish();
                break;

            default:
                break;
        }
    }

}
