package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class HangHoaDoc {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("hanghoa.txt");
            FileReader fr = new FileReader(f);
            //Bước 2: Đọc dữ liệu
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
              System.out.println(line);
            }
            //Bước 3: Đóng luồng
            fr.close();
            br.close();
           } catch (Exception ex) {
             System.out.println("Loi doc file: "+ex);
         }
        }
    }
        

