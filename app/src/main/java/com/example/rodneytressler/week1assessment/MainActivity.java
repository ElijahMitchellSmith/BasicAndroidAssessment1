package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private Button newbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.submit_button);
        textView = findViewById(R.id.text_view);
        editText = findViewById(R.id.edit_text);
        newbutton = findViewById(R.id.traveler_button);

        startListener();
        gohome();
    }

    private void startListener() {
        button.setOnClickListener(new View.OnClickListener() {
            private String textinput = String.valueOf(R.string.hint);

            @Override
            public void onClick(View v) {
                textView.setText("textinput");
                editText.setText("");
                Toast.makeText(MainActivity.this, "Android is Fun!", Toast.LENGTH_SHORT).show();



            }
        });
    }
    private void maintwo() {
        Intent maintwo = new Intent(this,Main2Activity.class);
        startActivity(maintwo);
        finish();
    }
    private void gohome() {
        newbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maintwo();
            }
        });
    }


}
