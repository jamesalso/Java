/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class Bai15_ArrayList {
    public static void main(String[] args) {
         ArrayList numbers = new ArrayList<>();

        // Thêm các số từ 1 đến 100 vào ArrayList
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // Đo độ dài của ArrayList
        int length = numbers.size();
        System.out.println("Do dai cua ArrayList: " + length);

        System.out.println(); // Xuống dòng
        
        numbers.add(0, "Khuong");
        System.out.println(numbers);

        // Đo độ dài của ArrayList sau khi thêm số mới
        length = numbers.size();
        System.out.println("Do dai sau khi add: " + length);
    }
}
