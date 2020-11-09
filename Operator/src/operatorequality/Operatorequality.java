
package operatorequality;


public class Operatorequality {

  
    public static void main(String[] args) {
     int value = 6;
     int anotherValue = 9;
     boolean result;
     result = value == anotherValue;
     
     System.out.println("hasil value == anotherValue adalah " + result );
     System.out.println();
    
     
     System.out.println("tidak sama dengan");
     result = value != anotherValue;
     System.out.println("Hasil value != another Value adalah" + result);
     System.out.println();
     
     System.out.println("Lebih besar dari..");
     result = value > anotherValue;
     System.out.println("Hasil 'value > anotherValue' adalah " + result);
     System.out.println();
     
     System.out.println("Sama atau lebih besar dari..");
     result = value >= anotherValue;
     System.out.println("Hasil 'value >= anotherValue' adalah " + result);
     System.out.println();
        
     System.out.println("Kurang dari..");
     result = value < anotherValue;
     System.out.println("Hasil 'value < anotherValue' adalah " + result);
     System.out.println();
        
     System.out.println("Sama atau kurang dari dengan..");
     result = value <= anotherValue;
     System.out.println("Hasil 'result <= anotherValue' adalah " + result);
     System.out.println();
    }
    
}
