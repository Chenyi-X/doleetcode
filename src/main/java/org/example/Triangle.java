package org.example;

public class Triangle {
    private  double a,b,c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getC() {
        return a + b + c;
    }
    public double getA() {
        double p = this.getC() / 2;
        return  Math.sqrt(p *(p -a)*(p -b)*(p -c));
    }

    @Override
    public String toString() {
        return a + " " + b + " " + c ;
    }
}
