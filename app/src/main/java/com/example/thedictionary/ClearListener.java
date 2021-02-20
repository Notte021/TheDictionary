package com.example.thedictionary;

import android.util.Log;
import android.view.View;

public class ClearListener implements View.OnClickListener{
    private MainActivity ma;

    public ClearListener(MainActivity ma){
        this.ma = ma;
    }

    @Override
    public void onClick(View view) {
        Log.d("WORDS","sfdsf");
        ma.edEnglishWord.setText("");
        ma.edGermanWord.setText("");

    }
}
