import java.util.Scanner;

public class SafeInput {
    /**
     * Get a String which contains at least one character
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;
    }

    /**
     * 
     * @param pipe Scanner instance to read the data from System.in in most cases
     * @param prompt input prompt msg should not includ range info
     * @param low low end of inclusive range
     * @param high high end of inclusive range
     * @return int value within the inclusive range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]:");
            if(pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * Get an int value with no constraints
     * @param pipe Scanner instance to read the data from System.in in most cases
     * @param prompt input prompt msg should not include range info
     * @return unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * Get a double value with no constraints
     * @param pipe Scanner instance to read the data from System.in in most cases
     * @param prompt input prompt msg should not include range info
     * @return unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * get a double within an inclusive range
     * @param pipe Scanner instance to read the data from System.in in most cases
     * @param prompt input prompt msg should not contain range info
     * @param d low value inclusive
     * @param e high value inclusive
     * @return double value within the specified inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double d, double e) {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + "[" + d + "-" + e + "]: " + retVal);
            if(pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= d && retVal <= e) {
                    done = true;
                } else {
                    trash = pipe.nextLine();
                    System.out.println("You must enter a double: " + trash);
                }
            }
        }while(!done);

        return retVal;
    }
 
    /**
     * Get a [Y/N] confirmation from the user
     * @param pipe Scanner instance to read the data from System.in in most cases
     * @param prompt input prompt msg for user done not need [Y/N]
     * @return true for yes false for no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do {
            System.out.print("\n" + prompt + " [Y/N] ");
            response = pipe.nextLine();
            if(response.equalsIgnoreCase("Y")) {
                gotAVal = true;
                retVal = true;
            } else if(response.equalsIgnoreCase("N")) {
                gotAVal = false;
                retVal = false;
            } else {
                System.out.println("You must answer [Y/N]! " + response);
            }
        }while(!gotAVal);

        return retVal;
    }

    /**
     * Get a String that matches a RegEx pattern! This is a very powerful method
     * @param pipe Scanner instance to read the data from System.in in most cases
     * @param prompt prompt for user
     * @param regExPattern java style RegEx pattern to constrain the input
     * @return a String that matches the RegEx pattern supplied
     */
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern) {
        String response = "";
        boolean gotAVal = false;

        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if(response.matches(regExPattern)) {
                gotAVal = true;
            } else {
                System.out.println("\n" + response + " must match the pattern " + regExPattern);
                System.out.println("Try again!");
            }
        }while(!gotAVal);

        return response;
    }

    public static void prettyHeader(Scanner pipe, String msg) {
        int padLeft;
        int padRight;

        System.out.println("Enter the message for the header: ");
        msg = pipe.nextLine();

        if(msg.length() < 54) {
            for(int i = 0; i <= 60; i++) {
                System.out.print("*");
            }
            System.out.print("\n***");

            padLeft = (54 - msg.length()) / 2;
            for(int i = 0; i <= padLeft; i++) {
                System.out.print(" ");
            }

            System.out.print(msg);

            padRight = 54 - msg.length() - padLeft - 1;
            for(int i = 0; i <= padRight; i++) {
                System.out.print(" ");
            }

            System.out.print("***");

            System.out.println("");
            for(int i = 0; i <= 60; i++) {
                System.out.print("*");
            }
        }
    }
}