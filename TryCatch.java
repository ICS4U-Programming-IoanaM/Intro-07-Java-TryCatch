import java.util.Scanner;
/**
 * Calculates volume of a sphere, with try catch.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-20
 */

public final class VolSphere {
  /**
   * Private constructor to prevent instantiation of this utility class.
   */
  private VolSphere() {
  }

  /**
   * The main method calculates volume of a sphere.
   *
   * @param args Command-line arguments (not used in this program)
   */
  public static void main(final String[] args) {
    // import scanner and getting user radius from user
    final Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius (cm): ");
    final double radius = sc.nextDouble();

    // volume calculations
    final double volume = (4d / 3d) * Math.PI * Math.pow(radius, 3);

    // prints volume to console
    System.out.format("The volume of the sphere is %.3f cm", volume);
    System.out.println();

    // close scanner
    sc.close();
  }
}
