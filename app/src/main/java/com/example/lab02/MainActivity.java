package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtUsuario = findViewById(R.id.edtUsuario);
        EditText edtPassword = findViewById(R.id.edtPassword);
        TextView txtMensaje = findViewById(R.id.txtMensaje);
        Button btnLogin = (Button) findViewById(R.id.button);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String usuario = edtUsuario.getText().toString();
                String password = edtPassword.getText().toString();
                if(usuario.equals("test") && password.equals("1234")){
                    Log.d(TAG,"valido,"+usuario+","+password);
                    txtMensaje.setText("Autenticacion valida");
                } else {
                    txtMensaje.setText("Autenticacion no valida");
                    Log.d(TAG,"invalido,"+usuario+","+password);
                }
            }
        });
    }
}