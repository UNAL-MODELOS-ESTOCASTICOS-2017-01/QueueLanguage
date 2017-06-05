
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
public class Util {
    private static Random rand = new Random();
    public static double suma = 0, llamados = 0;

    //Uniforme
    public static double getUniform(){
        return getUniform(0.0, 1.0);
    }
    //generate uniform variables
    public static double getUniform(double a, double b) {
        return (rand.nextDouble()*(b-a))+a;
    }
    //generate exponential variables
    public static double getExponential(double lambda)
    {
        double temp = -(1.0/lambda)*Math.log(1.0 - rand.nextDouble());
        suma += temp;
        llamados += 1;
        return temp;
    }
}
