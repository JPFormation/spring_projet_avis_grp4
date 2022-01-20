package com.groupe4.projet_avis.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 */
@Entity
@Getter
@Setter
public class Joueur extends Utilisateur {

    /**
     * Default constructor
     */
    public Joueur() {
    }

    /**
     * 
     */
    private LocalDate dateDeNaissance;

    /**
     * 
     */
    private Set<Avis> avis;

}