package edu.escuelaing.arem.fijaspicas.app.controller;


import edu.escuelaing.arem.fijaspicas.app.services.servicesPicasFijas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/game")
public class picasyfijasController {
    int intentos = 0;
    @Autowired
    servicesPicasFijas servicios;
   @GetMapping(value = "/info")
    public ResponseEntity<?> getPlayers(@RequestParam(value = "resp") String resp){

       ArrayList<Integer> respuestas = new ArrayList<Integer>();
       for(int i = 0; i<5;i++){
           respuestas.add(Integer.parseInt(String.valueOf(resp.charAt(i))));
       }
       return new ResponseEntity<>(servicios.servPf(respuestas), HttpStatus.ACCEPTED);

   }

   @GetMapping("/win")
    public ResponseEntity<?> win(){
       System.out.println("Gano");
       servicios.win();
       return new ResponseEntity<>("Congratulation",HttpStatus.ACCEPTED);
   }

}
