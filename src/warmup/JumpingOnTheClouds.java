package warmup;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {
	
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int l = in.nextInt();
       int[] c= new int[l];
       
       for(int i=0; i < l; i++){
           c[i] = in.nextInt();
       }
       
       int jump = -1;
       for (int i = 0; i < l; i++, jump++) {
    	   if (i<l-2 && c[i+2]==0) 
    		   i++;  
       }
       System.out.println(jump);
       
       in.close();
    }
}
