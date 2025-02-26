import java.util.Scanner;
public class EvenOddChecker{
    public static void main(String[]args){
    int number=getIntegerInput();
    if (number==-1){
         System.out.println("Invalid input, try again");
    }else{
         System.out.println(checkEvenOrOdd(number));
    }
 

    }

    public static int getIntegerInput(){
        Scanner input =new Scanner(System.in); //allows user to put input
        System.out.print("Enter an integer: ");
        int userInput=input.nextInt();
        input.close();
        if (userInput>0){
            return userInput;
        }else{
            return -1;      
        }
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 1) {
            return (number + " is an Odd number");
        } else {
            return (number + " is an Even number");
        }
    }
}