package com.example.a2dam.recyclerview;

import android.widget.ImageView;

/**
 * Created by 2dam on 10/11/2016.
 */
public class Calabaza {

    private int img;
    private String dia="";
    private String desc="";

    public Calabaza (int img, String dia, String desc){
        this.img=img;
        this.dia=dia;
        this.desc=desc;
    }

    public int getImg(){

        return img;

    }

    public void setImg(int img){

        this.img=img;

    }

    public String getDia(){

        return dia;

    }

    public void setDia(String dia) {

        this.dia = dia;

    }

    public String getDesc(){

        return desc;

    }

    public void setDesc(String desc){

        this.desc = desc;

    }
}
