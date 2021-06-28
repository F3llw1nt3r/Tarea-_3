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
public class Perro extends Animal {
    private String raza;
Perro Dog1= new Perro("Schnauzer", 4);
    public Perro(String raza, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
    }

    public Perro() {
    }

    public Perro(String raza) {
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
        return "Perro{" + "raza=" + raza + '}';
    }

    public Perro getDog1() {
        return Dog1;
    }

    public void setDog1(Perro Dog1) {
        this.Dog1 = Dog1;
    }

    @Override
    public int getNumeroPatas() {
        return super.getNumeroPatas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumeroPatas(int numeroPatas) {
        super.setNumeroPatas(numeroPatas); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void ladrar(){
    System.out.println("Ladrando...");
    }
}
