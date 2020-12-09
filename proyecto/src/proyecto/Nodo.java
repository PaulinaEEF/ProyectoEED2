/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author daba5
 */
public class Nodo {
    
     //boolean esHoja;
    ArrayList<LlavePos> llaves;
    ArrayList<Nodo> hijos;
    int n;
    boolean leaf;

    public Nodo(int m) {
        llaves = new ArrayList<>();
        hijos = new ArrayList<>();
        for (int i = 0; i < m-1; i++) {
            llaves.add(null);
            hijos.add(null);
        }
        hijos.add(null);
        n = 0;
        leaf = true;
    }

    public Nodo(int m, String llave, long pos) {
        llaves = new ArrayList<>(m-1);
        hijos = new ArrayList<>(m);
        llaves.set(0, new LlavePos(llave, pos));
        n = 1;
        leaf = true;
    }

//    public boolean isEsHoja() {
//        return esHoja;
//    }
//
//    public void setEsHoja(boolean esHoja) {
//        this.esHoja = esHoja;
//    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }
    
    public ArrayList<LlavePos> getLlaves() {
        return llaves;
    }

    public void setLlaves(ArrayList<LlavePos> llaves) {
        this.llaves = llaves;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }

    /*public boolean leaf() {
        return hijos.isEmpty();
    }*/

    @Override
    public String toString() {
        if(this.getN() == 0){
            return "";
        }
        String nodo = "[";

        for (int i = 0; i < this.getN()-1; i++) {

            nodo += this.getLlaves().get(i) + ", ";
        }
        nodo += this.getLlaves().get(this.getN()-1) + "]";
        
        return nodo;
    }
    
}