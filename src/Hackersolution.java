import java.util.Scanner;

public class Hackersolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int al=0;
        int bo=0;
        for(int i=0;i<n;i++){
            if(a[i]>b[i]){
                al++;
            }
            else if(a[i]<b[i]){
                ++bo;
            }
            else if(a[i]==b[i]){
                continue;
            }
            else{
                continue;
            }

        }

        System.out.print(al+" "+ bo);

    }
}
//=========================================================================================================================//
class sum{
    public void sumarray(long[] a){
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum obj=new sum();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long[] ar=new long[n];
        for(int i=0;i<n;i++){
             ar[i]=sc.nextInt();
        }
        obj.sumarray(ar);

    }
}
//=====================================================================================================================
class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i =0; i <n; i++) {
            for (int j =0; j <n; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        int sum1=0;
        for (int i =0; i < a.length; i++) {
            for (int j =0; j < a.length; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
                if(i+j==a.length-1){
                    sum1+=a[i][j];
                }

            }
        }
        int result=Math.abs(sum-sum1);
        System.out.println(result);

    }
}
//=======================================================================================================================

class s{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        int count_positive=0;
        int count_negative=0;
        int count_zero=0;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

            if(ar[i]>0){
                count_positive+=1;
            }
            else if(ar[i]<0){
                count_negative+=1;
            }
            else if(ar[i]==0){
                count_zero+=1;
            }
        }
        float f1=((float)count_positive/(float)n);
        float f2=((float)count_negative/(float)n);
        float f3=((float)count_zero/(float)n);
        System.out.printf("%.6f %.6f %.6f",f1,f2,f3);


    }
}