package ShitSwagVipEdition;



public class FUckThisShit6 {
    FUckThisShit6(){}
    public void fibonacci(){
        int sum=0, presum=1,prepresum=0;
        for(int i = 0; i < 11; i++){
            sum = presum + prepresum;
            prepresum = presum;
            presum = sum;
            System.out.println(sum);
            System.out.println("That's all, BITCH!");
        }
    }
}
