import java.util.Scanner;

public class Assignment2Part1 {
    public static void main(String[] args){
        /*Name: Sam Renick
         * Date: 2-1-12
         * Module 2 Assignment Part 1
         * Description: Reads ten integers; calculates and displays the average of the numbers that
         * have been read.   */
        
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Read an initial data
        int number = 0;
        double sum = 0;
        int i = 0;
        while (i < 10 ){
            System.out.println("Enter an integer.");
            number = input.nextInt();
            if (number > 0)
            sum = sum + number;
            i++;
    }
        double average = (sum / 10);
        System.out.println("The average of the ten numbers is " + average);
    }
}

