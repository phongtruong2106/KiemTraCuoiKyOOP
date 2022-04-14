package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DanhSachHangHoa {
    private List<HangHoa> list = new ArrayList<>();
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
    public DanhSachHangHoa(){

    }

    public void them(HangHoa hangHoa){
        this.list.add(hangHoa);
        FileWriter.write("hanghoa.txt", list);
        
        
    }

    public void output(){
        for(HangHoa hangHoa : list){
            System.out.println(hangHoa);
        }

    }
 
    //xoa
    public void xoaHangHoa(HangHoa hangHoa){
             this.list.remove(hangHoa);
    }
 
    // timkiem
     public HangHoa timHoaDonTheoMa(String maHH) {
     HangHoa hangHoa = null;
     for (HangHoa hh : list) {
         if (hh.getMaHang().toString().equalsIgnoreCase(maHH)) {
             hangHoa = hh;
         }
     }
     return hangHoa;
 }
 
   
 
    //tìm kiếm loại hành hóa dựa tren ma hàng 
    public HangDienMay timHangĐmTheoMa(String maHH){
             HangDienMay hangDienMay = null;
             for(HangHoa hh : list){
                 if(hh.getMaHang().toString().equalsIgnoreCase(maHH)){
                     hangDienMay =  (HangDienMay) hh;
                 }
             }
             return hangDienMay;
     }
 
     
     public HangSanhSu timHangSsTheoMa(String maHH){
         HangSanhSu hangSanhSu = null;
         for(HangHoa hh : list){
             if(hh.getMaHang().toString().equalsIgnoreCase(maHH)){
                 hangSanhSu = (HangSanhSu) hh;
             }
         }
         return hangSanhSu;
     }
 
     public HangThucPham timHangTpTheoMa(String maHH){
         HangThucPham hangThucPham = null;
         for(HangHoa hh : list){
             if(hh.getMaHang().toString().equalsIgnoreCase(maHH)){
                 hangThucPham = (HangThucPham) hh;
             }
         }
         return hangThucPham;
     }
 
     //edit
     public void edit(String id) {
        boolean isExisted = false;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getMaHang() == id) {
                isExisted = true;
                list.get(i);
                
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            FileWriter.write("hanghoa.txt", list);
        }
    }

    public Iterator<HangDienMay> iterator() {
        return null;
    }

    public void SortHangHoa(){
        Collections.sort(list, new SortHangHoa());
        System.out.println("hang hoa da duoc sap xep");
    }

    public void tinhTongSLTungLoai() {
        int SltKHangDienMay = 0;
        int SltKHangThucPham = 0;
        int SltKHangSanhSu = 0;

        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof HangDienMay){
                SltKHangDienMay = SltKHangDienMay + hangHoa.getSoLuongTon();
           }else if(hangHoa instanceof HangSanhSu){
                SltKHangSanhSu = SltKHangSanhSu + hangHoa.getSoLuongTon();
           }else if(hangHoa instanceof HangThucPham){
                SltKHangThucPham = SltKHangThucPham + hangHoa.getSoLuongTon();
           } 
        } System.out.println(" - tổng số lượng hàng điện: " + SltKHangDienMay + "\n - tổng số lượng hàng sành sứ: " +SltKHangSanhSu + "\n - tổng số lượng hàng thực phẩm: " + SltKHangThucPham);

      

    }
}
