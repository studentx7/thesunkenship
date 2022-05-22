import util.java.Scanner;

class conditionals {
    public static void main(String[] args) {
        java.util.Scanner scnr = new Scanner(System.in);

        //water temperature conditional question
        //sunken ships are safe and comfortable to explore under certain temperatures!
        //the pirates can only proceed if the water temperature is warm and pleasant! 

        System.out.print("Enter the current water temperature: ");
        int watertemp = scnr.nextInt();

        if ((watertemp > 25) && (watertemp < 32)) {
            System.out.println("Blimey! The water is warm and pleasant, we should be safe to proceed!");
        }
        else if (watertemp <= 25) {
            System.out.println("Aaaarrrrgggghhhh! The water is unusually cold today, we should head back to shore and explore this shipwreck another day!");
        }
        else {
            System.out.println("Aaaarrrrgggghhhh! The water is warmer than usual, we should head back to shore and explore this shipwreck another day!");
        }

        //which of the following options will allow the pirates to explore the sunken ship safely? 
        //Options: 1. 28°C         2. 0°C        3. 32°C        4.85°C


	//ANSWER: 1. 28 degrees (ENTER 28)



    }
}