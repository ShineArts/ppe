/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.pdf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Damien
 */
public class Collection<T> {

    private ArrayList<T> fichierADelet;

    public Collection() {
        this.fichierADelet = new ArrayList<T>();
    }

    public void ajouterElement(T element) {
        this.fichierADelet.add(element);
    }

    public Integer nbElement() {
        return this.fichierADelet.size();
    }

    public void conversionEnTableau() {
        this.fichierADelet.toArray();
    }

    public T retirerElement(int indice) {
        if (this.nbElement() > indice && indice >= 0) {
            return this.fichierADelet.remove(indice);
        } else {
            return (T) this.fichierADelet;
        }
    }

    public void vider() {
        this.fichierADelet.clear();
    }

}
