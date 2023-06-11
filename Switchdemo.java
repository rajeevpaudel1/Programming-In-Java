import java.util.Scanner
public class Switchdemo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the first number");
        int num1=scan.nextint();
        System.out.print("Enter the second number");
        int num2= scan.nextint();

        System.out.print("+ ,- ,/ ,* ");
        char ch=scan.next.charAt(0);
        switch(ch){
            case '+': System.out.println("Add"+(num1+num2));
                            break;

            case '-': System.out.println("substraction"+(num1-num2));
                            break;

            case '/': System.out.println("Division"+(num1/num2));
                            break;

            case '*': System.out.println("multiplication"+(num1*num2));
                            break;

            default: System.out.println("Invalid choice!!!");
                            break;
        }
            }
    
}
