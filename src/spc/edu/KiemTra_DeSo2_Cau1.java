/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class KiemTra_DeSo2_Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so Fibonacci muon hien thi: ");
        int n = scanner.nextInt();

        ArrayList<Integer> fibonacciArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacciArr.add(1);
            } else if (i == 1) {
                fibonacciArr.add(1);
            } else {
                int nextFibonacci = fibonacciArr.get(i - 1) + fibonacciArr.get(i - 2);
                fibonacciArr.add(nextFibonacci);
            }
        }

        System.out.print("Day so Fibonacci: ");
        for (int number : fibonacciArr) {
            System.out.print(number + " ");
        }

        int sum = 0;
        for (int number : fibonacciArr) {
            sum += number;
        }

        System.out.println("\nTong cua day so: " + sum);
        scanner.close();
    }
}
