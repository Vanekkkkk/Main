package ShitSwagVipEdition;
import java.util.*;

public class FUckThisShit5 {
    FUckThisShit5(){}
    public void palindrome(){
        String iS;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a string, BITCH!");
        iS = scan.nextLine().toLowerCase();
        if (iS.length()==5){

            int i, begin, end;
            begin  = 0;
            end    = 4;
            i = 0;
            while (i <= 3) {
                if (iS.charAt(begin) == iS.charAt(end)) {
                    begin++;
                    end--;
                    i++;
                    System.out.println(begin + "  " + end + "  " + i);
                }
                else {
                    break;
                }
            }
            System.out.println(i);
            if (i == 3) {
                System.out.println("It's a palindrome, BITCH!");
                System.out.println("WHERE IS MY MONEY, BITCH?!");
            }
            else {
                System.out.println("It's not a palindrome, BITCH!");
                System.out.println("WHERE IS MY MONEY, BITCH?!");
            }
        } else System.out.println("Must be 5 letters, BITCH!");
    }
}
