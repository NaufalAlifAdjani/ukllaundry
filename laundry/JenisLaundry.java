/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.ArrayList;
/**
 *
 * @author lenovo
 */
public class JenisLaundry {
    private ArrayList<String> namaJenis = new ArrayList<String>();
private ArrayList<Integer> durasi = new ArrayList<Integer>();
private ArrayList<Integer> harga = new ArrayList<Integer>();

//inputanjenis
public JenisLaundry() {
this.namaJenis.add("Bronze");
this.durasi.add(3);
this.harga.add(4000);
this.namaJenis.add("Silver");
this.durasi.add(2);
this.harga.add(5000);
this.namaJenis.add("Gold");
this.durasi.add(1);
this.harga.add(6000);
}
public void setNamaJenis(String namaJenis ){
this.namaJenis.add(namaJenis);
}
public String getNamaJenis(int idJenisLaundry){
    return this.namaJenis.get(idJenisLaundry);
}
public void setDurasi(int durasi ){
this.durasi.add(durasi);
}
public int getDurasi(int idJenisLaundry){
return this.durasi.get(idJenisLaundry);
}
public void setHarga(int harga ){
this.harga.add(harga);
}
public int getHarga(int idBarang){
return this.harga.get(idBarang);
}
}
