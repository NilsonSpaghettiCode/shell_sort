package model;

import java.io.BufferedReader;
import java.io.FileReader;


public class FileReaderDocument        
{
    String access_path;
    String extension;
    String content_file;
 
    public FileReaderDocument(String ac_path, String ext) {
        
       this.access_path = ac_path;
       this.extension = ext;
       if(this.extension.equals("txt")){
           this.content_file = ReadTXT(access_path);
       }else{
           this.content_file = ReadCSV(access_path);
       } 
       
    }
  
    FileReaderDocument(){
        
    }
    
    public String ReadTXT(String url){
        
        String text = "";
        
        try{
            BufferedReader bf = new BufferedReader(new java.io.FileReader(url));
            String tmp = " ";
            String bfRead; 
            while((bfRead = bf.readLine()) != null){
                tmp = tmp + bfRead + " "; //Guardar texto del archivo
            }
            
            text = tmp;
            
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        
        return text;
        
    }
    
    public String ReadCSV(String url){
        String text = "";
        return text;
    }

    public String getAccess_path() {
        return access_path;
    }

    public void setAccess_path(String access_path) {
        this.access_path = access_path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    
    public String getContent_file() {
        return content_file;
    }
    
}