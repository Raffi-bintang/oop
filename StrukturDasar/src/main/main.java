
package main;
import musik.drum;
import kendaraan.mobil;
import kendaraan.motor;
import kendaraan.kereta;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
public class main {

  
    public static void main(String[] args) {
       System.out.println("Hello GUYSSSSSSSSSSSSSSSSSSS!");
       
       drum.bunyi();
       mobil.avanza();
       motor.beat();
       kereta.sin();
       
       Date today = new Date();
       System.out.println("Hari ini = " + today);
       Date tomorrow = DateUtils.addDays(today, 1);
       System.out.println("Besok = " + tomorrow);
    }
    
}
