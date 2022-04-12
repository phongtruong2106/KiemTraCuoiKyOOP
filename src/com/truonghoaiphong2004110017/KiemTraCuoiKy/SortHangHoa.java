package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.util.Comparator;

class SortHangHoa implements Comparator<HangHoa> {

    @Override
    public int compare(HangHoa o1, HangHoa o2) {
        // TODO Auto-generated method stub
        if(o1.getDonGia() == o2.getDonGia())
        return 0;
        else if (o1.getDonGia() > o2.getDonGia())
        return 1;
        else
        return -1;
    }
    
}
