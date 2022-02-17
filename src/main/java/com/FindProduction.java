package com;

public class FindProduction {
    public static long getResult(long num1,long num2){

        //        Writing lambda for the given requirement
        ProductionOfNumbers productionOfNumbers= ((x, y) -> {
            long result = 1;
            for(long i = y; i>=x;i--){
                result = result * i;
            }
            return result;
        });
       return productionOfNumbers.getProduction(num1,num2);
    }
    public static void main(String[] args) {

//      getting output
        long output1 = FindProduction.getResult(3,12);
        long output2 = FindProduction.getResult(4,8);

        System.out.println(output1);
        System.out.println(output2);

    }
}
