package expression;

/**
 * Created by User on 11.09.2016.
 */
public class Expression {

    public double calculate(double x, double y){
        return getNominator(x,y)/getDenominator(x,y) + x;
    }

    private double getNominator(double x, double y){
        return 1 + getSqr(getSin(x,y));
    }

    private double getSqr(double v){
        return Math.pow(v,2);
    }

    private double getSin(double x, double y){
        return Math.sin(x+y);
    }

    private double getDenominator(double x, double y){
        return 2 + getAbs(x - 2*x/(1+getSqr(x)*getSqr(y)));
    }

    private double getAbs(double v) {
        return Math.abs(v);
    }
}
