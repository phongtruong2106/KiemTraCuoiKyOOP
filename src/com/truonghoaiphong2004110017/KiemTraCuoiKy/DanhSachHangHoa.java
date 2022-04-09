package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHangHoa {
    private List<HangHoa> list = new ArrayList<>();
    private HangHoaDoc hangHoaDoc;
     /**
     * init HangHoaDoc object and
     * read list HangHoa when init DanhSachHangHoa object
     */   
    public DanhSachHangHoa(){
        hangHoaDoc = new HangHoaDoc();
        list = hangHoaDoc.read();
    }

    public void them(HangHoa hangHoa){
        this.list.add(hangHoa);
        hangHoaDoc.write(list);
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
 
     //sua
     public int timVtHH(HangHoa hangHoa){
         int viTri = -1;
         viTri = this.list.indexOf(hangHoa);
 
         return viTri;
     }
 
     public void suaHH(int viTri, HangHoa hangHoa){
         this.list.set(viTri, hangHoa);
 
     }

     //sap xep

 
}
