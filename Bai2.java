
import java.util.Scanner;

public class B2 {
	static int binary(int a[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (a[mid] == x) {
				return mid;
			}
			if (a[mid] > x) {
				return binary(a, l, mid - 1, x);
			}
			return binary(a, mid + 1, r, x);
		}
		return -1;
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Nhap so phan tu trong mang: ");
			int n = input.nextInt();

			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				System.out.print("[" + i + "]: ");
				a[i] = input.nextInt();
			}
			System.out.print("Nhap phan tu can tim: ");
			int x = input.nextInt();

			int slove = binary(a, 0, n - 1, x);
			if (slove == -1) {
				System.out.println("K tim thay vi tri");
			} else {
				System.out.printf("Vi tri la %d ", slove);
			}

		}
	}
}