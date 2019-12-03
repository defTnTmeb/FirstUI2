package com.example.firstui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    //public static ArrayList<String> responseFromApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("");
        //for (int i = 0; i < responseFromApi.size(); i++) {
        //    textView.append(responseFromApi.get(i));
        //    textView.append("\n");
        //}
        Button button = findViewById(R.id.returnButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
