package arrays;

import java.util.Scanner;

public class ArrayAvgAndTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numDays = sc.nextInt();
        int[] temps = new int[numDays];
        int sum =0;

        //Store each day temp into array and find sum
        for(int i=0;i<numDays;i++){
            System.out.print("Day "+(i+1)+"'s high temp : ");
            temps[i]=sc.nextInt();
            sum+=temps[i];
        }
        double average = sum/numDays;
        System.out.println("Average temperature = "+average);

        //Count days above avg temperature
        int above=0;
        for (int i=0;i<temps.length;i++){
            if(temps[i]>average){
                above++;
            }
        }
        System.out.println(above+" days above average");
    }
}
