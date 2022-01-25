import java.util.Scanner;

public class Wk2Q2{
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
 
        //without line break 
        //System.out.print("Enter three numbers: "); 
         
        //With line break 
        System.out.println("Enter three numbers: "); 
        double[] num = new double[3]; 
 
        //Take in 3 numbers from user 
        double total = 0; 
        for(int i = 0; i < 3; i++){ 
            num[i] = input.nextDouble(); 
            total += num[i]; 
        } 
 
        double ave = total / 3; 
 
        System.out.println("The average of " + num[0] + " " + num[1] + " " + num[2] + " is " + ave); 
         
        input.close(); 
    } 
}