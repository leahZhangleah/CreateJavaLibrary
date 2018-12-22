package com.example.android.createjavalibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.javajoke.JokeSmith;
import com.example.android.javawizard.JavaWizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        JokeSmith jokeSmith = new JokeSmith();
        JavaWizard javaWizard = new JavaWizard();
        textView.setText(jokeSmith.getJoke()+"\n"+
                "This is another dependency on java wizard text"
                +"\n" + javaWizard.getJoke());

    }
}
