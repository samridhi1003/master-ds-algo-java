import java.util.Scanner;

public class numpattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;

        System.out.print("enter no of layers(odd no) : ");
        n = scn.nextInt();

        int nst = 1;
        int nsp = n / 2;

        for (int r = 1; r <= n; r++) {
            for (int csp = nsp; csp >= 1; csp--) {
                System.out.print(" ");
            }
            int val;
            if (r <= n / 2) {
                val = r;
            } else {
                val = n - r + 1;
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val);
                if (cst <= nst / 2) {
                    val++;
                } else {
                    val--;
                }
            }

            if (r <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }
}