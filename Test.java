import java.util.Scanner;

public class Test
{
/* First things first, we need to create a static int of 4713. 
 * The reason this is static is because this value will not change.
 * This private static int is the value we add to the birth year.
 */
  private static final int JULIAN_CALENDAR_OFFSET = 4713;

  public static void main(String[] args) 
  {
    //Grabing our Scanner
    Scanner scanner = new Scanner(System.in);

    //Creating our first input point
    System.out.print("Enter the name of the person you admire: ");
    String name = scanner.nextLine();

    //Creating our second input point
    System.out.print("Enter the birth year of the person you admire: ");
    int birthYear = scanner.nextInt();

    /* Here is the start of the logic that repeates the name/birth year entered by the user
     * and produces the Julian Calander year based off of the birth year input. 
     */ 
    System.out.println("Name: " + name);
    System.out.println("Birth Year: " + birthYear);
    System.out.println("Julian Calendar Year of Birth: " + (birthYear + JULIAN_CALENDAR_OFFSET));

    /* Here we are creating 5 ints. The first int is called "julianCalendarYearOfBirth" because it takes our birth year added by the Jullian Calendar offset
     * This int is what we can use to divide and get our Thousands, Hundreds, Tens, and Ones values. 
     */
    int julianCalendarYearOfBirth = birthYear + JULIAN_CALENDAR_OFFSET;
    int firstDigit = julianCalendarYearOfBirth / 1000;
    int secondDigit = (julianCalendarYearOfBirth / 100) % 10;
    int thirdDigit = (julianCalendarYearOfBirth / 10) % 10;
    int fourthDigit = julianCalendarYearOfBirth % 10;

    //Here we are displaying the results from above to the user. The results will be seperated and properly lined with the corosponding string values
    System.out.println("Digits of Julian Calendar Year of Birth: \n" + "Thousands = " + firstDigit + "\n" + "Hundreds = "+ secondDigit + "\n" + "Tens = " + thirdDigit + "\n" + "Ones = " + fourthDigit + "\n");
    //Since we now have our Thousands, Hundreds, Tens, and Ones values, we need to find the sum. This is done by adding our ints from above to produce the sum result. 
    System.out.println("Sum of Digits: " + (firstDigit + secondDigit + thirdDigit + fourthDigit) + "\n");

    /* To handle the ASCII result part of this lab I will be using a for loop to help automate the process. 
     * The first thing to do is print a line to the console that explains what will be taking place
     * Then using a for loop I am initializing I at 48 and saying that from 48 - 57 incrimate I.
     * The results will then be printed out to the console and uses the (char) typecast operator to corospond the value of I to it's corosponding place in the ASCII table.
     * 
     * This logic is then followed for the next corosponding for loops
     */ 
    System.out.println("Collating Sequence Values in the range 48-57 and the ASCII character associated with each value:");
    for (int i = 48; i <= 57; i++) 
    {
      System.out.println(i + ": " + (char)i);
    }


    System.out.println("\n Collating Sequence Values in the range 65-90 and the ASCII character associated with each value:");
    for (int i = 65; i <= 90; i++) 
    {
      System.out.println(i + ": " + (char)i);
    }

    System.out.println("\n Collating Sequence Values in the range 97-122 and the ASCII character associated with each value:");
    for (int i = 97; i <= 122; i++) 
    {
      System.out.println(i + ": " + (char)i);
    }
    //Finally once all is said and done, we close our scanner. 
    scanner.close();
  }
}