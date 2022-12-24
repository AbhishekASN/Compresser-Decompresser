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
import java.util.zip.GZIPInputStream;

/**
 *
 * @author ABHISHEK
 */
public class Decompress {
    public static void decompressFunction(File press) throws FileNotFoundException, IOException{
        String fileDirectory = press.getParent();
        System.out.println(fileDirectory);
        FileInputStream fis = new FileInputStream(press);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "\\Decompress.txt");
        
        byte[] buffer = new byte[1024];
        int len;
        
        while((len= gzipIS.read(buffer))!=-1){
            fos.write(buffer, 0, len);
        }
        gzipIS.close();
        fis.close();
        fos.close();
    }
    
    
    public static void main(String[] args) throws IOException{
        File path= new File("E:\\Project\\CompressedFile.gz");
        
        decompressFunction(path);
    }
    
}
