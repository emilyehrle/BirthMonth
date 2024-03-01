import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        //***I originally did the pseudocode wrong, so I redid it
        //class birthMonth
        //   main ()
        //    num birthMonth = 0
        //    output “Enter your birth month numerically [1-12]: “
        //    input birthMonth
        //    if birthMonth >= 1 && <= 12
        //    output “Your birth month is: " + birthMonth
        //       else
        //         output “You entered an incorrect month value: “ + birthMonth
        //      end if
        //   return
        //end class

        Scanner in = new Scanner(System.in);

        int birthMonth = 0;

        System.out.println ("Enter your birth month [1-12]: ");
        birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect value: " + birthMonth);
        }

        in.close();
    }
}