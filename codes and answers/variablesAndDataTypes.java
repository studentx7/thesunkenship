import java.util.Scanner;
                
public class variablesAndDataTypes {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

                double adjacentSide;
                double oppositeSide; 
                double areaValue1;
                int areaValue2;
                double areaValue3;

                System.out.println("Enter the Adjacent side of the right-angled triangle.");
                adjacentSide = scnr.nextDouble();
                System.out.println("Your Adjacent side is: " + adjacentSide);

                System.out.println();

                System.out.println("Enter the Opposite side of the right-angled triangle.");
                oppositeSide = scnr.nextDouble();
                System.out.println("Your Opposite side is: " + oppositeSide);

                System.out.println();
                System.out.println(areaValue1 = ((adjacentSide * oppositeSide) / 2));
                System.out.println(areaValue2 = (int)(areaValue1));
                System.out.println(areaValue3 = (double)(areaValue2));
	}
}


	//Question: If the right-angled triange has an Adjacent side of 45.83 metres, and an Opposite side of 37.12 metres, then what would be the correct output of the code?

	// Answer 2: 850.6048, 850, 850.0 <- CORRECT
