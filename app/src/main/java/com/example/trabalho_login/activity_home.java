package com.example.trabalho_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_home extends AppCompatActivity {

    TextView texto = (TextView)findViewById(R.id.bemVindo);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle b = getIntent().getExtras();
        texto.setText(texto.getText() + " " + b.getString("nome"));
    }

    public void logout(View v){
        Intent i = new Intent(activity_home.this,MainActivity.class);
        startActivity(i);
    }
}