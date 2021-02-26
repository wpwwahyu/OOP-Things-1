/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author laptop
 */
class Enkapsulasi {
    public void Animalia(){
        System.out.println("Kingom animalia");
    }
   // protected Enkapsulasi(int )
   // private Enkapsulasi
}
class Mamalia extends Enkapsulasi{
    protected void Mamalia(){
        int Kromosom = 46;
        System.out.println("Animalia berkromosom "+Kromosom);
    }
}
class Human extends Mamalia{
   private void Human(){
       System.out.println("Manusia");
   } 
}
