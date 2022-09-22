package Test;

public class Add2matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int m1[][] = {{8,7,1},
                 {5,6,14},
                 {12,23,22}};
   int m2[][] = {{32,10,13},
                 {23,11,19},
                 {38,31,25}};
   if(m1.length != m2.length || m1[0].length != m2[0].length){
       System.out.println("Matrices orders are not same, so Addition not possible ");
       return;
   }
   
   int res[][] = new int[m1.length][m1[0].length];
   
   for(int i=0; i<m1.length; i++){
       for(int j=0; j<m1[0].length; j++){
           res[i][j] = m1[i][j]+m2[i][j];
          
           System.out.print(res[i][j]+" ");
       }
       System.out.println();
   }

	}

}
