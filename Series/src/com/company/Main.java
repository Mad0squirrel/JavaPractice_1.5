package com.company;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
    for (double i = 1; i < 10; i++) {
        DecimalFormat fmt = new DecimalFormat("0.###");
        double n = 1 / i;
        System.out.println(fmt.format(n));
    }
    }
}
