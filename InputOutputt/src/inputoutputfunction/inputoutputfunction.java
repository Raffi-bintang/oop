
package inputoutputfunction;
import java.util.Scanner;
public class inputoutputfunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Penjumlahan ");
        System.out.print("Angka Pertama :  ");
        int value = scanner.nextInt();
        System.out.print("Angka Kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya Adalah :" + result);
    }
    
}
