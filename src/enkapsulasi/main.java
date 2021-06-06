/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author Amanda
 */
public class main {
    public static void main(String[] args) {
        
    Data data = new Data();
    
    data.setNama("Amanda Salsabilla");
    data.setKelas("X RPL 8");
    data.setAsal("SMK Telkom Malang");
    data.setNotelp("08112233445");
    
        System.out.println("Nama         : "+data.getNama());
        System.out.println("Kelas        : "+data.getKelas());
        System.out.println("Asal Sekolah : "+data.getAsal());
        System.out.println("No. Telepon  : "+data.getNotelp());
    }
}
