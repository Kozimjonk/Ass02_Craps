import java.util.Scanner;

public class SafeInput
{
    public static boolean getYNConfirm(Scanner pipe, String prompt )
    {
        boolean retYN = false;
        boolean validInput = false;
        String response;

        do {
            System.out.println("\n" + prompt);
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y"))
            {
                retYN = true;
                validInput = true;

            }
            else if (response.equalsIgnoreCase("N"))
            {
                retYN = false;
                validInput = true;
            }
            else
            {
                System.out.println("\"Invalid Input. Enter [Y/N]");
            }

        }while(!validInput);
        return retYN;
    }
}
