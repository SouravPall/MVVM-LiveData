package com.paul.mvvm_livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView tv1;

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView_id);
        btn1 = findViewById(R.id.button_id);

        MainActivityViewModel model = new ViewModelProvider(this).get(MainActivityViewModel.class);
        
       String  myRandomNumber = model.getMyRandomNumber();
       tv1.setText(myRandomNumber);
        Log.i(TAG, "Random Number Set");
    }
}