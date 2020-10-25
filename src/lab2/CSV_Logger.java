package lab2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSV_Logger {

    public static void log(String fileName, Object ... arguments){
        try {
            File csvFile = new File(fileName);
            csvFile.createNewFile();
            FileWriter fw = new FileWriter(csvFile);
            for (Object i : arguments){
                fw.write(i.toString() + ", ");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
