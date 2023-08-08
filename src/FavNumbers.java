import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your favorite int: ");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double: ");

        System.out.println("Your favorite int is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);
    }
}
