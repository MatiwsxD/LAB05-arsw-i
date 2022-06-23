package edu.escuelaing.arem.fijaspicas.app.persistence;

import edu.escuelaing.arem.fijaspicas.app.model.Cantidades;

import java.util.ArrayList;
import java.util.Arrays;

public class FijasPicas {
    private static FijasPicas instancia = null;
    private static ArrayList<Integer> arregloNum = null;

    private FijasPicas(){
        arregloNum = new ArrayList<Integer>();

        while (arregloNum.size()<5){
            Integer x = (int)(Math.random()*10);
            if(!arregloNum.contains(x)){
                arregloNum.add(x);
            }
        }


    }
    public static void setInstancia(){
        instancia = null;
    }
    public static FijasPicas getInstance(){
        if(instancia == null){
            instancia = new FijasPicas();
        }
        return instancia;
    }

    public Cantidades setCantidades(ArrayList<Integer> respuestasUsuario){
        Cantidades x = new Cantidades();
        System.out.println(arregloNum.toString());
        for (int i = 0; i<5;i++){
            if(arregloNum.get(i) == respuestasUsuario.get(i)){
                x.setFijas(1);
            }
            else if (arregloNum.contains(respuestasUsuario.get(i))) {
                x.setPicas(1);
            }
        }
        return x;
    }

}
