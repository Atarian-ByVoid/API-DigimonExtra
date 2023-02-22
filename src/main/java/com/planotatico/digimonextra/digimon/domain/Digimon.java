package com.planotatico.digimonextra.digimon.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Digimon {
    @JsonInclude(Include.NON_NULL)
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonInclude(Include.NON_NULL)
    private String nameDigimon;
    @JsonInclude(Include.NON_NULL)
    private String levelDigimon;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNameDigimon() {
        return nameDigimon;
    }
    public void setNameDigimon(String nameDigimon) {
        this.nameDigimon = nameDigimon;
    }
    public String getLevelDigimon() {
        return levelDigimon;
    }
    public void setLevelDigimon(String levelDigimon) {
        this.levelDigimon = levelDigimon;
    }

    
}
