
package pertemuan1;


public class Game {

    public static void main(String[] args) {
       Player Balanar = new Player();
       Balanar.nama = "Night Stalker";
       Balanar.speed = 80;
       Balanar.hp = 100;
       
       Balanar.run();
       if (Balanar.mati()){
       System.out.println("Coba Lagi Eaa :)");
       }
    }
    
}
