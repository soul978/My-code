import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle : ");
     int n0_1 = sc.nextInt();
        System.out.println("enter the time : ");
        int time = sc.nextInt();
        System.out.println("enter the rate of the intrest : ");
        float rate = sc.nextFloat();
         

        float result = (n0_1*time*rate)/100;
       System.out.println("Principle : "+n0_1);
       System.out.println("rate : "+rate);
       System.out.println("time : "+time);

       System.out.println("the intrest is  :  "+ result);
    }
}
