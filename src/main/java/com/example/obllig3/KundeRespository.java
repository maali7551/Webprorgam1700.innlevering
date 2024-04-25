package com.example.obllig3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KundeRespository {

    @Autowired
    private JdbcTemplate db;

    public void LagreBilett(Kunde innBilett){
        String SQL = "INSERT INTO Kunde (film,antall,fornavn,etternavn,telefonnr,epost) VALUES(?,?,?,?,?,?);";
        db.update(SQL,innBilett.getFilm(), innBilett.getAntall(), innBilett.getFornavn(), innBilett.getEtternavn(), innBilett.getTelefonnr(), innBilett.getEpost());
    }
    public List<Kunde> HentAlleKunder(){
        String SQL = "SELECT * FROM Kunde";
        List<Kunde> allekjop = db.query(SQL, new BeanPropertyRowMapper<>(Kunde.class));
        return allekjop;
    }
    public void SlettBilett(){
        String SQL = "DELETE FROM Kunde";
        db.update(SQL);
    }

}
