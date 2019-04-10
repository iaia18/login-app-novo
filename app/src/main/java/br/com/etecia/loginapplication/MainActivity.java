package br.com.etecia.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonEntrar = findViewById(R.id.Entrar);
        buttonEntrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView textLogin = findViewById(R.id.Login);
                TextView textSenha = findViewById(R.id.Senha);
                String username = textLogin.getText().toString();
                String password = textSenha.getText().toString();

                if ("ETECIA".equals(username)&& "2380".equals(password)){

                    Intent intentGoHome=new Intent(MainActivity.this,
                            MainActivity.class);
                    startActivity(intentGoHome);
                }
                else{

                    alert ("Login with error");

                }

            }

            private void alert(String message){
                Toast.makeText(context: this,message, Toast.LENGTH_SHORT).show();
            } {
            }

        });
    }
}

