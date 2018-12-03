package ru.geekbrains.helloactivity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class StartSecondActivity implements View.OnClickListener {

    private final Activity sourceActivity;

    public StartSecondActivity(Activity sourceActivity){
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        // Формируем посылку
        EditText txt = sourceActivity.findViewById(R.id.editText);
        intent.putExtra(DeliverBox.class.getCanonicalName(), new DeliverBox(txt.getText().toString()));    // Отправляем посылку
        sourceActivity.startActivityForResult(intent, 1);
    }
}

