
package operatorconditional;


public class Operatorconditional {

    
    public static void main(String[] args) {
        int value = 6;
        int anotherValue = 9;
        
        
        System.out.println("Conditional AND");
        boolean result = value == 6 && anotherValue == 9;
        boolean anotherResult = value != 6 && anotherValue == 9;     
        
        System.out.println("Hasil Operator AND pada syarat value == 6 dan anotherValue == 9 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 6 dan anotherValue == 9 adalah " + anotherResult);
        System.out.println();
        System.out.println("Conditional OR");
        
        result = value == 6 || anotherValue == 9;
        anotherResult = value != 6 || anotherValue == 9;
        
        System.out.println("Hasil Operator OR pada syarat value == 6 dan anotherValue == 9 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 6 dan anotherValue == 9 adalah " + anotherResult);
        System.out.println();
    }
    
}
