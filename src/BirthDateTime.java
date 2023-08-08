import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;

        year = SafeInput.getRangedInt(in, "Enter the year you were born ", 1950, 2023);
        month = SafeInput.getRangedInt(in, "Enter the month you were born ", 1, 12);
        switch (month) {
            case 2: day = SafeInput.getRangedInt(in, "Enter the day you were born ", 1, 29);
            case 4: case 6: case 9: case 11: day = SafeInput.getRangedInt(in, "Enter the day you were born ", 1, 30);
            default: day = SafeInput.getRangedInt(in, "Enter the day you were born ", 1 , 31);
        }
        hour = SafeInput.getRangedInt(in, "Enter the hour you were born ", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter the minute you were born ", 1, 59);

        System.out.println("You were born in " + year + ", " + month + " " + day + " at " + hour + ":" + minute);
    }
}
