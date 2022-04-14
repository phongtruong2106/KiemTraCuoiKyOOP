package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HangHoaTestDrive {
    static SimpleDateFormat ngayVnK = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException {
        
        ConsoleInput consoleInput = new ConsoleInput();
        DanhSachHangHoa danhSachHangHoa =new DanhSachHangHoa();
        Scanner sc = new Scanner(System.in);
        int x;
        String ngayNhapKho = "21/03/2022";
        String ngaySX   = "20/03/2022";
        String ngayHH = "21/07/2022";
        HangHoa hangHoa0 = new HangSanhSu("t01", "gom", 1, 9.000, "gom nha lam", ngayVnK.parse(ngayNhapKho));
        HangHoa hangHoa1 = new HangSanhSu("t02", "chau hoa", 10, 19.000, "gom nha lam", ngayVnK.parse(ngayNhapKho));
        HangHoa hangHoa2 = new HangSanhSu("t03", "ly", 21, 29.000, "gom nha lam", ngayVnK.parse(ngayNhapKho));
        HangHoa hangHoa3 = new HangSanhSu("t04", "am tra", 17, 199.000, "gom nha lam", ngayVnK.parse(ngayNhapKho));
        HangHoa hangHoa4 = new HangThucPham("e05", "ca rot", 50, 9.000, ngayVnK.parse(ngaySX), ngayVnK.parse(ngayHH), "cty thuc pham");
        HangHoa hangHoa5 = new HangThucPham("e06", "khoai lang", 20, 70.000, ngayVnK.parse(ngaySX), ngayVnK.parse(ngayHH), "cty thuc pham");
        HangHoa hangHoa10 = new HangThucPham("e06", "khoai tay", 10, 10.000, ngayVnK.parse(ngaySX), ngayVnK.parse(ngayHH), "cty thuc pham");
        HangHoa hangHoa6 = new HangDienMay("d07", "quat may", 3, 70.000, 30, 80);
        HangHoa hangHoa7 = new HangDienMay("d08", "tu lanh", 10, 1270.000, 30, 820);
        HangHoa hangHoa8 = new HangDienMay("d09", "ti vi", 30, 1070.000, 30, 60);
        HangHoa hangHoa9 = new HangDienMay("d010", "den dien", 3, 10.000, 30, 100);
        danhSachHangHoa.them(hangHoa0);
        danhSachHangHoa.them(hangHoa1);
        danhSachHangHoa.them(hangHoa2);
        danhSachHangHoa.them(hangHoa3);
        danhSachHangHoa.them(hangHoa4);
        danhSachHangHoa.them(hangHoa5);
        danhSachHangHoa.them(hangHoa6);
        danhSachHangHoa.them(hangHoa7);
        danhSachHangHoa.them(hangHoa8);
        danhSachHangHoa.them(hangHoa9);
        danhSachHangHoa.them(hangHoa10);

        do{
            System.out.println("\t\t0. thoat");
            System.out.println("\t\t1. them hang hoa");
            System.out.println("\t\t2. hien thi");
            System.out.println("\t\t3. xoa hang hoa");
            System.out.println("\t\t4. sap xep hang hoa");
            System.out.println("\t\t5. thong ke hang hoa");
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
                danhSachHangHoa.SortHangHoa();
                break;
                case 5:
                danhSachHangHoa.tinhTongSLTungLoai();
                
            }
           

        }while(x!=0);
    }

   
}
