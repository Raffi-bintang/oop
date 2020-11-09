
package userbufferedreader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

   
    public static void main(String[] args) {
     InputStreamReader streamReader = new InputStreamReader(System.in);
     BufferedReader bufferedReader = new BufferedReader(streamReader);
     int value = 0;
     int anotherValue = 0;
     try {
         System.out.print("Masukkan Angka pertama : ");
         value = Integer.parseInt(bufferedReader.readLine());
         System.out.print("Masukkan Angka kedua : ");
         anotherValue = Integer.parseInt(bufferedReader.readLine());
     } catch ( IOException e){
     e.printStackTrace();
     }
     int resul = value + anotherValue;
     System.out.println("Hasilnya adalah : "+ resul);
    }
    
}
