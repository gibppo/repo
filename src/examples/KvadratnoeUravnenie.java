package examples;

/**
 * Created with IntelliJ IDEA.
 * User: julia.kotenko
 * Date: 29.05.13
 * Time: 19:20
 * To change this template use File | Settings | File Templates.
 */
public class KvadratnoeUravnenie {

    double result[];

    public double[] returnKoren(double a, double b, double c) {

        double d = b*b - 4*a*c;

        double x1 = (-b + Math.sqrt(d)) / (2*a);

        double x2 = (-b - Math.sqrt(d)) / (2*a);

        if (d>0) {

            double result[] = {x1, x2};
        }     else  if (d == 0) {

            double result[] = {x1};
        }else {
            double result[] = {};
        }
        return result;
    }
}
