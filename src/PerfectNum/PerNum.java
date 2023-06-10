package PerfectNum;
import java.util.Scanner;
public class PerNum {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer to check perfect number");
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=number/2)
        {
            if(number%i == 0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum == number)
            System.out.println(number+" is Perfect Number");
        else System.out.println(number+" is not Perfect Number");
    }
}
