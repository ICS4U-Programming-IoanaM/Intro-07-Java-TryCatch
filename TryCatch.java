import java.util.Scanner;

/**
 * Calculates volume of a sphere, with try catch.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-20
 */
public final class TryCatch {
  /** Private constructor to prevent instantiation of this utility class. */
  private TryCatch() { }

  /**
   * The main method calculates volume of a sphere.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(final String[] args) {
    // import scanner and getting user radius from user.
    final Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius (cm): ");
    final String stringRadius = sc.nextLine();

    // try catch to make sure no strings are entered.
    try {
      // converts string to double.
      final double radius = Double.parseDouble(stringRadius);

      // calculates the volume.
      final double volume = (4d / 3d) * Math.PI * Math.pow(radius, 3);

      // prints volume to console.
      System.out.format("The volume of the sphere is %.3f cm", volume);
      System.out.println();

    } catch (NumberFormatException error) {
      System.out.println("Invalid input, please enter a number.");
    }

    // closes scanner.
    sc.close();
  }
}
