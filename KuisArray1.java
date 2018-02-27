/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisarray1;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class KuisArray1 {
    /*array absen kerja */   
    public static void main (String []args) {
            Scanner masuk = new Scanner (System.in);
            Absen[] absn = new Absen[2];
            for(int i=0;i<absn.length;i++){
               System.out.println ("Masukan data"+(i+1));
               System.out.print("Nama : ");
               String nama = masuk.next();
              /* Jamkedatangan diisi seperti (0820)*/
               System.out.print("Jamkedatangan : ");
               int JamKedatangan = masuk.nextInt();
               
               Absen absen = new Absen();
               absen.setnama(nama);
               absen.setJamKedatangan(JamKedatangan);
               absn [i] = absen;
            }
            
            for(int i =0;i<absn.length;i++){
                System.out.println("Tampilan data "+(i+1));
                System.out.println("Nama : "+absn[i].getnama());
                System.out.println("JamKedatangan : "+absn[i].getJamKedatangan());
            }
    }   
}

    class Absen {
        private String nama;
        private int JamKedatangan;
        private String absen;
        
        public void setnama(String absen) {
            this.absen = absen;
        }
        public void setJamKedatangan(int JamKedatangan)  {
            this.absen = absen;
        }
        public String getnama() {
            return this.nama;
        }
        public int getJamKedatangan() {
            return this.JamKedatangan;
        }
        
}
        

