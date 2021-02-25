package model;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDocument {

    protected String access_path;

    protected String content_file;

    public FileReaderDocument(String ac_path) {

        this.access_path = ac_path;

        this.content_file = ReadFile(access_path);

    }

    FileReaderDocument() {

    }

    /**
     *
     * @param url Recibe la ruta de acceso del archivo
     * @return Convierte el archivo txt o csv en una String y la guarda en un
     * atributo content_file
     */
    private String ReadFile(String url) {

        String text = "";

        try {
            BufferedReader bf = new BufferedReader(new FileReader(url));
            String tmp = " ";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                tmp = tmp + bfRead + " "; //Guardar texto del archivo
            }
            tmp = tmp.replaceAll(",", " ");  tmp = tmp.replaceAll("/", " "); tmp = tmp.replaceAll(";", " ");
            text = tmp;

            bf.close();

        } catch (Exception e) {
            System.err.println("No se encontro archivo");
        }

        return text;

    }

    public String getAccess_path() {
        return access_path;
    }

    public void setAccess_path(String access_path) {
        this.access_path = access_path;
    }


    public String getContent_file() {
        return content_file;
    }

}
