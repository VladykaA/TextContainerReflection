import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "C:\\Users\\oleksandr.vladyka\\Documents\\forTest1\\testResult.txt")
public class TextContainer {

    String text  = "Impossible is nothing";

    @Saver
    public void save(String path, String text){
        try {
            FileWriter fw = new FileWriter(path);
            fw.write(text);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
