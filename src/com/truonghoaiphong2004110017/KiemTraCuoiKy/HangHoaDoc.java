package com.truonghoaiphong2004110017.KiemTraCuoiKy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class HangHoaDoc {
    private static final String HANG_HOA_FILE_NAME = "hangHoa.txt";

    //luu danh sach hang hoa vao  file

    public void write(List<HangHoa> listHangHoa){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(new File(HANG_HOA_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listHangHoa);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    
        //doc  danh sach hang hoa tu file
        public List<HangHoa> read(){
            List<HangHoa> listHangHoa = new ArrayList<>();
                FileInputStream fis = null;
                ObjectInputStream ois = null;
                try{
                    fis = new FileInputStream(new File(HANG_HOA_FILE_NAME));
                    ois = new ObjectInputStream(fis);
                    listHangHoa = (List<HangHoa>) ois.readObject();
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                } catch (ClassNotFoundException e){
                    e.printStackTrace();
                } finally {
                    closeStream(fis);
                    closeStream(ois);
                }
                
                return listHangHoa;
        }

        // close input Stream
        private void closeStream(InputStream is){
            if(is != null){
                try{
                    is.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        // close output Stream
        private void closeStream(OutputStream os){
            if(os != null){
                try{
                    os.close();

                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        
}
