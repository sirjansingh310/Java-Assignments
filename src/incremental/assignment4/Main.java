package incremental.assignment4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyExceptionThrower myExceptionThrower = new MyExceptionThrower();

        try {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            myExceptionThrower.throwException(num);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println("In finally block");
        }
    }
}
