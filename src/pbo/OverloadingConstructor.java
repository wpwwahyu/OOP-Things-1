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
class OverloadingConstructor {
    OverloadingConstructor() {
        System.out.println("TAHUN 2019");
    }
    OverloadingConstructor(int Tanggal, String Bulan){
        System.out.println("Tanggal :"+Tanggal+"Bulan: "+Bulan);
    }
    OverloadingConstructor(String Hari){
        System.out.println("Di hari :"+Hari);
    }
    OverloadingConstructor(int Menit, int Jam){
        System.out.println("Pada pukul :"+Jam+"Menit ke-"+Menit);
    }
}