package com.example.silva.mj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//le structure relationnel avec ma base des donnes 
@Entity
public class Evenements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String village;
    private String film;
    private String date;

    public Evenements() {
    }
    //assignation des super attribus avec les parametres de mon method
    public Evenements(int id, String village, String film, String date) {
        this.id = id;
        this.village = village;
        this.film = film;
        this.date = date;
    }

//getters et setters des attribus
    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * @param village the village to set
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * @return String return the film
     */
    public String getFilm() {
        return film;
    }

    /**
     * @param film the film to set
     */
    public void setFilm(String film) {
        this.film = film;
    }


    /**
     * @return int return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

}