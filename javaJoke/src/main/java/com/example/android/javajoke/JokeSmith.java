package com.example.android.javajoke;

import com.example.android.javawizard.JavaWizard;

public class JokeSmith {
    public String getJoke(){
        JavaWizard javaWizard = new JavaWizard();
        String jokeWizard = javaWizard.getJoke();
        return "This is a joke from joke smith + "+jokeWizard;
    }
}
