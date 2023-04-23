package it.develhope.Esercitazione.Hibernate3.controller;

import it.develhope.Esercitazione.Hibernate3.entities.Auto;
import it.develhope.Esercitazione.Hibernate3.entities.Concessionaria;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conc")
public class ConcessionariaController {

    @Autowired
    private Concessionaria concessionaria;

    @GetMapping("/welcome")
    public String getWelcome(){
        return "Benvenuto nel sito della concessionaria";
    }

    @GetMapping("/getauto")
    public Auto getAuto(@RequestParam (required = true) int id_auto){
        for(Auto auto : concessionaria.getAutoInVendita()){
            if(id_auto==auto.getId()){
                return auto;
            }
        } throw new IllegalArgumentException();
    }

}
