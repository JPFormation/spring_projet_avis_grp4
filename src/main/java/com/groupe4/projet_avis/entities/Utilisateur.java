package com.groupe4.projet_avis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Utilisateur {

    /**
     * Default constructor
     */
    public Utilisateur() {
    }

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    /**
     * 
     */
    protected String pseudo;

    /**
     * 
     */
    protected String motDePasse;

    /**
     * 
     */
    protected String email;

}