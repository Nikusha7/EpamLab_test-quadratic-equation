package com.epam.rd.autotasks;

import java.util.logging.Logger;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    private static final Logger logger = Logger.getLogger(QuadraticEquation.class.getName());

    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }

        double d = (b * b) - (4 * a * c);
        logger.info("Discriminant: " + d);

        if (d == 0) {
            double x;
            x = (-1 * b) / (2 * a);
            return String.valueOf(x);
        } else if (d < 0) {
            return "no roots";
        }
        double x1;
        double x2;

        x1 = ((-1 * b) + sqrt(d)) / (2 * a);
        x2 = ((-1 * b) - sqrt(d)) / (2 * a);

        return x1 + " " + x2;

//        below given returns "x1 x2" and "x2 x1". They need to be considered in test
//        return String.format("%s %s", (-b + sqrt(b * b - 4 * a * c)) / (2 * a), (-b - sqrt(b * b - 4 * a * c)) / (2 * a));
//        return String.format("%s %s", (-b - sqrt(b * b - 4 * a * c)) / (2 * a), (-b + sqrt(b * b - 4 * a * c)) / (2 * a));
    }

}