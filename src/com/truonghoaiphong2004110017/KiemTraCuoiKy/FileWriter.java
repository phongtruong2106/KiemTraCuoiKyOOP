package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

class FileWriter {
    public static void write(String fileName, List<HangHoa> listHangHoa) {
    File file = new File(fileName);//File
    PrintWriter out;
    try {
        out = new PrintWriter(file);
        out.println(listHangHoa);
        out.close();
    } catch (FileNotFoundException e) {
        System.out.println("Sai roi ");
        e.printStackTrace();
    }//Ghi vao File chuoi s
   
   
    }
}
