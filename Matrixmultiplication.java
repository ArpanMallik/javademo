import java.util.Scanner;
public class matrixmultiplication{

  public static void main(String args[]){

  Scanner Sc=new  Scanner(System.in);

 System.out.println("Enter the numbers for rows in matrix A");
 int rowsA=Sc.nextInt();
 System.out.println("Enter the numbers for cols in matrix A");
 int colsA=Sc.nextInt();

  System.out.println("Enter the numbers for rows in matrix B");
  int rowsB=Sc.nextInt();
  System.out.println("Enter the numbers for cols in matrix B");
  int colsB=Sc.nextInt();

if(colsA!=rowsB){
             System.out.println(" Matrix multiplication is not possible");
 
}
  else{
       
 int[][]matrixA=new int[rowsA][colsA];
 int[][]matrixB=new int[rowsB][colsB];

 for(int i=0;i<rowsA;i++){
   for(int j=0;j<colsA;j++){
      System.out.println("A["+ i +"]["+ j +"]:");
       matrixA[i][j]=Sc.nextInt();
}
}


 for(int i=0;i<rowsB;i++){
   for(int j=0;j<colsB;j++){
      System.out.println("B["+ i +"]["+ j +"]:");
       matrixB[i][j]=Sc.nextInt();
}
}

int[][] resultmatrix=new int[rowsA][colsB];
   for(int i=0;i<rowsA;i++){
     for(int j=0;j<colsB;j++){
       for(int k=0;k<colsA;k++){
          resultmatrix[i][j]=matrixA[i][k]*matrixB[k][j];
       }
      }
    }
  
System.out.println("The result matrix:");
   for(int i=0;i<rowsA;i++){
     for(int j=0;j<colsB;j++){
        System.out.println(resultmatrix[i][j]+"");
}
}
System.out.println();
}


Sc.close();
}
}


