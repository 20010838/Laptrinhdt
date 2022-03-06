import java.util.Scanner;
public class bai1 {
    public static int fibo_SUM(int n) {
        if (n<0)
        return 0;
        int fibo[] = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        int sum = fibo[0] + fibo[1];
        for(int i = 2; i<=n; i++)
        {
            fibo[i] = fibo[i-1] + fibo[i-2];
            sum+=fibo[i];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Moi nhap so phan tu fibonacci muon tinh tong: ");
        n = input.nextInt();
        System.out.println("Tong cua day "+ n +" so Fibonacci la: "+ fibo_SUM(n));
    }

    
}
