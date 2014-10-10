package ShitSwagVipEdition;
import java.util.*;

public class FUckThisShit4 {
    FUckThisShit4(){
        Scanner scan = new Scanner(System.in);
        int a=0,b=0,c=0;

        System.out.println("Input integer a, BITCH!");
        if(scan.hasNextInt()){
            a = scan.nextInt();
        } else System.out.println("Wrong, BITCH!");
        System.out.println("Input integer b, BITCH!");
        if(scan.hasNextInt()){
            b = scan.nextInt();
        } else System.out.println("Wrong, BITCH!");
        System.out.println("Input integer c, BITCH!");
        if(scan.hasNextInt()){
            c = scan.nextInt();
        } else System.out.println("Wrong, BITCH!");
            if(a != b || a != c || b != c){
            int[] x={a,b,c};

            for(int i=0;i<x.length;i++){
                int min= x[i], index= i;
                for(int j = i+1;j<x.length;j++){
                    if(x[j]<min){
                        min = x[j];
                        index = j;
                    }

                }
                if(i != index){
                    int buf = x[i];
                    x[i] = x[index];
                    x[index] = buf;
                }
            }
            a = x[0];
            b = x[1];
            c = x[2];
            System.out.println("Here's your numbers, BITCH!");
            System.out.println("a= " + a + "\n" + "b= " + b + "\n" + "c= " + c);
            System.out.println("WHERE IS MY MONEY, BITCH?!");
            } else System.out.println("WHAT THE FUCK???");
    }
}
