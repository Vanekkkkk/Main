package ShitSwagVipEdition;
import java.util.*;

public class FUckThisShit2 {
    FUckThisShit2(){
        int a = 0, b = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input a of [a;b], BITCH!");
        if(!scan.hasNextInt()){
            System.out.println("Wrong, BITCH!");
        } else{
            a = scan.nextInt();
            System.out.println("Input b of [a;b], BITCH!");
            if(!scan.hasNextInt()){
                System.out.println("Wrong, BITCH!");
            } else{
                b = scan.nextInt();
                if(a < b){
                int c = random.nextInt(b - a) + a;
                System.out.println("Your number of [a;b] is " + c);
                System.out.println("WHERE IS MY MONEY, BITCH?!");
                } else System.out.println("WHAT THE FUCK???");
            }
        }
    }
}
