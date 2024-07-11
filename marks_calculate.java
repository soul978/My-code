import java.util.Scanner;

public class marks_calculate {
    static int culculate_percentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Marks : ");
        int marks = sc.nextInt();
        return marks;
    }
    public static void main(String[] args) {
       int a= culculate_percentage();
       int b = culculate_percentage();
       int c = culculate_percentage();
       int d = culculate_percentage();
       int f = culculate_percentage();
        float e =(a+b+c+d+f)/5;
        
        System.out.println("percentage of the subject is : "+e);
        if(e>=90 && e<=100){
            System.out.println("excellent");
        }
        else if (e>=80 &&e<=90) {
            System.out.println("very good");
        }
        else if (e>=70&&e<=80) {
            System.out.println("good");
        }
        else if (e>=60&&e<=70) {
            System.out.println("can do better  ");

        }
        else if (e>=50 && e<=60) {
            System.out.println("average");
        }
        else if (e>=40&&e<=50) {
            System.out.println("below averge ");
        }
        else if (e<40) {
            
        System.out.println("fail ");
            
        }
        
    }
}
