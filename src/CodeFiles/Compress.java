/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author ABHISHEK
 */
public class Compress {
    public static void compressFunction(File press) throws FileNotFoundException, IOException{
        String fileDirectory = press.getParent();
        System.out.println(fileDirectory);
        FileInputStream fis = new FileInputStream(press);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "\\CompressedFile.gz");
        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
        
        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer))!= -1){
            gzipOS.write(buffer,0,len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
    }
   public static void main(String[] args) throws IOException{
       File path = new File("E:\\Project\\Compress 1.txt");
       
       compressFunction(path);
   } 
}
