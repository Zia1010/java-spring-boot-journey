public class NestedLoop {
    public static void main(String[] args) {
        for (int line = 1; line <= 10; line++) {
            for (int item = 1; item <= 10; item++) {
                int answer = line * item;
                System.out.print(answer + "\t");
            }
            System.out.println();
        }
    }
}
