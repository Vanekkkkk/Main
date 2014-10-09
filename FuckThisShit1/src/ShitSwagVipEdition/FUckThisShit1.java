package ShitSwagVipEdition;
import java.util.*;


public class FUckThisShit1 {
    FUckThisShit1(){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the integer number, BITCH!(like Jessy Pinkman)");
        if(scan.hasNextInt()){
          int  n = scan.nextInt(), i = n;
          while(n != 0){
              sum = sum + n % 10;
              n/=10;
          }
            System.out.println("Your number=" + i + ", BITCH!" + "\n" + "your sum = " + sum + "\n" + "WHERE IS MY MONEY, BITCH?!");
        } else System.out.println("Wrong, BITCH!");


    }
}
