package com.example.trabalho_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario = (EditText)findViewById(R.id.usuario);
    EditText senha = (EditText)findViewById(R.id.senha);
    Button btn_login = (Button)findViewById(R.id.botao1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v){
        if(usuario.getText().toString().equals("admin") && senha.getText().toString().equals("senha123")){
            Intent i = new Intent(MainActivity.this,activity_home.class);
            Bundle user = new Bundle();
            user.putBoolean("isLogged", true);
            user.putString("nome", usuario.getText().toString());

            i.putExtras(user);
            startActivity(i);
        }else{
            Toast.makeText(MainActivity.this,"Usuário ou senha está incorreto!", Toast.LENGTH_LONG).show();
        }
    }
}