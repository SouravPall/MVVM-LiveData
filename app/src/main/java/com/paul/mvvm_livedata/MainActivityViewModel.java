package com.paul.mvvm_livedata;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String myRandomNumber;
    private String TAG = this.getClass().getSimpleName();

    public String getMyRandomNumber(){

        Log.i(TAG, "get My Random Number");

        if(myRandomNumber==null)
        {

            createRandomNumber();
        }

        return myRandomNumber;

    }

    private void createRandomNumber(){
        Random random = new Random();
        myRandomNumber = "My Random Number: " + random.nextInt(100-1);
        Log.i(TAG, "create Random Number");
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel Destroyed");
    }
}
