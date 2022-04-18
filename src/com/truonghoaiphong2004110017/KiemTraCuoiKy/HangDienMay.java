package com.truonghoaiphong2004110017.KiemTraCuoiKy;


public class HangDienMay extends HangHoa{
 
    private int ngayBaoHanh;
    private int congXuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int ngayBaoHanh,int congXuat ){
         super(maHang, tenHang, soLuongTon, donGia);
         this.ngayBaoHanh = ngayBaoHanh;
         this.congXuat = congXuat;
    }
    public HangDienMay(String tenHang, int soLuongTon, double donGia, int ngayBaoHanh,int congXuat ){
        super(tenHang, soLuongTon, donGia);
        this.ngayBaoHanh = ngayBaoHanh;
        this.congXuat = congXuat;
   }
    public void setNgayBaoHanh(int ngayBaoHanh) {
       if(ngayBaoHanh >= 0){
           this.ngayBaoHanh = ngayBaoHanh;
       } else{
           System.out.println("ngay bao hanh hang dien may phai lon hon 0, 30(tinh theo thang)");
       }
    }

    public void setCongXuat(int congXuat) {
        if(congXuat > 0){
             this.congXuat = congXuat;
        } else {
             System.out.println("error!!cong xuat phai lon hon 0 ");
        }
    }
    public HangDienMay(String maHang) {
        super(maHang);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double Vat() {
        double vat = 0;
        vat = this.getDonGia() * 0.1;
        // TODO Auto-generated method stub
        return vat;
    }
    @Override
    public String toString() {

         // TODO Auto-generated method stub
         return "\n Hang Dien May: [ngay bao hanh; " + ngayBaoHanh + ", công xuat: " + congXuat + ", vat: " + Vat() + ", đánh giá tình trạng hàng hóa: " + DanhGiaHangHoa() +"]"+ super.toString();
    }

    @Override
    public String DanhGiaHangHoa() {
        String str = "khong danh gia";
        // TODO Auto-generated method stub
        if(this.getSoLuongTon() < 3){
            str = "khong ban duoc";
        }else {
            str = "ban duoc";
        }
        return str;
    }


    
}
