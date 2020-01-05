package com.mymovies;

import android.content.Context;
import android.widget.Toast;

public class Printer implements IPrinter{

    public Printer(){

    }

    public void print(Context context){
        Toast.makeText(context, "This is my Toast message!", Toast.LENGTH_LONG).show();
    }
}
