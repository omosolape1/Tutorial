

import java.util.*;

public class fibonacci {

    
    public static void main(String[] args) {
      
      Scanner s=new Scanner (System.in);
       System.out.print("ENTER any  integer Number : ");
        
         
         int num=s.nextInt();
         int[] a = new int[num];
        a[0] = 0;
         a[1] = 1;
         for(int c=2; c < num; c++){
             a[c] =a[c-1] + a[c-2];
         }
 
         for(int i=0; i< num; i++){
                 System.out.print(a[i]+" " );
                  
         }
    
    }
    
}
