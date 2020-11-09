
package ifthenelseifthenelse;

public class Ifthenelseifthenelse {

    public static void main(String[] args) {
       int nilaiujian = 90;
       char indeksPrestasi;
       
       if (nilaiujian >= 90){
       indeksPrestasi = 'A';
       }
       
       else if (nilaiujian >= 80){
       indeksPrestasi = 'B';
       }
       
       else if (nilaiujian >= 70){
       indeksPrestasi = 'C';
       }
       
       else if (nilaiujian >= 60){
       indeksPrestasi = 'D';
       }
       
       else if (nilaiujian >= 50){
       indeksPrestasi = 'E';
       }else {
       indeksPrestasi = 'F';
       }
         System.out.println("nilai ujian Anda  "  + indeksPrestasi);
    }
    
}
