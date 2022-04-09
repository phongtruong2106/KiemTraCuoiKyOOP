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
 
}
