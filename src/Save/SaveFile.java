package Save;

import java.io.*;

public class SaveFile {
    public SaveFile(String name,String dir) {
        this.name = name;
        this.dir = dir;
    }

    private String name;
    private String dir;

    //writer
    public String write(String... array) {
        File file = new File(dir + "\\" + name + ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String loop : array) {
                writer.write(loop);
                writer.newLine();
            }
            return "Soubor uložen";
        } catch (Exception e) {
            return "Soubor nelze vytvořit";
        }
    }
}
