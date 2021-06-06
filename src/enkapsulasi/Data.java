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
public class Data {
    private String nama, kelas, asal, notelp;

    public void setNama(String nama){
        this.nama = nama;
    }

    
    public void setNotelp(String notelp){
        this.notelp = notelp;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void setAsal(String asal){
        this.asal = asal;
    }

    String getKelas() {
        return kelas;
    }

    String getAsal() {
        return asal;
    }
    
    
    String getNama(){
        return nama;
        
    }
  
    String getNotelp(){
        return notelp;
    }
}
    