package HomeworkNo4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=2;
        int sum=0;
        while(i<=n)
        {
            sum += i;
            i+=2;
        }
        System.out.println("Average = "+sum/(n/2!=0?(n/2):1));
    }
}
