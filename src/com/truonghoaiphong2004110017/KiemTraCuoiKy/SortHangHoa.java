package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.util.Comparator;

public class SortHangHoa implements Comparator<HangHoa>{

    @Override
    public int compare(HangHoa o1, HangHoa o2) {
        if(o1.getDonGia() > o2.getDonGia()){
            return 1;
        }
        return -1;
    }
    
}
