import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for n: ");
        int n = in.nextInt();
        boolean[] seive = new boolean[n];

        for (int i = 2; i < n; i++) {
            for (int j = 2*i; j < n;){
                seive[j] = true;
                j = i+j;

            }

        }

        for (int i=2; i<n; i++) {
            if (seive[i] == false) {
                System.out.println(i);
            }

        }
    }

}
