import java.util.Scanner;
class Rotate
{
    public static void rotate(int mat[][]) {
         int len = mat.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                int n = mat[i][j];
                mat[i][j] = mat[j][i];	
                mat[j][i] = n;
            }
        }
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                 int n2 = mat[i][j];
                mat[i][j] = mat[len - i - 1][j];
                mat[len - i - 1][j] = n2;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; i++) {
                System.out.print( mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String ars[]) {
        System.out.println("Enter the size of the square matrix");
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
         int mat[][] = new int[N][N];
        System.out.println("Enter the Matrix");
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                mat[i][j] = in.nextInt();
            }
        }
        System.out.println("The entered matrix is");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j< N; j++) {
                System.out.print( mat[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("The rotated matrix");
        rotate(mat);
    }
}