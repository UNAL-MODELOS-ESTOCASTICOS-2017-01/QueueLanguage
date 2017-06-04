
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
    
    public enum Distribution {
        POISSON, BINOMIAL, NORMAL, UNIFORME, EXPONENTIAL, NONE;
    }
    public static double getDistribution(Distribution dist){
        switch(dist){
            case POISSON:
                return getPoisson();
            case BINOMIAL:
                return getBinomial();
            case EXPONENTIAL:
                return getExponential();
        }
        return getExponential();
    }
    //Poisson-Exponencial
    public static double getExponential(){
        return rand.nextDouble();
    }
    public static double getPoisson(){
        return getPoisson(0.5);
    }
    public static double getPoisson(double lambda){
        return rand.nextDouble();
    }
    //Binomial
    public static double getBinomial(){
        return getBinomial(0.5, 10);
    }
    public static double getBinomial(double p, double n){
        return rand.nextDouble();
    }
    //Normal
    public static double getNormal(){
        return rand.nextGaussian();
    }
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
        return -(1.0/lambda)*Math.log(1.0 - rand.nextDouble());
    }
}
