import java.lang.Math;
public class MatrikMethod2
{
    public static void Matrik(int k, int l, int m)
    {
        System.out.println("Bentuk matriks menggunakan method :");
        int i,j;
        for (i=k; i<l; i++){
            for (j=k; j<m; j++)
            {
                if((i%2)!=1)
                {
                    System.out.print(i*j +"\t");
                }else {
                    System.out.print(Math.pow(i,j) +"\t");
                }
            }
            System.out.println();
        }
    }
}