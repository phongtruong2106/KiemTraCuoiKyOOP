package com.truonghoaiphong2004110017.KiemTraCuoiKy;

public class HangDienMay extends HangHoa{

    private int ngayBaoHanh;
    private int congXuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int ngayBaoHanh,int congXuat ){
         super(maHang, tenHang, soLuongTon, donGia);
         this.ngayBaoHanh = ngayBaoHanh;
         this.congXuat = congXuat;
    }

    public void setCongXuat(int congXuat) {
        if(congXuat > 0){
             this.congXuat = congXuat;
        } else {
             System.out.println("error!! nhập số > 0 ");
        }
    }
    public HangDienMay(String maHang) {
        super(maHang);
        //TODO Auto-generated constructor stub
    }

    @Override
    public float Vat() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {

         // TODO Auto-generated method stub
         return "Hang Dien May: [ngay bao hanh; " + ngayBaoHanh + ", công xuat: " + congXuat +  "]"+ super.toString();
    }

    
}
