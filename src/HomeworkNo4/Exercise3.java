package HomeworkNo4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++)
        {
            int n=in.nextInt();
            sum+=n;
        }
        System.out.println("Sum = "+sum);
    }
}
