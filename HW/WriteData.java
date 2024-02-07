package HW;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void createFile(String[] bufferArray) throws IOException {
        String fileName = bufferArray[0] + ".txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            String writeString = String.join(" ", bufferArray);
            bw.write(writeString);
            bw.newLine();
        } catch (IOException e) {
            throw new IOException("Ошибка при создании или записи файла");
        }
    }
}

