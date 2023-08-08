import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double dollar = 10;
        double spend = 0;
        boolean yesOrNo = false;

        do {
            spend = SafeInput.getRangedDouble(in, "Enter the price of the item ", 0.5, 10);
            dollar = dollar - spend;
            System.out.println("You have $" + dollar + " left.");
            yesOrNo = SafeInput.getYNConfirm(in, "Do you have more to spend?");
            spend += spend;
        }while(!yesOrNo);

        System.out.printf("You spent $%,.2f", spend);
    }
}
