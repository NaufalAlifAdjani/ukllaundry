/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Transaksi extends JenisLaundry{
    
        private ArrayList<Integer> idJenis = new ArrayList<Integer>();
        private ArrayList<Integer> banyak = new ArrayList<Integer>();
        private ArrayList<Integer> idClient = new ArrayList<Integer>();
        public int size(){
        return this.idClient.size();
    }
    public JenisLaundry laundry = new JenisLaundry();

    int id;
    public void clnt(Client client){
        Scanner input = new Scanner(System.in);
        System.out.println("\t");
        System.out.println("=====Silahkan Laundry=====");
        System.out.println("\t");
        System.out.println("Masukkan ID Member");
        //int idClient untuk mencari id inputan user di class client
        id = input.nextInt();
        System.out.println("\t");
        System.out.println("Selamat Datang ");
        System.out.println("Nama : "+client.getNama(id));
        System.out.println("Alamat : "+client.getAlamat(id));
        System.out.println("Telepon : "+client.getTelepon(id));
        System.out.println("Saldo : "+client.getSaldo(id));
            System.out.println("\t");
    }
        //obj extends JenisLaundry
        public void prosesTransaksi(Client client, Transaksi transaksi,JenisLaundry jenislaundry, Petugas petugas){
        Scanner input = new Scanner(System.in);     
        
        int i=0;
        int temp=0;
        do{
        System.out.println("Pilih jenis :");
        temp=input.nextInt();
            System.out.println("\t");
        if (temp==0){
        idJenis.add(temp);
        System.out.print(jenislaundry.getNamaJenis(idJenis.get(i)));
          System.out.println(" sebanyak : "+" kilo");
        banyak.add(input.nextInt());
            System.out.println("\t");
        }else if(temp ==1){
          idJenis.add(temp);
        System.out.print(jenislaundry.getNamaJenis(idJenis.get(i)));
          System.out.println(" sebanyak : "+" kilo");
        banyak.add(input.nextInt());
        }else if(temp == 2){
            idJenis.add(temp);
        System.out.print(jenislaundry.getNamaJenis(idJenis.get(i)));
          System.out.println(" sebanyak : "+" kilo");
        banyak.add(input.nextInt());
        }
        }while (temp>3);
        System.out.println("Transaksi belanja "+client.getNama(id)+" sebagai berikut");
        System.out.println("Nama jenis \tHarga \tJumlah \tpengerjaan\tpetugas");
          //variabel data jumlah
        int Total = 0;
        int x = idJenis.size();
        for (int j = 0; j < x; j++){
          //perhitungan jumlah
        int jumlah=banyak.get(j);
        Total=jumlah*jenislaundry.getHarga(idJenis.get(j));
        System.out.println(jenislaundry.getNamaJenis(idJenis.get(j))+"\t"+"\t"+
        jenislaundry.getHarga(idJenis.get(j))+"\t"+
        jumlah+" kilo"+"\t"+jenislaundry.getDurasi(idJenis.get(j))+" hari"+"\t"+"\t"+petugas.getNama(j));
        }
        System.out.println("Total Belanja : "+Total);
        int saldo = client.getSaldo(id)-Total;
          System.out.println("Saldo : "+saldo);
        }
        
        
        static Client client = new Client();
        static Petugas petugas = new Petugas();
        static Transaksi transaksi = new Transaksi();
        Scanner input = new Scanner(System.in);
        String nama,alamat,tlp;
        int idbaru,sld;
        public void daftar(){
            System.out.println("Masukkan Nama");
            nama = input.next();
            client.setNama(nama);
            System.out.println("Masukkan ID untuk anda");
            idbaru = input.nextInt();
            System.out.println("Masukkan Alamat");
            alamat = input.next();
            client.setAlamat(alamat);
            System.out.println("Masukkan Nomor Telepon");
            tlp = input.next();
            client.setTelepon(tlp);
            System.out.println("Masukkan saldo yang ingin anda tambahkan");
            int saldo = input.nextInt();
            client.setSaldo(saldo);
            System.out.println("Terimakasih telah mendaftar "+nama);
        }
        
}
