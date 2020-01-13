/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.auth;

import com.karimandco.bdd.DaoSIO;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Damien F, Pawel R
 */
public class CurriculumVitae {

    private static CurriculumVitae monUtilisateur = null;

    private static Integer identifiant;
    private ArrayList<Integer> idCv = new ArrayList<>();

    private Boolean aUnCv = false;

    private Integer id;

    private CurriculumVitae() {
        identifiant = Utilisateur.getInstance().getId();
        chargerInformationsCv();
    }

    public static Integer getIdentifiant() {
        return identifiant;
    }

    public static void setIdentifiant(Integer identifiant) {
        CurriculumVitae.identifiant = identifiant;
    }

    /**
     * Cette méthode renvoie la propriété estConnecte.
     *
     * @return Boolean true or false
     */
    public Boolean getaUnCv() {
        return aUnCv;
    }

    /**
     * Cette méthode permet de définir la propriété estConnecte.
     *
     * @param aUnCv Boolean true or false
     */
    public void setaUnCv(Boolean aUnCv) {
        this.aUnCv = aUnCv;
    }

    public Integer getId() {
        return id;
    }

    public ArrayList<Integer> getIdCv() {
        return idCv;
    }

    public void setIdCv(ArrayList<Integer> idCv) {
        this.idCv = idCv;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Permet d'obtenir l'objet instancié.
     *
     * @return un Objet Utilisateur
     */
    public static CurriculumVitae getInstance() {
        if (CurriculumVitae.monUtilisateur == null) {
            CurriculumVitae.monUtilisateur = new CurriculumVitae();
        }
        return CurriculumVitae.monUtilisateur;
    }

    /**
     * Cette méthode permet d'initialiser les propriétés contenant les
     * informations de l'utilisateur en fesant une requête à la bdd avec
     * l'identifiant de l'utilisateur et de mettre true à la propriété
     * estConnecte.
     */
    public void chargerInformationsCv() {
        if (CurriculumVitae.identifiant != null) {
            ResultSet lesResultats = DaoSIO.getInstance().requeteSelection("SELECT id FROM cv WHERE id_utilisateur='" + CurriculumVitae.identifiant + "'");
            try {
                while (lesResultats.next()) {
                    idCv.add(lesResultats.getInt("id"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(CurriculumVitae.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Cette méthode permet de mettre à jour les informations de l'utilisateur
     * sur la bdd et renvoie un booléen si la maj a été réussie.
     *
     * @return Boolean true or false
     */
    /**
     * Cette méthode permet d'afficher toutes les propriétés contenant les
     * informations de l'utilisateur (utile pour débug).
     */
    public void getAll() {
        System.out.println();
        System.out.println("============ Informations de l'utilisateur ============");
//        System.out.println("IdCv : " + CurriculumVitae.getIdCv());
        System.out.println("IdentifiantUser : " + CurriculumVitae.getIdentifiant());
        System.out.println("=======================================================");
        System.out.println();
    }
}
