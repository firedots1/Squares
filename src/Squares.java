import java.util.Scanner;

public class Squares {
    public static void main (String args[]) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("What Number do you wish to find the square root of:"); // Prompt for a Command
        int num = inputNum.nextInt();
        System.out.println("Number     Square ");
        System.out.println("------     ------ ");
        // For loop - I need the three statements, (initialization, The condition, The Change)
        // index ++ Adding increments 1+
        for (int index = 1; index <= num; index++) // (initialization, The condition, The Change)
            // index++ ; means to compute itself or multiple itself //
        {
            System.out.println(index + "          " + index * index);

        }
    }
}