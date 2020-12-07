
public class MainMethod {

	public static void main(String[] args) {
		
		int[] listA = {3,4,4,6,1,4,4} ;
		Algo1 algo1Test = new Algo1() ; 
		
		
		int [] res = algo1Test.solution(5, listA) ;
		String messageResultat ="{";
		
		
		
		
		for(int i = 0 ; i<res.length; i++) {
			if(i== res.length-1) {
				messageResultat+= res[i]+"}" ;
				break ;
			}
			messageResultat+= res[i]+",";
			
		}
		
		
		System.out.println(messageResultat);

	}

}
