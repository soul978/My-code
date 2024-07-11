import java.util.Scanner;

public class three_digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first numbers   ");
        int a = sc.nextInt();
        if (a>99 && a<1000) {
            System.out.println(a+" is three dight numbers ");
        }
        else if (a>9 && a<99) {
            System.out.println(a+" is two digit numbers  ");
        }
        else if(a>999 && a<10000){
            System.out.println(a+ " is four dit numbers ");
        }
    }
}
