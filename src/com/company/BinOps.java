package com.company;

public class BinOps {
    public String sum(String a, String b) {
        int sumParse = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        String sum = Integer.toBinaryString(sumParse);
        return sum;
    }

    public String mult(String a, String b) {
        int multParse = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        String mult = Integer.toBinaryString(multParse);
        return mult;
    }
}
