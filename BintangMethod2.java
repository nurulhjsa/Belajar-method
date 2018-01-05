public class BintangMethod2
{
    public static void Bintang(int k, int l)
    {
        System.out.println("Bentuk bintang menurun:");
        int i,j;
        for (i=k; i<=l; i++){
            for (j=k; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void BintangGanjil(int m, int n)
    {
        System.out.println("Bentuk bintang ganjil menurun :");
        int i,j;
        for (i=m; i<n; i++){
            for (j=m; j<=i; j++)
            { 
                if(i%2==0)
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void BintangGenap(int o, int p)
    {
        System.out.println("Bentuk bintang genap menurun :");
        int i,j;
        for (i=0; i<p; i++){
            for (j=0; j<=i; j++)
            { 
                if(i%2!=0)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}