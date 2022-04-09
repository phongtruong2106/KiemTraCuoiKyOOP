package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa{

    public HangSanhSu(String maHang) {
        super(maHang);
        //TODO Auto-generated constructor stub
    }

    private String nhaSanXuat;
    private Date ngayNhapKho;


    @Override
    public float Vat() {
        // TODO Auto-generated method stub
        return 0;
    }

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, Date ngayNhapKho)
    {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngayNhapKho =ngayNhapKho;
        this.nhaSanXuat = nhaSanXuat;
    }


    @Override
    public String toString() {
        SimpleDateFormat ngayVN= new SimpleDateFormat("dd/MM/yyyy");
        // TODO Auto-generated method stub
        return "Hang Sanh Su: [nha san xuat: " + nhaSanXuat + ", ngay nhap kho: " + ngayVN.format(ngayNhapKho) + "]" +super.toString();
    }
}
