package com.truonghoaiphong2004110017.KiemTraCuoiKy;

public abstract class HangHoa {
    private String maHang;
    private String tenHang;
    private int soLuongTon; 
    private double donGia;


    public HangHoa(String maHang){
        this.setmaHang(maHang);
    }

    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia){
        this.setmaHang(maHang);
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    //get and set
    private void setmaHang(String maHang){
        if(maHang != null){
            this.maHang = maHang;
        } else {
            System.out.println("không được để rỗng");
        }
    }

    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        } else {
            System.out.println("không được để rỗng");
        }
    }

    public void setSoLuongTon(int soLuongTon) {
        if(soLuongTon >= 0){
            this.soLuongTon = soLuongTon;
        } else {
            System.out.println("error!! input again");
        }
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setDonGia(double donGia) {
       if(donGia > 0 ){
           this.donGia = donGia;
       } else {
           System.out.println("error!! input again");
       }
    }

    public double getDonGia() {
        return donGia;
    }


    public abstract float Vat();


    @Override
    public String toString() {
        return "Kho [donGia=" + donGia + ", maHang=" + maHang + ", soLuongTon=" + soLuongTon + ", tenHang=" + tenHang
                + "]";
    }

    public Object getMaHang() {
        return null;
    }

}
