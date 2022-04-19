package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DanhSachHangHoa {
    private List<HangHoa> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    ConsoleInputEdit consoleInputEdit = new ConsoleInputEdit();
    /**
     * init HangHoaDoc object and
     * read list HangHoa when init DanhSachHangHoa object
     */
    private int soLuongHangDienMay;
    private int soLuongHangThucPham;
    private int soLuongHangSanhSu;

    public int getSoLuongHangDienMay() {
        return soLuongHangDienMay;
    }

    public int getSoLuongHangSanhSu() {
        return soLuongHangSanhSu;
    }

    public int getSoLuongHangThucPham() {
        return soLuongHangThucPham;
    }

    public DanhSachHangHoa() {

    }

    public void them(HangHoa hangHoa) {
        this.list.add(hangHoa);
        FileWriter.write("hanghoa.txt", list);
        

    }

    public void output() {
        for (HangHoa hangHoa : list) {
            System.out.println(hangHoa);
           
        }

    }

    // xoa
    public void xoaHangHoa(HangHoa hangHoa) {
        this.list.remove(hangHoa);
    }

    // timkiem
    public HangHoa timHangHoaTheoMa(String maHH) {
        HangHoa hangHoa = null;
        for (HangHoa hh : list) {
            if (hh.getMaHang().toString().equalsIgnoreCase(maHH)) {
                hangHoa = hh;
            }
        }
        return hangHoa;
    }

    // tìm kiếm loại hành hóa dựa tren ma hàng
    public HangDienMay timHangĐmTheoMa(String maHH) {
        HangDienMay hangDienMay = null;
        for (HangHoa hh : list) {
            if (hh.getMaHang().toString().equalsIgnoreCase(maHH)) {
                hangDienMay = (HangDienMay) hh;
            }
        }
        return hangDienMay;
    }

    public HangSanhSu timHangSsTheoMa(String maHH) {
        HangSanhSu hangSanhSu = null;
        for (HangHoa hh : list) {
            if (hh.getMaHang().toString().equalsIgnoreCase(maHH)) {
                hangSanhSu = (HangSanhSu) hh;
            }
        }
        return hangSanhSu;
    }

    public HangThucPham timHangTpTheoMa(String maHH) {
        HangThucPham hangThucPham = null;
        for (HangHoa hh : list) {
            if (hh.getMaHang().toString().equalsIgnoreCase(maHH)) {
                hangThucPham = (HangThucPham) hh;
            }
        }
        return hangThucPham;
    }

    // edit
    public int timViTriHoaDon(HangHoa hangHoa) {
        int viTri = -1;
        viTri = this.list.indexOf(hangHoa);
        return viTri;
    }
    
    public void editHangHoa(String maHang) throws ParseException{
        int viTri = timViTriHoaDon(timHangHoaTheoMa(maHang));
        if(viTri == -1){
            System.out.println("không tìm thấy hàng hóa theo yêu cầu ");
        } else {
            ConsoleInputEdit consoleInputEdit = new ConsoleInputEdit();
            HangHoa hangHoa = consoleInputEdit.inputEditHangHoa();
            if(hangHoa!= null)
            this.list.set(viTri, hangHoa);
            System.out.println("edit sussecfully!!");  
        }
    }

    

 

    public void SortHangHoa() {
        Collections.sort(list, new SortHangHoa());
        System.out.println("hang hoa da duoc sap xep");
    }

    public void tinhTongSLTungLoai() {
        int SltKHangDienMay = 0;
        int SltKHangThucPham = 0;
        int SltKHangSanhSu = 0;

        for (HangHoa hangHoa : list) {
            if (hangHoa instanceof HangDienMay) {
                SltKHangDienMay = SltKHangDienMay + hangHoa.getSoLuongTon();
            } else if (hangHoa instanceof HangSanhSu) {
                SltKHangSanhSu = SltKHangSanhSu + hangHoa.getSoLuongTon();
            } else if (hangHoa instanceof HangThucPham) {
                SltKHangThucPham = SltKHangThucPham + hangHoa.getSoLuongTon();
            }
        }
        System.out.println(" - tổng số lượng hàng điện: " + SltKHangDienMay + "\n - tổng số lượng hàng sành sứ: "
                + SltKHangSanhSu + "\n - tổng số lượng hàng thực phẩm: " + SltKHangThucPham);
    }

    // tim kiem
    public void timKiemHangTheoMa(String maHang) {
        for (HangHoa hangHoa : list) {

            if (maHang.equals(hangHoa.getMaHang())) {
                System.out.println(hangHoa);
            }
        }

    }

    public void BaoCao() {

    }
}
