import java.util.Scanner;

class B1 {

    public static void main(String[] args) {
        int n, i, j, temp;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nhap so luong day so:");
            n = input.nextInt();
            int array[] = new int[n];
            for (i = 0; i < n; i++) {
                System.out.print("Nhap so thu [" + i + "]: ");
                array[i] = input.nextInt();
            }
            for (i = 0; i < (n - 1); i++) {
                for (j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println("Ket qua xap xep tang dan: ");
            for (i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }

            System.out.println("\nKet qua xap xep giam dan: ");
            for (i = n - 1; i >= 0; i--) {
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println();
    }
}