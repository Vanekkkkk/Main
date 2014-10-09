package ShitSwagVipEdition;
import java.util.*;

public class FUckThisShit2 {
    FUckThisShit2(){
        int a = 0, b = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input a of [a;b], BITCH!");
        if(scan.hasNextInt()){
            a = scan.nextInt();
        } else System.out.println("Wrong, BITCH!");
        System.out.println("Input b of [a;b], BITCH!");
        if(scan.hasNextInt()){
            b = scan.nextInt();
        } else System.out.println("Wrong, BITCH!");
         int c = random.nextInt(b - a) + a;
        System.out.println("Your number of [a;b] is " + c);
        System.out.println("WHERE IS MY MONEY, BITCH?!");
    }
}
