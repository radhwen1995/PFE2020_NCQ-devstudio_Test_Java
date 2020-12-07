

public class Algo1 {
	
	int[] listCompteurs  ;
	public int[] solution (int N,int[] A) {
		initialiserListCompteurs(N);
		
		for(int i=0 ;i<A.length; i++) {
			if(A[i]>=1 && A[i]<=5) increase(A[i]) ;
			if(A[i]== N+1) maxCounter() ;
		}
		return listCompteurs ;
	}
	
	
	private void maxCounter() {
		//find Maximum 
		int max= 0 ;
		for(int i =0 ; i<listCompteurs.length ; i++) {
			if(listCompteurs[i]>max) 
				max =listCompteurs[i];
				
		}
		
		System.out.println("le maximum est "+max);
		
		//replace the counters with the max number
		for(int y=0 ; y<listCompteurs.length ; y++) {
			listCompteurs[y] = max;
			
		}
		
		
	}


	private void increase(int x) {
		
		//Find the right counter  then increment
		for(int i=0 ; i<listCompteurs.length ; i++) {
			if(i+1 == x)  {
				listCompteurs[i]++;
		
				return ;
			}
		}
		
	}


	private void initialiserListCompteurs(int n) {
		
		listCompteurs = new int[n];
		for(int i =0 ;i<n;i++) {
			listCompteurs[i] = 0;
		}
		
	}
	
	

	

}
