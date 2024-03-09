import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ViDu_Files {

    public static void main(String[] args){

        //Coppy
        Path source = Paths.get("D:\\Pham Anh Tuan\\LapTrinhMang\\BAITAP.DOCX");
        Path newdir = Paths.get("D:\\Pham Anh Tuan\\LapTrinhMang\\temp");
        try {
            Files.copy(source, newdir.resolve(source.getFileName()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
