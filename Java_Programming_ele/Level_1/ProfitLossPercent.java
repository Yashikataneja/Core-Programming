public class ProfitLossPercent {
    public static void main(String[]args){
        float Cp=129f;
        float Sp=191;

        float profit=Sp-Cp;
        float profit_percent=(profit/Cp) *100;

        System.out.println("the profit is : "+profit);

        System.out.println("the profit percentage is: "+profit_percent);


    }
}
