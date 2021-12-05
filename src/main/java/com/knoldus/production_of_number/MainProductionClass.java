package com.knoldus.production_of_number;

public class MainProductionClass {
    public static long getOutcomes(long number1,long number2){

        //  Lambda function fot required implementation
        ProductionInterfaceClass production_Of_two_Numbers= ((a, b) -> {
            long answer = 1;
            for(long j = b; j>=a; j--){
                answer = answer * j;
            }
            return answer;
        });
        return production_Of_two_Numbers.getProductionOf(number1,number2);
    }
    public static void main(String[] args) {

       //    getting input for product Result
        long result1 = MainProductionClass.getOutcomes(0,1);
        long result2 = MainProductionClass.getOutcomes(2,2);
        long result3 = MainProductionClass.getOutcomes(1,4);
        long result4 = MainProductionClass.getOutcomes(5,15);

        // output
        System.out.println(" production of all above numbers are (inclusively) ::");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
