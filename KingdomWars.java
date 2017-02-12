
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class KingdomWars {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //Number of soldiers
		int[] a=new int[n]; 
		int[] b=new int[n]; 
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt(); //A parameter of each soldier
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt(); // B parameter of each soldier
		}
		int k=sc.nextInt(); //no of war days
		
		
		while(k>0){
			k--;
			List<Integer> shortListA=new ArrayList<>();
			int ni=sc.nextInt(); //lower limit
			int nj=sc.nextInt(); //upper limit
			int maxAPos=ni;
			
			int countA=1;
			shortListA.add(maxAPos);
		for(int i=ni;i<=nj;i++){
				if(a[i-1]>a[maxAPos-1]){
					shortListA.clear();
					shortListA.add(i);
					maxAPos=i;
				}
				else if(a[i-1]==a[maxAPos-1]){
					shortListA.add(i);
				}
			}
		
			if(shortListA.size()>1){
				int minBPos=shortListA.get(0);
				for(int i:shortListA){
					if(b[i-1]<b[minBPos-1]){
						minBPos=i;
					}
				}
				System.out.println(minBPos);
			}
			else{
				System.out.println(maxAPos);
			}
		}
		
	}

}
