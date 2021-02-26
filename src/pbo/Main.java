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
class Main{
    int tgl, mnt, jm;
    String hr, bln;
    public static void main(String[] args) {
        //menjalankan dari kelas OverloadingConstructor
        OverloadingConstructor dflt = new OverloadingConstructor();
        OverloadingConstructor tgbl = new OverloadingConstructor(29, "Maret");
        OverloadingConstructor hri = new OverloadingConstructor("Jumat");
        OverloadingConstructor wkt = new OverloadingConstructor(15, 15);
        //menjalankan dari kelas Hewan
        System.out.println("\n");
        
        Hewan hw = new Hewan();
        Hewan kk = new Hewan(2);
        Hewan hd = new Hewan("Daratan");
        //menjalankan dari kelas Enkapsulasi
        System.out.println("\n");
        
        Mamalia m = new Mamalia();
        Enkapsulasi e = new Enkapsulasi();
        Human h = new Human();
        e.Animalia();      //objek yang memanggil public method dari class Enkapsulasi
        m.Mamalia();       //objek yang memanggil protected method dari class Mamalia
      //h.Human();         //tidak bisa diakses karena private method dari class Human
    }
}