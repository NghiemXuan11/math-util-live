/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ou.mathutil;

/**
 *
 * @author 11112
 */
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {

    //n! = 1.2.3.4.5.6...n
    //Quy ước: 0! = 1! = 1
    //Không tính giai thừa âm cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm, 21 giai thừa, ta ko tính, ta đập vào mặt ai xài hàm này 1 ngoại lệ
    //chửi éo tính dc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }
        //hàm dừng liền éo cần return

        //xuống đây là n = 0..20 rồi
        if (n == 0 || n == 1) {
            return 1; //dừng ngay khi n đặc biệt
        }
        //xuống đến đây, n = 2..20 rồi
        //Chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi ốc bu
        //i = 2, i = 3, i = 4, i = 5, i = n nhồi liên tục i vào tích
        long product = 1; //tích khởi đầu = 1, nhồi 2 3 4 5 6 7 8...n
        for (int i = 1; i <= n; i++) {
            product *= i; //nhồi liên tục product
        } //nhân từ 2 đến n
        return product;
    }
}
