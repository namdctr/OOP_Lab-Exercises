package hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Path;

public class StringFileReader {
	public static void main(String[] args) {
        String filename = "D:/OneDrive - Hanoi University of Science and Technology/Nam/Java Programming/OtherProjects/src/hust/soict/globalict/garbage/test.txt";
        byte[] inputBytes;
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Path.of(filename));

            // Using "+" operator
            startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b;
            }
            endTime = System.currentTimeMillis();
            System.out.println("Time taken using '+' operator: " + (endTime - startTime) + "ms");

            // Using StringBuilder
            startTime = System.currentTimeMillis();
            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char) b);
            }
            endTime = System.currentTimeMillis();
            System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
