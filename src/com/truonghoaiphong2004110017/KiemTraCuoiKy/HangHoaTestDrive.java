package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.text.ParseException;
import java.util.Scanner;

public class HangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        ConsoleInput consoleInput = new ConsoleInput();
        DanhSachHangHoa danhSachHangHoa =new DanhSachHangHoa();
        Scanner sc = new Scanner(System.in);
        int x;

        do{
            System.out.println("\t\t0. thoat");
            System.out.println("\t\t1. them hang hoa");
            System.out.println("\t\t2. hien thi");
            System.out.println("\t\t3. xoa hang hoa");
            System.out.println("\t\t4. sua hang hoa");
            x = sc.nextInt();
            switch(x){
                case 1:
                String nhapTiep = null;

                // Nhap
                do {
                    HangHoa hangHoa = consoleInput.inputHangHoa();
                    danhSachHangHoa.them(hangHoa);
                    System.out.print("ban co muon nhap tiep hay khong Y/N");
                    nhapTiep = consoleInput.input.nextLine();
                    consoleInput.input.nextLine();
        
                } while (nhapTiep.equalsIgnoreCase("y"));
                break;
                case 2:
                danhSachHangHoa.output();
                break;
                case 3:
                System.out.println("nhap loai hang hoa muon xoa(1)hang dien may (2)hang sanh su (3)hang thuc pham: ");
                int l = sc.nextInt();
                String maHH = sc.nextLine();
                if(l == 1){
                    System.out.print("nhập mã muốn xóa: ");
                    maHH = sc.nextLine(); 
                    HangDienMay hangDienMay = danhSachHangHoa.timHangĐmTheoMa(maHH);
                    danhSachHangHoa.xoaHangHoa(hangDienMay);
                }
                if(l == 2){
                    System.out.print("nhập mã muốn xóa: ");
                    maHH = sc.nextLine();
                    HangSanhSu hangSanhSu = danhSachHangHoa.timHangSsTheoMa(maHH);
                    danhSachHangHoa.xoaHangHoa(hangSanhSu);
                }
                if(l == 3){
                    System.out.print("nhập mã muốn xóa: ");
                    maHH = sc.nextLine();
                    HangThucPham hangThucPham = danhSachHangHoa.timHangTpTheoMa(maHH);
                    danhSachHangHoa.xoaHangHoa(hangThucPham);
                }
                 break;
                case 4:
              
            }
           

        }while(x!=0);
    }

   
}
