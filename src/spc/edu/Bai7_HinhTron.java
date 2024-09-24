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
public class Bai7_HinhTron {
      public static void main(String[] args) {
        System.out.println("TINH DIEN TICH VA CHU VI HINH TRON");
        double banKinh, chuVi, dienTich;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextDouble();
        
        chuVi = 2 * Math.PI * banKinh;
        dienTich = Math.PI * banKinh * banKinh;
        
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }
}
