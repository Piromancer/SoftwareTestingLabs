package lab2;

import java.io.*;

public class CSV_Logger {

    public static void log(String fileName, Object ... arguments){
        try {
            File csvFile = new File(fileName);
            if (!csvFile.exists())
                csvFile.createNewFile();
            FileWriter fw = new FileWriter(csvFile, true);
            for (int i = 0; i < arguments.length; i++){
                if (i != arguments.length - 1)
                    fw.write(arguments[i].toString() + ";");
                else
                    fw.write(arguments[i].toString() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
