import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = "";
        String mNum = "";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(in, "Enter your SSN using the mnemonic ", "^\\d{3}-\\d{2}-\\d{4}$");
        mNum = SafeInput.getRegExString(in, "Enter your UC M Number ", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Enter what menu choice you would like to choose ", "^[OoSsVvQq]$");
    }
}
