//package naturalnumbers;
/**
 * @(#)SumofNaturalNumbers.java
 * This code calculates the sum of natural numbers up to (Integer.Max_Value-5 = 2147483642)
 * The sum is 2305842997402533903
 * This code has a single thread
 * @Max Radl
 * @version 2.00 2020/12/8
 */
public class SumofNaturalNumbers {

    int maxValue;      //Integer.MAX_VALUE = 2147483647  //Long.MAX_VALUE= 9223372036854775807 //353000000
                       
    public SumofNaturalNumbers() {
        maxValue = Integer.MAX_VALUE-5;
        System.out.println("The maximum value is: " + maxValue);
        System.out.println();
        System.out.println("The sum upto " + maxValue + " is: " + calculateSum());
    }

    private long calculateSum() {
        int i = 1;
        long sum = 0;
        try {
            long startTime = System.nanoTime();
            for (i = 1; i <= maxValue;i++) {
                sum = sum + i;
               // System.out.println("Value of i is: "+i+" and sum is: "+sum);
            }
            long endTime = System.nanoTime();
            System.out.println("Total Time taken is: " + (endTime - startTime));
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("************* " + i + " *******");
        } 
        return sum;
    }

    public static void main(String args[]) {
        SumofNaturalNumbers sNN = new SumofNaturalNumbers();
    }
}
