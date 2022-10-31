package com.paul.mvvm_livedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView_id);
        btn1 = findViewById(R.id.button_id);

        MainActivityViewModel model = new MainActivityViewModel();
       String  myRandomNumber = model.getMyRandomNumber();
        tv1.setText(myRandomNumber);
    }
}