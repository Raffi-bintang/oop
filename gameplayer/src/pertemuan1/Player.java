
package pertemuan1;


public class Player {

    String nama;
    int speed;
    int hp;
    
    void run(){
    System.out.println(nama +" adu kuat...");
    System.out.println("Speed" + speed);
    }
    
    boolean mati(){
    if (hp <= 0) return true;
    return false;
    }
    
    
    
}
