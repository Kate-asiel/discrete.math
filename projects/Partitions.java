package discrete.math.projects;

import java.util.Scanner;

public class Partitions {
    private static void setProp(int[] keys, int numOfEl) {
        System.out.print("(");
        for (int i = 0; i < numOfEl; ++i) {
            boolean isActive = false;
            for (int element = 0; element <
                    numOfEl; ++element) {
                if (keys[element] == i) {
                    if (isActive) {
                        System.out.print("");
                    } else if (i != 0) {
                        System.out.print(" (");
                    }
                    System.out.print(element + 1);
                    isActive = true;
                }
            }
            if (!isActive) {
                break;
            }
            System.out.print(")");
        }
        System.out.println(" ");
    }

    static void splitSet(int[] set, int numOfEl) {
        for (int k = 0; k < numOfEl; ++k) {
            set[k] = 0;
        }
        while (true) {
            setProp(set, numOfEl);
            int indexOfEl;
            for (indexOfEl = numOfEl - 1; indexOfEl >= 0; --indexOfEl) {
                int element = set[indexOfEl];
                if (element < numOfEl - 1) {
                    int indexOfSubset;
                    for (indexOfSubset = 0; indexOfSubset < indexOfEl; ++indexOfSubset) {
                        if (set[indexOfSubset] == element) {
                            break;
                        }
                    }
                    if (indexOfSubset >= indexOfEl) {
                        element = numOfEl;
                    }
                }
                if (element < numOfEl - 1) {
                    set[indexOfEl] = element + 1;
                    for (int indexOfLeft = indexOfEl + 1; indexOfLeft < numOfEl; ++indexOfLeft) {
                        set[indexOfLeft] = 0;
                    }
                    break;
                }
            }
            if (indexOfEl < 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] keys = new int[n];
        splitSet(keys, n);
    }
}