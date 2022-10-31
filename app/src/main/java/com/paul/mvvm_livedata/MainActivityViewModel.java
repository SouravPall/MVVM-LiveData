package com.paul.mvvm_livedata;

import java.util.Random;

public class MainActivityViewModel {

    private String myRandomNumber;

    public String getMyRandomNumber(){

        if(myRandomNumber==null){

        }

        return myRandomNumber;

    }

    private void createRandomNumber(){
        Random random = new Random();
        myRandomNumber = "My Random Number" + random.nextInt(100-1);
    }
}
