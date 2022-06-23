package edu.escuelaing.arem.fijaspicas.app.model;

import com.sun.jndi.cosnaming.CNCtx;

public class Cantidades {
    public Cantidades(){}
    private int picas = 0;
    private int fijas = 0;

    public int getPicas() {
        return picas;
    }

    public int getFijas() {
        return fijas;
    }

    public void setPicas(int picas){
        this.picas +=picas;
    }
    public void setFijas(int fijas){
        this.fijas += fijas;
    }

}
