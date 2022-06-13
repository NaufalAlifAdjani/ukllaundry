/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Laundry{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sapa
        System.out.println("selamat datang di londre");
        System.out.println("\t");
        //petugas
        Petugas petugas = new Petugas();
        System.out.println("Petugas yang berjaga:");
        System.out.println("Nama : "+petugas.getNama(0));
        System.out.println("Jabatan : "+petugas.getJabatan(0));
        System.out.println("Alamat : "+petugas.getAlamat(0));
        System.out.println("Telepon : "+petugas.getTelepon(0));
        
        Client user = new Client();
        Scanner input = new Scanner (System.in);
        System.out.println("\t");

        Transaksi trans = new Transaksi();
        trans.clnt(user);
        
        //program lanjut
        String lanjut;
        System.out.println("ketik lanjut");
        lanjut=input.next();
        System.out.println("\t");
        //pemilihan jenis
        
        if(lanjut.equalsIgnoreCase("lanjut")){
            System.out.println("Jenis Laundry");
            System.out.println("\t");
            System.out.println("id = 0");
            System.out.println("Tingkat : "+trans.getNamaJenis(0));
            System.out.println("Durasi : "+trans.getDurasi(0)+" hari");
            System.out.println("Harga : "+trans.getHarga(0)+"/kilo");
            
            System.out.println("\t");
            System.out.println("id = 1");
            System.out.println("Tingkat : "+trans.getNamaJenis(1));
            System.out.println("Durasi : "+trans.getDurasi(1)+" hari");
            System.out.println("Harga : "+trans.getHarga(1)+"/kilo");
            
            System.out.println("\t");
            System.out.println("id = 2");
            System.out.println("Tingkat : "+trans.getNamaJenis(2));
            System.out.println("Durasi : "+trans.getDurasi(2)+" hari");
            System.out.println("Harga : "+trans.getHarga(2)+"/kilo");
        }else{
            System.out.println("silahkan ulang kembali");
        }
        System.out.println("\t");
        
        //transaksi
        if(lanjut.equalsIgnoreCase("lanjut")){
        trans.prosesTransaksi(user, trans, trans, petugas);
        }else{
            
        }
    }
    
}
