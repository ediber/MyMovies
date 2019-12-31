package com.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text2 = findViewById(R.id.textView2);

        String str = getIntent().getStringExtra(Names.KEY1);
        text2.setText(str);
    }

/*    @Override
    public void onBackPressed() {
      super.onBackPressed();
        Toast.makeText(getApplicationContext(),"dont want to close", Toast.LENGTH_LONG).show();
    }*/
}
