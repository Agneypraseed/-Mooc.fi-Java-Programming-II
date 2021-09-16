
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        double avg = 0;
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n > 0) {
                avg += n;
                c++;
            }
        }
        if (c == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg = avg / c;
            System.out.println(avg);
        }
    }
}
