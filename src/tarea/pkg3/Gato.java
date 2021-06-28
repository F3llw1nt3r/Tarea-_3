/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

/**
 *
 * @author Abraham
 */
public class Gato extends Animal {
    private String raza;
 Gato cat1= new Gato("siames",4);
    public Gato(String raza, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
    }

    public Gato() {
    }

    public Gato(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + '}';
    }

    public Gato getCat1() {
        return cat1;
    }

    public void setCat1(Gato cat1) {
        this.cat1 = cat1;
    }

    @Override
    public int getNumeroPatas() {
        return super.getNumeroPatas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumeroPatas(int numeroPatas) {
        super.setNumeroPatas(numeroPatas); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void maullar(){
        System.err.println("Maullando...");
    }
}

