/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanbarang;

/**
 *
 * @author ssc
 */
public class Brg implements Barang{
    String kode, nama, satuan, diskon;
    int harga, jumlah, totalHarga,total, totalDiskon, total2;

    public Brg(String kode, String nama, int harga, String satuan, int jumlah){
        //Konstruktor
        this.kode = kode;
        this.nama = nama;
        this.satuan = satuan;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public int total(){
        return harga*jumlah;
    }
    
    public int totalDiskon(){
        if(total()>=1000000){
            totalDiskon = ((harga*jumlah)*20/100);
        } else if(total()>=500000){
            totalDiskon =((harga*jumlah)*10/100);
        } else if(total() >= 100000){
            totalDiskon =((harga*jumlah)*5/100);
        } else {
            totalDiskon = ((harga*jumlah)*0/100);
        }
        return totalDiskon;
    }
    
    public int totalHarga(){
        if(total()>=1000000){
            totalHarga = ((harga*jumlah)-((harga*jumlah)*20/100));
        } else if(total()>=500000){
            totalHarga = ((harga*jumlah)-((harga*jumlah)*10/100));
        } else if(total() >= 100000){
            totalHarga = ((harga*jumlah)-((harga*jumlah)*5/100));
        } else {
            totalHarga = ((harga*jumlah)-((harga*jumlah)*0/100));
        }
        return totalHarga;
    }

    @Override
    public String getDiskon(int total) {
        if(total >= 1000000){
            diskon = "20%";
        } else if(total >= 500000){
            diskon = "10%";
        } else if(total >=100000){
            diskon = "5%";
        } else {
            diskon = "0%";
        }
            return diskon;
        }
    }
   