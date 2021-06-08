
public class Determined {
	
	
	public static void winDetermined(int score) {
		
		
		
		
		if(score > 10) {
			
    		JOP.msg("You Win the Round!");
		
		
    	}
	
    	if(score < 10) {
		
    		JOP.msg("You Lose the Round!");		
		
    	}

    

    }
		
	public static void pvpWinDetermined(int score) {
		
		if(score >= 50) {
			
    		JOP.msg("Player Two Wins!");
		
		
    	}
	
    	if(score < 50) {
		
    		JOP.msg("Player One Wins!");		
		
    	}
		
		
		
		
	}
		
		
		
}
		
	


