import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMatrix {
  public static void  main(String[] args) throws FileNotFoundException {
    File file = new File("C:\\Users\\TUAN ANH\\OneDrive\\Desktop\\New folder\\CodeJava\\file.txt");
    Scanner sc = new Scanner(file);

    int sizeOfRow1 = Integer.parseInt(sc.next());
    int sizeOfColumn1 = Integer.parseInt(sc.next());

    int[][] matrix1 = new int[sizeOfRow1][sizeOfColumn1];

    for (int row = 0; row < sizeOfRow1; row++) {
      for (int column = 0; column < sizeOfColumn1; column++) {

        matrix1[row][column] = Integer.parseInt(sc.next());

      }
    }

    sc.nextLine();

    int sizeOfRow2 = Integer.parseInt(sc.next());
    int sizeOfColumn2 = Integer.parseInt(sc.next());

    int[][] matrix2 = new int[sizeOfRow2][sizeOfColumn2];

    for (int row = 0; row < sizeOfRow2; row++) {
      for (int column = 0; column < sizeOfColumn2; column++) {

        matrix2[row][column] = Integer.parseInt(sc.next());

      }
    }
    System.out.println("Ma tran 1");
    for(int row=0;row<sizeOfRow1;row++){
        for(int column=0;column<sizeOfColumn1;column++){
            System.out.print(matrix1[row][column] + "\t");
        }
        System.out.print("\n");
    }
    System.out.print("\n");
    System.out.println("Ma tran 2");
    for(int row=0;row<sizeOfRow2;row++){
        for(int column=0;column<sizeOfColumn2;column++){
            System.out.print(matrix2[row][column] + "\t");
        }
        System.out.print("\n");
    }
    System.out.print("\n");
    int[][] matrix3= new int[sizeOfRow1][sizeOfColumn2];
    for(int row=0;row<sizeOfRow1;row++){
        for(int column=0;column<sizeOfColumn2;column++){
            matrix3[row][column]=matrix1[row][column]+matrix2[row][column];
        }
    }
    System.out.println("Tong cua ma tran 1 va 2 la: ");
    for(int row=0;row<sizeOfRow1;row++){
        for(int column=0;column<sizeOfColumn2;column++){
            System.out.print(matrix3[row][column] + "\t");
        }
        System.out.print("\n");
    }
    System.out.print("\n");
    int[][] matrix4= new int[sizeOfRow1][sizeOfColumn2];
    for(int row=0;row<sizeOfRow2;row++){
        for(int column=0;column<sizeOfColumn2;column++){
            matrix4[row][column]=0;
            for(int k=0;k<sizeOfColumn1;k++){
                matrix4[row][column]=matrix4[row][column] +(matrix1[row][k]*matrix2[k][column]);
            }
        }
    }
    System.out.println("Tich cua ma tran 1 va 2 la: ");
    for(int row=0;row<sizeOfRow1;row++){
        for(int column=0;column<sizeOfColumn2;column++){
            System.out.print(matrix4[row][column] + "\t");
        }
        System.out.print("\n");
    }
    }
}