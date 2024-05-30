package hust.soict.globalict.garbage;

public class GarbageCreator {
	public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append("Garbage ");
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory!");
        }
    }
}
