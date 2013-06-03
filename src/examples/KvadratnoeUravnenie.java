package examples;

/**
 * User: gibppo
 */
public class KvadratnoeUravnenie {

    double result[];

    public double[] returnKoren(double a, double b, double c) {

        double d = b*b - 4*a*c;

        double x1 = (-b + Math.sqrt(d)) / (2*a);

        double x2 = (-b - Math.sqrt(d)) / (2*a);

        if (d>0) {

            result = new double[]{x1, x2};
        }     else  if (d == 0) {

            result = new double[]{x1};
        }else {
            result = new double[]{};
        }
        return result;
    }
}
