package edu.escuelaing.arem.fijaspicas.app.services;

import edu.escuelaing.arem.fijaspicas.app.model.Cantidades;
import edu.escuelaing.arem.fijaspicas.app.persistence.FijasPicas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("sPicasFijas")
public class servicesPicasFijas {
    private static Integer intentos = 0;
    public Cantidades servPf(ArrayList<Integer> arreglo){
        System.out.println(intentos);
        if(intentos<10){
            intentos++;
            FijasPicas x = FijasPicas.getInstance();
            return x.setCantidades(arreglo);
        }
        else {
            intentos = 0;
            FijasPicas.setInstancia();
            FijasPicas x = FijasPicas.getInstance();
            return x.setCantidades(arreglo);
        }


    }
    public static void win(){
        intentos = 100;
    }




}
