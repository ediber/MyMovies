package com.mymovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View myButton;
    private TextView text;
    private EditText edit;
    private Button openActivity;
    private View button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        text = findViewById(R.id.textView);
        edit = findViewById(R.id.editText);
        openActivity = findViewById(R.id.btn_open_activity);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Printer prt = new Printer();
                //prt.print(getApplicationContext());

                new Printer().print(getApplicationContext());


            }
        });

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edit.getText().toString();
                text.setText(str);
            }
        });


        openActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
                String str = text.getText().toString();
                myIntent.putExtra(Names.KEY1 , str); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

        String str = getResources().getString(R.string.text_name);
        text.setText(str);

        RecyclerView recycler = findViewById(R.id.recycler);
        MyAdapter adapter = new MyAdapter(getApplicationContext());
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "pause", Toast.LENGTH_LONG).show();
        Log.d("Main activity", "pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "stop", Toast.LENGTH_LONG).show();
        Log.d("Main activity", "stop");
    }
}
