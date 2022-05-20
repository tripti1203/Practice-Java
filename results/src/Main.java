import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum score: ");
        int maxScore = scanner.nextInt();
        System.out.print("Enter the number of students: ");
        int Student = scanner.nextInt();
        int[] score = new int[Student];
        for (int i = 0; i < score.length; i++) {
            System.out.print("Student" + (i + 1) + ":");
            score[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            double StudentScore = score[i];
            double StudentPercentage = (StudentScore / maxScore) * 100;
            System.out.println("Student" + (i + 1) + ":" + StudentPercentage +"%");
            sum += StudentScore;
        }
        double mean = (double)sum / score.length ;
        double meanPercentage = (mean / maxScore) * 100;
        System.out.println("Mean percentage: " + meanPercentage+"%");
    }
}
