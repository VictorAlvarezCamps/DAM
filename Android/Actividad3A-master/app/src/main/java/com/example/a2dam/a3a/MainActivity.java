package com.example.a2dam.a3a;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button anyadir;
    Button mostrar;
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView)findViewById(R.id.texto);
        anyadir = (Button)findViewById(R.id.anyadir);
        mostrar = (Button)findViewById(R.id.mostrar);
        mensaje = (TextView)findViewById(R.id.mensaje);

        final String FILE_NAME ="fich.txt";

        anyadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream fos = openFileOutput(FILE_NAME, Context.MODE_APPEND);
                    String cadenaOutput = new String(texto.getText().toString());
                    DataOutputStream dos = new DataOutputStream(fos);
                    dos.writeBytes(cadenaOutput);
                    fos.close();
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileInputStream fin = openFileInput(FILE_NAME);
                    DataInputStream dis = new DataInputStream(fin);
                    byte[] buff = new byte[1000];
                    dis.read(buff);
                    mensaje.setText(new String(buff));
                    Toast.makeText(getApplicationContext(),"He leído "+new String(buff),Toast.LENGTH_LONG).show();

                    fin.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
