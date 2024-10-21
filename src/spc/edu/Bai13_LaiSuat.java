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
public class Bai13_LaiSuat {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien gui (VND): ");
        double soTienGui = scanner.nextDouble();

        System.out.print("Nhap so nam gui: ");
        double soNamGui = scanner.nextInt();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatHangNam = scanner.nextDouble();

        for (int i = 1; i <= soNamGui; i++) {
             double soTienLai = soTienGui * laiSuatHangNam / 100;
             soTienGui += soTienLai;
            
            System.out.printf("Nam %d: " + "so tien gui la " + soTienGui + " Lai suat la %.2f VND\n", i, soTienLai);
        }

        scanner.close();
    }
}
