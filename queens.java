import java.io.*;
import java.util.*;

class queens{
	
	public static void main(String args[]){
		
		int p1[] = new int[]{2,5,7,4,6,3,8,6};
		int p2[] = new int[]{4,7,3,5,1,2,5,8};
		int p3[] = new int[]{5,7,3,2,5,7,1,5};
		int p4[] = new int[]{5,1,8,4,2,7,3,6};
		
		/*int p[] = new int[8];
		Random rand = new Random();
		for(int i=0;i<p.length;i++){
			p[i]=rand.nextInt(8)+1;
		}
		
		// print array
		for(int i=0; i<p.length; i++){
			System.out.println(p[i]);
		}
		*/		
		System.out.println("No of conflicts: "+fitness(p4));
		
	}
	
	static int fitness(int p[]){
		int s = 0;
		int diff = 0;
		int q = 0;
		int d = 0;
		int h = 0;
		
		//Count Row-Conflicts
		for(int i=0;i<p.length;i++){
			for(int j=i+1; j<p.length; j++){
				
				if(p[i]==p[j]){
					s++;
				}
				
			}
		}
		System.out.println("Row conflicts: "+s);
		
		// Count Diagonal Conflicts
		for(int i=0; i<p.length; i++){
			q = p[i];
			for(int j=0; j<p.length; j++){
				diff=Math.abs(i-j);
				if(i!=j){
					if((p[j]==q-diff)||(p[j]==q+diff)){
						d++;
					}
				}
				
			}
		}
		
		System.out.println("Diagonal conflicts: "+d/2);
		/*// print array
		for(int i=0; i<p.length; i++){
			System.out.print(p[i]);
		}*/
		h = s+d/2;
		return h;
	}
	
}