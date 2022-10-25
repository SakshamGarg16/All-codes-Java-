import java.util.*;
class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:System.out.println("Adittion = "+(a + b));
                
                break;
            case 2:System.out.println("Substraction = "+(a - b));
                
                break;
           case 3:System.out.println("Multiplication = "+(a * b));
                
                break;
            case 4:System.out.println("Division = "+(a / b));
                
                break;
            case 5:System.out.println("Remainder = "+(a % b));
                
                break;
        
            default:System.out.println("Invalid");
                break;
        }
    }
}