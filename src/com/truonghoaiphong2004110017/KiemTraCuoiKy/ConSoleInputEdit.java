package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputEdit {
    public Scanner input = new Scanner(System.in);
 
    public HangHoa inputEditHangHoa() throws ParseException{
        SimpleDateFormat ngayVn = new SimpleDateFormat("dd/MM/yyyy");
        HangHoa hangHoa = null;
        System.out.print("-> vui lòng chọn hàng hóa muốn nhập: (1) sanhSu (2)dienMay (3)thucPham");
        int loai = input.nextInt();
        input.nextLine();
        if(loai == 1){
            try {
                System.out.print("nhap ten hang: ");
                String tenHang = input.nextLine();
                input.nextLine();
                System.out.print("nhap so luong ton kho; ");
                int soLuongTon = input.nextInt();
                input.nextLine();
                System.out.print("nhap don gia: ");
                double donGia = input.nextDouble();
                System.out.print("nha san xuat: ");
                String nhaSanXuat = input.nextLine();
                input.nextLine();
                System.out.print("ngay nhap kho: ");
                Date ngayNhapKho = ngayVn.parse(input.nextLine());
                hangHoa = new HangSanhSu(tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
                
            } catch (InputMismatchException ex) {
                //TODO: handle exception
                System.out.println("LỖI RỒI!!!");
                System.out.println("Ban nen nha so nha!!!");
                ex.printStackTrace();
            }

            try {
                System.out.println("bạn vui lòng nhập lại thông tin sửa nha!!");
                System.out.print("nhap ten hang: ");
                String tenHang = input.nextLine();
                input.nextLine();
                System.out.print("nhap so luong ton kho; ");
                int soLuongTon = input.nextInt();
                input.nextLine();
                System.out.print("nhap don gia: ");
                double donGia = input.nextDouble();
                System.out.print("nha san xuat: ");
                String nhaSanXuat = input.nextLine();
                input.nextLine();
                System.out.print("ngay nhap kho: ");
                Date ngayNhapKho = ngayVn.parse(input.nextLine());
                hangHoa = new HangSanhSu(tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
                
            } catch (InputMismatchException ex) {
                //TODO: handle exception
                ex.printStackTrace();  
            }catch(ArithmeticException exception){
                exception.printStackTrace();
            }
        }
        if(loai == 2){
            try {
                System.out.print("nhap ten hang: ");
                String tenHang = input.nextLine();
                System.out.print("nhap so luong ton kho; ");
                int soLuongTon = input.nextInt();
                input.nextLine();
                System.out.print("nhap don gia: ");
                double donGia = input.nextDouble();
                System.out.print("nhap ngay bao hanh: ");
                int ngayBaoHanh = input.nextInt();
                System.out.print("nhap cong xuat: ");
                int congXuat = input.nextInt();
                hangHoa = new HangDienMay(tenHang, soLuongTon, donGia, ngayBaoHanh, congXuat);
               
            } catch (InputMismatchException ex) {
                //TODO: handle exception
                 //TODO: handle exception
                 System.out.println("LỖI RỒI!!!");
                 System.out.println("Ban nen nha so nha!!!");
                 ex.printStackTrace();
            }

            try {
                System.out.println("bạn vui lòng nhập lại thông tin sửa nha!!");
                System.out.print("nhap ten hang: ");
                String tenHang = input.nextLine();
                System.out.print("nhap so luong ton kho; ");
                int soLuongTon = input.nextInt();
                input.nextLine();
                System.out.print("nhap don gia: ");
                double donGia = input.nextDouble();
                System.out.print("nhap ngay bao hanh: ");
                int ngayBaoHanh = input.nextInt();
                System.out.print("nhap cong xuat: ");
                int congXuat = input.nextInt();
                hangHoa = new HangDienMay(tenHang, soLuongTon, donGia, ngayBaoHanh, congXuat);
            }catch (InputMismatchException ex) {
                //TODO: handle exception
                ex.printStackTrace();  
            }catch(ArithmeticException exception){
                exception.printStackTrace();
            }
        }
        if(loai == 3){
            try {
                
                System.out.print("nhap ten hang: ");
                String tenHang = input.nextLine();
                System.out.print("nhap so luong ton kho; ");
                int soLuongTon = input.nextInt();
                input.nextLine();
                System.out.print("nhap don gia: ");
                double donGia = input.nextDouble();
                System.out.print("ngay san xuat: ");
                String nsx = input.nextLine();
                Date ngaySanXuat = ngayVn.parse(nsx);
                System.out.print("ngay het han: ");
                String nhh = input.nextLine();
                Date ngayHetHan = ngayVn.parse(nhh);
                System.out.print("nha cung cap: ");
                String nhaCungCap = input.nextLine();
                hangHoa = new HangThucPham(tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
                
            }catch (InputMismatchException ex) {
                //TODO: handle exception
                System.out.println("LỖI RỒI!!!");
                System.out.println("Ban nen nha so nha!!!");
                ex.printStackTrace();
            }

            try {
                System.out.println("bạn vui lòng nhập lại thông tin sửa nha!!");
                System.out.print("nhap ten hang: ");
                String tenHang = input.nextLine();
                System.out.print("nhap so luong ton kho; ");
                int soLuongTon = input.nextInt();
                input.nextLine();
                System.out.print("nhap don gia: ");
                double donGia = input.nextDouble();
                System.out.print("ngay san xuat: ");
                String nsx = input.nextLine();
                Date ngaySanXuat = ngayVn.parse(nsx);
                System.out.print("ngay het han: ");
                String nhh = input.nextLine();
                Date ngayHetHan = ngayVn.parse(nhh);
                System.out.print("nha cung cap: ");
                String nhaCungCap = input.nextLine();
                hangHoa = new HangThucPham(tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
                
            } catch (InputMismatchException ex) {
                //TODO: handle exception
                ex.printStackTrace();  
            }catch(ArithmeticException exception){
                exception.printStackTrace();
            }
           
        }

        return hangHoa;
       
    }
}
