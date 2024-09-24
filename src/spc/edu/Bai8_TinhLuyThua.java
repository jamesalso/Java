/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class Bai8_TinhLuyThua {
     public static void main(String[] args) {
        System.out.println("TINH LUY THUA CUA MOT SO");
        double so;
        int mu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        so = sc.nextDouble();
        System.out.print("Nhap mu: ");
        mu = sc.nextInt();
        
        double ketQua = Math.pow(so, mu);
        
        System.out.println("Ket qua cua " + so + " mu " + mu + " = " + ketQua);
    }
}
