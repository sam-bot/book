import java.util.Scanner;

public class TestMyInteger {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int testValue = input.nextInt();
        
        System.out.println("Enter a numeric string: ");
        String testNumber = input.next();
        MyInteger myInteger = new MyInteger(testValue);
        
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(MyInteger.isEven(testValue));
        System.out.println(MyInteger.isOdd(testValue));
        System.out.println(MyInteger.parseInt(testNumber));
    }

}

