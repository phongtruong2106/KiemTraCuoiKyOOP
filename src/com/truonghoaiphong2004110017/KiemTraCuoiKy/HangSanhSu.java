package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HangSanhSu extends HangHoa{

    public HangSanhSu(String maHang) {
        super(maHang);
        //TODO Auto-generated constructor stub
    }

    private String nhaSanXuat;
    private Date ngayNhapKho;


    @Override
    public double Vat() {
        // TODO Auto-generated method stub
        double vat = 0;
        vat = this.getDonGia() * 0.1;
        return vat;
    }

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, Date ngayNhapKho)
    {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngayNhapKho =ngayNhapKho;
        this.nhaSanXuat = nhaSanXuat;
    }
    public HangSanhSu(String tenHang, int soLuongTon, double donGia, String nhaSanXuat, Date ngayNhapKho)
    {
        super(tenHang, soLuongTon, donGia);
        this.ngayNhapKho =ngayNhapKho;
        this.nhaSanXuat = nhaSanXuat;
    }



    @Override
    public String toString() {
        SimpleDateFormat ngayVN= new SimpleDateFormat("dd/MM/yyyy");
        // TODO Auto-generated method stub
        return " \n Hang Sanh Su: [nha san xuat: " + nhaSanXuat + ", ngay nhap kho: " + ngayVN.format(ngayNhapKho) + ", vat: " + Vat() + ", danh gia hang hoa: " + DanhGiaHangHoa() + "]" +super.toString();
    }

    @Override
    public String DanhGiaHangHoa() {
        String str = "khong danh gia";
        // TODO Auto-generated method stub
        if(this.getSoLuongTon() > 50 && ThoiGianLuuKho() > 10){
            str = "ban cham";
        }else {
            str = "ban nhanh";
        }
        return str;
    }

    private int ThoiGianLuuKho() {
        Date ngayHT = new Date();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Date ngayNhapKho = this.getNgayNhapKho();
        calendar.setTime(ngayNhapKho);
        int ngay = calendar.get(calendar.DATE);
        int thang = calendar.get(calendar.MONTH) + 1;
        int nam = calendar.get(calendar.YEAR);
        calendar2.setTime(ngayHT);
        int ngayhienTai = calendar2.get(calendar2.DATE);
        int thangHienTai = calendar2.get(calendar2.MONTH) + 1;
        int namHienTai = calendar2.get(calendar2.YEAR);
        int timeLuuKho = 0;
        for(int i =0; i < 10; i++){
            for(int j = 0; j < 12; j++){
                if(namHienTai == ( nam + i)){
                    if(thangHienTai == (thang +j)){
                        timeLuuKho = ngayhienTai - ngay;
                        timeLuuKho += (j * 30);
                    }
                    timeLuuKho += (i*365);
                }
            }
        }
        return timeLuuKho;
    }

    private Date getNgayNhapKho() {
        return null;
    }
}
