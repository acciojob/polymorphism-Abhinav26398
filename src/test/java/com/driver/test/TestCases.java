package com.driver.test;

import static org.junit.Assert.*;

import com.driver.Main;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
    public static void main(String[] args) {
        Main.Product p=new Main.Product();
        int ans1=p.product(2,3);
        System.out.println(ans1);
        int ans2=p.product(2,3,4);
        System.out.println(ans2);
        double ans3=p.product(2.0,3.0);
        System.out.println(ans3);
    }
}
