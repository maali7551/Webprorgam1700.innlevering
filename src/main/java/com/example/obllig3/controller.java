package com.example.obllig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {

    //public final List<Kunde> Registering = new ArrayList<>();
    @Autowired
    private KundeRespository rep;


    @GetMapping("/lagrekunder")
    public void lagrekunde(Kunde nykunde){
        rep.LagreBilett(nykunde);
    }

    @GetMapping("/hent")
    public List<Kunde> visKjop(){
        return rep.HentAlleKunder();
    }

    @GetMapping("/Slett")
    public void Slett() {
        rep.SlettBilett();
    }

}

