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
public class KiemTra_DeSo2_Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh hinh cau: ");
        double banKinh = scanner.nextDouble();

        double beMat = 4 * Math.PI * Math.pow(banKinh, 2);
        double theTich = (4.0 / 3.0) * Math.PI * Math.pow(banKinh, 3);

        System.out.printf("Dien tich be mat hinh cau: %.2f\n", beMat);
        System.out.printf("The tich hinh cau: %.2f\n", theTich);
        scanner.close();
    }
}
