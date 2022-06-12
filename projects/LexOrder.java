package discrete.math.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LexOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        System.out.println("enter k: ");
        int k = sc.nextInt();

        List A = new ArrayList();

        for(int i = 1; i <= k; i++){
            A.add(i);
        }

        int p = k;

        while (p >= 1){
            System.out.println(A);
            if ((int)A.get(k - 1) == n) {
                p = p - 1;
            } else {
                p = k;
            }
            if (p >= 1){
                for (int i = k; i >= p; i--){
                    int newValue = (int)A.get(p - 1) + i - p + 1;
                    A.set(i - 1, newValue);
                }
            }
        }
    }
}

