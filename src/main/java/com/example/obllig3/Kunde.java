package com.example.obllig3;

public class Kunde {
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;

    private String antall;

    private String film;

    public Kunde(){

    }
    public Kunde(String fornavn, String etternavn,String telefonnr, String epost, String film, String antall) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
        this.antall = antall;
        this.film = film;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getAntall() {
        return antall;
    }

    public String getFilm() {
        return film;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public void setFilm(String film) {
        this.film = film;
    }
}
