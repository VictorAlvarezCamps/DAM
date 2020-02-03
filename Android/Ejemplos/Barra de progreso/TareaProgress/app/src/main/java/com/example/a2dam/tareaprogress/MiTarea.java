package com.example.a2dam.tareaprogress;

import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;

import javax.xml.transform.Result;

/**
 * Created by 2dam on 01/12/2016.
 */
public class MiTarea extends AsyncTask <Integer, Integer, String> {

    ProgressBar pb;
    TextView porcentaje;
    TextView MensajeInfo;

    public MiTarea(TextView porcentaje, ProgressBar pb, TextView mensajeInfo){
        this.pb = pb;
        this.porcentaje = porcentaje;
        this.MensajeInfo = mensajeInfo;
    }

    @Override
    protected void onPreExecute() {
        MensajeInfo.setText("Comenzando tarea...");
    }

    @Override
    protected String doInBackground(Integer...params) {
    String resultat="Tarea acabada";
        for(int i=0;i<=params[0];i+=10){
            if(!isCancelled()) {
                try {
                    Thread.sleep(1000);
                    publishProgress(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                resultat="Tarea cancel·lada";
                break;
            }
        }

        return resultat;

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        MensajeInfo.setText("Progeso:");
        porcentaje.setText(values[0]+" %");
        pb.setProgress(values[0]);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        MensajeInfo.setText(s);
    }
}
