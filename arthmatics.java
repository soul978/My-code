import java.util.Scanner;

public class arthmatics {
    @SuppressWarnings("resource")
    static void addition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers : ");
        int no_1 = sc.nextInt();
        System.out.print("Enter the Second numbers : ");
        int no_2 = sc.nextInt();
        int result = no_1-no_2;
        System.out.println();
        System.out.print("The division resultant is : "+no_1+" + "+no_2+" = "+result);

     
    }
    static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers : ");
        int no_1 = sc.nextInt();
        System.out.print("Enter the Second numbers : ");
        int no_2 = sc.nextInt();
        int result = no_1-no_2;
        System.out.println();
        System.out.print("The division resultant is : "+no_1+" * "+no_2+" = "+result);
       
    }
    static void division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers : ");
        int  no_1 = sc.nextInt();
        System.out.print("Enter the Second numbers : ");
        int no_2 = sc.nextInt();
         float result = no_1/no_2;
         System.out.println();
         System.out.print("The division resultant is : "+no_1+" / "+no_2+" = "+result);
        
    }
     static void subtract(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers : ");
        int no_1 = sc.nextInt();
        System.out.print("Enter the Second numbers : ");
        int no_2 = sc.nextInt();
         int result = no_1-no_2;
         System.out.println();
         System.out.print("The subtract resultant is : "+no_1+" - "+no_2+" = "+result);      
    }
    static void modulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers : ");
        int no_1 = sc.nextInt();
        System.out.print("Enter the Second numbers : ");
        int no_2 = sc.nextInt();
        int result = no_1%no_2;
        System.out.println();
        System.out.print("The modulo resultant is : "+no_1+" % "+no_2+" = "+result);
       
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.modulo");
        System.out.println();
       
        System.out.print("choose the numbers : ");
        int choose = sc.nextInt();

        if (choose == 1) {
            System.out.println();
            addition();
        }
        else if (choose ==2) {
            System.out.println();
            subtract();
        }
        else if(choose==3){
            System.out.println();
            multiplication();
        }
        else if (choose==4) {
            System.out.println();
            division();
        }
        else if (choose==5) {
            System.out.println();
            modulo();
        }
        else{
            System.out.println(" choose the correct option ");
         
            //? use of goto is important 
            
        }
    }
}