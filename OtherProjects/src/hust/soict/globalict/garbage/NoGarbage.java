package hust.soict.globalict.garbage;

public class NoGarbage {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String garbage = "Garbage ";
        while (true) {
            sb.append(garbage);
        }
    }
}
