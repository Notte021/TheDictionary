package com.example.thedictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "WORDS";
    private static int counter = 0;


    EditText edGermanWord;
    EditText edEnglishWord;
    EditText edInputWord;
    private Button btnetg;
    private Button btngte;
    private Button btnclear;

    private ArrayList<Word> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        edInputWord = findViewById(R.id.input_word);

        edGermanWord = findViewById(R.id.german_word);
        edEnglishWord = findViewById(R.id.english_word);

        btngte = findViewById(R.id.g_t_e);
        btngte.setOnClickListener(this);

        btnetg = findViewById(R.id.e_t_g);
        btnetg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Word w = words.get(1);
                edEnglishWord.setText(w.englishWord.toString());

            }
        });

        btnclear = findViewById(R.id.clear);
        btnclear.setOnClickListener(new ClearListener(this));

        initDictionary();




    }

    private void initDictionary(){


        words.add(new Word("Maus", "mouse"));
        words.add(new Word("Pferd", "horse"));
        words.add(new Word("Löwe" , "lion"));

    }

    @Override
    public void onClick(View v) {
 //      Word w = words.get(0);

    //    edGermanWord.setText(w.germanWord.toString());
   // String inhalt = edInputWord.getText().toString();
    //edGermanWord.setText(edInputWord.getText().toString());     // Eingache text ausgabe

        for (Word w :words){
            if(w.englishWord.equals(edInputWord))
            {   Word wa = words.get(0);
                edGermanWord.setText(w.germanWord.toString());
            }
        }

    }
}