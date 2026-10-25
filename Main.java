import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    //--------------------------------------------------------------------------
    // Question 1
    // Returns true if chara appears exactly inta times in stra;
    // otherwise, returns false.
    //--------------------------------------------------------------------------

    public static boolean charNumbers(String stra, int inta, char chara) {
        int counter = 0;

        for (int i = 0; i < stra.length(); i++) {
            if (stra.charAt(i) == chara) {
                counter++;
            }
        }

        if (counter == inta) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    // Question 2
    // Returns the number of times the digit entered by the user
    // appears in the string entered by the user.
    //--------------------------------------------------------------------------

    public static int indexFinder() {
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        input.nextLine();

        System.out.print("Enter a string (only numbers and letters): ");
        String str = input.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == (char) (num + '0')) {
                count++;
            }
        }

        return count;
    }

    //--------------------------------------------------------------------------
    // Question 3
    // Returns a new string with the characters of strn
    // in reverse order.
    //--------------------------------------------------------------------------

    public static String reverser(String strn) {
        int a = strn.length();
        String ans = "";

        for (int i = a - 1; i >= 0; i--) {
            ans = ans + strn.charAt(i);
        }

        return ans;
    }

    //--------------------------------------------------------------------------
    // Question 4
    // Returns a new string with all occurrences of target removed from s.
    //--------------------------------------------------------------------------

    public static String condenser(String s, String target) {
        // System.out.println(s.indexOf(target, 4));
        // System.out.println(s.indexOf(target, 8));

        String ans = "";
        int targetLength = target.length();
        int lastIndex = 0;
        int index = s.indexOf(target, lastIndex);

        while (index != -1) {
            ans += s.substring(lastIndex, index);
            lastIndex = index + targetLength;
            index = s.indexOf(target, lastIndex);
        }

        ans += s.substring(lastIndex);

        return ans;
    }

    //--------------------------------------------------------------------------
    // Question 5
    // Prints all positive factors of num in ascending order.
    //--------------------------------------------------------------------------

    public static void factors(int num) {
        for (int x = 1; x <= num; x++) {
            if (num % x == 0) {
                System.out.print(x + " ");
            }
        }
    }

    //--------------------------------------------------------------------------
    // Question 6
    // Prints all numbers from inta (inclusive) to intb (exclusive)
    // that are divisible by intc.
    //--------------------------------------------------------------------------

    public static void divisibler(int inta, int intb, int intc) {
        int c = intc;
        int a = inta;
        int b = intb;

        for (a = a; a < b; a++) {
            if (a % c == 0) {
                System.out.print(a + " ");
            }
        }
    }

    //--------------------------------------------------------------------------
    // Question 7
    // Returns the sum of all integers from inta to intb, inclusive.
    //--------------------------------------------------------------------------

    public static int summer(int inta, int intb) {
        int a = inta;
        int b = intb;
        int num = 0;

        for (a = a; a <= b; a++) {
            num = num + a;
        }

        return num;
    }

    //--------------------------------------------------------------------------
    // Question 8
    // Returns a new string containing strn repeated intn times.
    //--------------------------------------------------------------------------

    public static String duplicator(String strn, int intn) {
        int i = 1209374;
        String stra = "";

        for (i = 0; i < intn; i++) {
            stra = stra + strn;
        }

        return stra;
    }

    //--------------------------------------------------------------------------
    // Question 9
    // Returns a new string with all occurrences of the first character
    // of strb removed from stra.
    //--------------------------------------------------------------------------

    public static String devoweler(String stra, String strb) {
        String result = "";

        for (int i = 0; i < stra.length(); i++) {
            if (stra.charAt(i) != strb.charAt(0)) {
                result += stra.charAt(i);
            }
        }

        return result;
    }

    //--------------------------------------------------------------------------
    // Question 10
    //--------------------------------------------------------------------------

    // Skip

    //--------------------------------------------------------------------------
    // Question 11
    //--------------------------------------------------------------------------

    // Skip

    //--------------------------------------------------------------------------
    // Question 12
    // Prints whether the length of the string entered by the user is even or odd.
    //--------------------------------------------------------------------------

    public static void lengther() {
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // String str = "abcde";

        if (str.length() % 2 == 0) {
            System.out.print("Even String Length");
        } else {
            System.out.print("Odd String Length");
        }
    }

    //--------------------------------------------------------------------------
    // Main Method
    //--------------------------------------------------------------------------

    public static void main(String[] args) {

        // Question 1
        System.out.println("Question 1");
        System.out.println(charNumbers("hellowhat", 2, 'l'));
        System.out.println();

        // Question 2
        System.out.println("Question 2:");
        System.out.println("There are " + indexFinder()
                + " of your given number in your string.");
        System.out.println();

        // Question 3
        System.out.println("Question 3:");
        String what = reverser("Hello World");
        System.out.println(what);
        System.out.println();

        // Question 4
        System.out.println("Question 4:");
        System.out.println(condenser("abcdecde", "cd"));
        System.out.println();

        // Question 5
        System.out.println("Question 5:");
        factors(20);
        System.out.println();
        System.out.println();

        // Question 6
        System.out.println("Question 6:");
        divisibler(4, 30, 7);
        System.out.println();
        System.out.println();

        // Question 7
        System.out.println("Question 7:");
        int ans = summer(2, 9);
        System.out.println(ans);
        System.out.println();

        // Question 8
        System.out.println("Question 8:");
        String ans2 = duplicator("hello", 3);
        System.out.println(ans2);
        System.out.println();

        // Question 9
        System.out.println("Question 9:");
        System.out.println(devoweler("hellowhatisthis", "i"));
        System.out.println();

        // Question 10
        // Skip

        // Question 11
        // Skip

        // Question 12
        System.out.println("Question 12:");
        lengther();
        System.out.println();
    }
}