public class StudentReport {
    public static void main(String[] args) {
        int[][] marks = new int[5][3];
        marks[0][0] = 80;
        marks[0][1] = 70;
        marks[0][2] = 90;

        marks[1][0] = 75;
        marks[1][1] = 85;
        marks[1][2] = 80;

        marks[2][0] = 90;
        marks[2][1] = 95;
        marks[2][2] = 92;

        marks[3][0] = 60;
        marks[3][1] = 70;
        marks[3][2] = 65;

        marks[4][0] = 85;
        marks[4][1] = 80;
        marks[4][2] = 88;
        int highestTotal = 0;
        int topper = 0;
        for (int i = 0; i < 5; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;

            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            if (total > highestTotal) {
                highestTotal = total;
                topper = i;
            }
        }
        System.out.println("Topper: Student " + (topper + 1));
        System.out.println("Highest Total: " + highestTotal);
    }
}
