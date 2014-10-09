package ShitSwagVipEdition;
import java.util.*;
import java.math.*;

public class FUckThisShit3 {
    FUckThisShit3(){
        Scanner scan = new Scanner(System.in);
        float a=0,b=0,c=0;
        String s1= "WHERE IS MY MONEY, BITCH?!", s2= "Wrong, BITCH!";
        System.out.println("Input a of ax^2+bx+c BITCH!");
        if(scan.hasNextFloat()){
           a = scan.nextFloat();
        } else System.out.println(s2);
        System.out.println("Input b of ax^2+bx+c BITCH!");
        if(scan.hasNextFloat()){
           b = scan.nextFloat();
        } else System.out.println(s2);
        System.out.println("Input c of ax^2+bx+c BITCH!");
        if(scan.hasNextFloat()){
           c = scan.nextFloat();
        } else System.out.println(s2);
        double d = Math.pow(b,2)-(4*a*c);
        if(d>0){
            float x1 =(float) ((-b - Math.sqrt(d))/(2*a));
            float x2 =(float) ((-b + Math.sqrt(d))/(2*a));
            System.out.println("x1= " + x1 + "\n" + "x2= " + x2);
            System.out.println(s1);
        } else if(d == 0){
            float x = (float) (-b/(2*a));
            System.out.println("x= " + x);
            System.out.println(s1);
        } else System.out.println("Fuck off, BITCH!");
    }
}
