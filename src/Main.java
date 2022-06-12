public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please enter your birth month in the form of a number 1-12.");
        int birthMonth = 13;
        if (birthMonth >1 && birthMonth <=12) {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}