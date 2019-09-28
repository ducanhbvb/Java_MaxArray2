import java.util.Scanner;

public class MaxArray2 {
    public static void randomArray2(int[][]arr){
        //int[][] arr=new int[maxCurrent][maxColumn];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input Max Current");
        int maxCurrent=sc.nextInt();
        System.out.println("input Max Column");
        int maxColumn=sc.nextInt();
        int[][] All_array=new int[maxCurrent][maxColumn];
        randomArray2(All_array);
        int max=All_array[0][0];
        for (int i = 0; i <maxCurrent ; i++) {
            for (int j = 0; j <maxColumn ; j++) {
               // All_array[i][j]=(int)(Math.random()*90+10);
                System.out.print(All_array[i][j]+" ");
                if(All_array[i][j]>max){
                    max=All_array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max in Array: = "+max);
    }
}
