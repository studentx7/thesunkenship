import java.util.Scanner;

public class Arrays {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter how many elements you want.");
        int numElements = scnr.nextInt();
        int[] userInputList = new int[numElements];
        
        for(int i = 0; i < numElements; i++) {
            userInputList[i] = scnr.nextInt();
            System.out.println("Value: " + userInputList[i]);
        }

        for (int j = 0; j < userInputList.length; ++j) {
            userInputList[j] = userInputList[userInputList.length - 1 - j]; 
         }

        int maxValue = userInputList[0];
        int maxIndexValue = 0;

        for (int i = 0; i < userInputList.length; i++) {
            if(userInputList[i] > maxValue) {
                maxValue = userInputList[i];
                maxIndexValue = i;
            }
        }
        System.out.println(maxIndexValue);
    }
}


	// Question: If the user enters "7" on Line 8 code, and then enters "1 3 5 4 6 9 2" on Line 12 code, what would be the correct output of Line 29 code?

	// Answer 4: 1