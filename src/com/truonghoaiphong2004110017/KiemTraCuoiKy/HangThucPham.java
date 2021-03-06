package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa implements Serializable{

    public HangThucPham(String maHang) {
        super(maHang);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double Vat() {
        // TODO Auto-generated method stub
        double vat = 0;
        vat = this.getDonGia() * 0.05;
        return vat;
    }
    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan, String nhaCungCap){
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngayHetHan =ngayHetHan;
        this.ngaySanXuat = ngaySanXuat;
        this.nhaCungCap = nhaCungCap;
    }
    public HangThucPham(String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan, String nhaCungCap){
        super(tenHang, soLuongTon, donGia);
        this.ngayHetHan =ngayHetHan;
        this.ngaySanXuat = ngaySanXuat;
        this.nhaCungCap = nhaCungCap;

    }

  

    SimpleDateFormat ngayVn = new SimpleDateFormat();   

    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan.after(ngaySanXuat)){
              this.ngayHetHan = ngayHetHan;
        } else {
            System.out.println("ngày hết hạn phải sao ngày sản xuất");
        }
      
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\n Hang Thuc pham: [ngay San Xuat: " +ngayVn.format(ngaySanXuat) + ", ngay het han: " + ngayVn.format(ngayHetHan )+ ", nha cung cap: " + nhaCungCap + ", vat: " + Vat() + ", danh gia hang hoa; " + DanhGiaHangHoa() +"]"+super.toString();
    }

    //kiểm tra hạn sủ dụng
    public boolean kiemTraHSD(){
        return this.tinhHSD();
    }

    private boolean tinhHSD() {
        boolean isHetHan = false;
        Date ngayHienTai = new Date();
        if(this.ngayHetHan.before(ngayHienTai)){
            isHetHan = true;
        }  
        return isHetHan;                                                                                                                    
    }

    @Override
    public String DanhGiaHangHoa() {
        String str = "khong danh gia";
        // TODO Auto-generated method stub
        if(this.getSoLuongTon() <= 0 && this.tinhHSD() == false){
            str = "hang kho ban";
        }else {
            str = "hang de ban";
        }
        return str;
    }


}
