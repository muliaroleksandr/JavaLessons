import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your age");
        String age = scanner.nextLine();

        switch(age)
        {
            case "null":
                System.out.println("Birth date");
                break;
            case "ten":
                System.out.println("School age");
                break;
            default: System.out.println("No age entered");
        }
    }
}
