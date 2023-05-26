package org.example;

import java.util.InputMismatchException;

public class TriangleCalculator {

    public Double calculateSquare(Object a, Object b, Object c) {
        double a_, b_, c_;
        a_ = Double.parseDouble(a.toString());
        b_ = Double.parseDouble(b.toString());
        c_ = Double.parseDouble(c.toString());
        return calculateSquare(a_, b_, c_);
    }

    private Double calculateSquare(double a, double b, double c) {
        if (a < 0 || b < 0) {
            throw new InputMismatchException();
        }
        double p = (a + b + c) / 2.0;
        double res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if (res == 0.0 && (a + b <= c || a + c <= b || a + c <= b)) {
            throw new InputMismatchException();
        }
        return res;
    }
}

