/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaaaaaaaaaaaa;

/**
 *
 * @author arnom
 */
public class awdaws {

    public static void main(String[] args) {
        double h1 = 0.05;
        double h2 = 0.02;
        double x = 0.0;
        double y = 0.0;

        // Menghitung dengan h = 0.05
        System.out.println("Menghitung dengan h = 0.05:");
        y = eulerMethod(x, y, h1, 0.1);
        System.out.printf("Nilai y(0.1) dengan h = 0.05: %.7f\n\n", y);

        // Menghitung dengan h = 0.02
        System.out.println("Menghitung dengan h = 0.02:");
        y = 0.0; // Reset nilai y
        y = eulerMethod(x, y, h2, 0.1);
        System.out.printf("Nilai y(0.1) dengan h = 0.02: %.7f\n", y);

        // Nilai y(x) asli
        double yAsli = Math.exp(0.1) - 0.1 - 1;
        System.out.printf("Nilai y(0.1) asli: %.7f\n", yAsli);

        // Perbandingan hasil
        System.out.println("\nPerbandingan:");
        System.out.printf("Error untuk h = 0.05: %.7f\n", Math.abs(y - yAsli));
        System.out.printf("Error untuk h = 0.02: %.7f\n", Math.abs(y - yAsli));
    }

    // Fungsi untuk menghitung dengan metode Euler
    public static double eulerMethod(double x, double y, double h, double targetX) {
        while (x < targetX) {
            y = y + h * (x + y);
            x += h;
        }
        return y;
    }
}
