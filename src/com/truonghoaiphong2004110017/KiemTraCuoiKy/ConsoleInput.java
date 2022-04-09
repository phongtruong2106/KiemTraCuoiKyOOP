package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsoleInput {
    public Scanner input = new Scanner(System.in);
 
    public HangHoa inputHangHoa() throws ParseException{
        SimpleDateFormat ngayVn = new SimpleDateFormat("dd/MM/yyyy");
        HangHoa hangHoa = null;
        System.out.print("nhap ma hang: ");
        String maHang = input.nextLine();
        System.out.print("nhap ten hang: ");
        String tenHang = input.nextLine();
        System.out.print("nhap so luong ton kho; ");
        int soLuongTon = input.nextInt();
        input.nextLine();
        System.out.print("nhap don gia: ");
        double donGia = input.nextDouble();
 
        //nhập từng loại hàng hóa (nhập con)
        System.out.print("-> vui lòng chọn hàng hóa muốn nhập: (1) sanhSu (2)dienMay (3)thucPham");
        int loai = input.nextInt();
        input.nextLine();
        if(loai == 1){
            System.out.print("nha san xuat: ");
            String nhaSanXuat = input.nextLine();
            System.out.print("ngay nhap kho: ");
            Date ngayNhapKho = ngayVn.parse(input.nextLine());
            hangHoa =  new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);      
        }
        if(loai == 2){
            System.out.print("nhap ngay bao hanh: ");
            int ngayBaoHanh = input.nextInt();
            System.out.print("nhap cong xuat: ");
            int congXuat = input.nextInt();

            hangHoa = new HangDienMay(maHang, tenHang, soLuongTon, donGia, ngayBaoHanh, congXuat);
        }
        if(loai == 3){
            System.out.print("ngay san xuat: ");
            String nsx = input.nextLine();
            Date ngaySanXuat = ngayVn.parse(nsx);
            System.out.print("ngay het han: ");
            String nhh = input.nextLine();
            Date ngayHetHan = ngayVn.parse(nhh);
            System.out.print("nha cung cap: ");
            String nhaCungCap = input.nextLine();

            hangHoa = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
        }

        return hangHoa;
       
    }
}
