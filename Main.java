public class Main
{
/* First things first, we need to create a static int of 4713. 
 * The reason this is static is because this value will not change.
 * This private static int is the value we add to the birth year.
 */
  private static final int JULIAN_CALENDAR_OFFSET = 4713;

  public static void main(String[] args) 
  {
    //#region - Initial Dialoge -
    //Here is the header information. It contains my name, school, class, semester, and year.
    System.out.print("\nDeveloper: Garrett Burr of Concordia University Texas. Output produced by the Java class Main for the Week 3 lab assignment in CSC 2403, Spring Semester 2023.\n" + "\n"); 
    
    //Here I am printing the person I admire + their birth year to the console.
    System.out.print("A person who I truly admire is Martin Luther King. He was born in 1929.\n");

    //I created two ints here. The first one represents the birth year of MLK, and the second int represents MLKs birth year added against the Jullian Calendar Offset. 
    int _mlkBirthYear = 1929;
    int julianCalendarYearOfBirth = _mlkBirthYear + JULIAN_CALENDAR_OFFSET;

    //Printing to the console MLKs birth year as it would be on the Julian Calendar using the int created above.
    System.out.print("On the Julian Calender his birth date is " + julianCalendarYearOfBirth + "\n");
    //#endregion

    /* Here we are creating 4 ints. The goal of these ints is to grab the birth year of MLK and split the value into Thousands, Hundreds, Tens, and Ones. 
     * This is done by taking our julianCalendarYearOfBirth int and dividing them to the corosponding values
     */
    int firstDigit = julianCalendarYearOfBirth / 1000;
    int secondDigit = (julianCalendarYearOfBirth / 100) % 10;
    int thirdDigit = (julianCalendarYearOfBirth / 10) % 10;
    int fourthDigit = julianCalendarYearOfBirth % 10;

    //Here we are displaying the results from above. The results will be seperated and the strings will be properly lined with the corosponding values.
    System.out.println("The digits comprising the Julian calendar year " + julianCalendarYearOfBirth + "\n" + "Thousands = " + firstDigit + "\n" + "Hundreds = "+ secondDigit + "\n" + "Tens = " + thirdDigit + "\n" + "Ones = " + fourthDigit);
    //Since we now have our Thousands, Hundreds, Tens, and Ones values, we need to find the sum. This is done by adding our ints from above to produce the sum result. 
    System.out.println("Sum of Digits: " + (firstDigit + secondDigit + thirdDigit + fourthDigit) + "\n");

    /* To handle the ASCII result part of this lab I will be using a for loop to help automate the process. 
     * The first thing to do is print a line to the console that explains what will be taking place.
     * Then using a for loop, I am initializing i at 48 and saying that from 48 - 57 incrimate i.
     * The results will then be printed out to the console and uses the (char) typecast operator to fit the value of i to it's corosponding place in the ASCII table.
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
  }
}