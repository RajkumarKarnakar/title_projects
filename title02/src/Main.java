//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 sealed class QuadraticEquationsSolver permits Main  {
    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void solve(double a, double b, double c) {
        double d = discriminant(a, b, c);
        if (d < 0) {
            System.out.println("No roots");
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("x = " + ((-b) / (2.0 * a)));
        }
    }
}
public final class Main extends QuadraticEquationsSolver {
    public static void main(String[] args) {
//QuadraticEquationsSolver.solve(1,5,6);
        solve(1,5,6);
}}


