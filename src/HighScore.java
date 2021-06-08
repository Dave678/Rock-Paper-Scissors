import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HighScore {
	
		static int highScore = 0;
		static int currScore = 0;
		
	
		
		public static void hs() {
			
			Object[] options1 = { "?" , "OK" };

	    JPanel panel = new JPanel();
	    panel.add(new JLabel("HIGH SCORE: " + highScore));
	    panel.add(new JLabel("CURRENT SCORE: " + currScore));
	    
	
	    	int result = JOptionPane.showOptionDialog(null,panel, null, JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
	            null, options1, null);
			
			
			if(result == 0) {
		
	    	
	    	JOP.msg("The HIGH SCORE is the amount of consecutive wins you get on Player vs Computer mode.");
	    	
			}
	    	
			if(result == 1) {
				
				panel.setVisible(false);
				
			}
	    	
	    	
		}	
	    	
	    public static void getHs(int score) {
	    	
	    	
	    	
	    	
	    	if(score > 10 ) {
			
	    		currScore ++;
			
	    	}
	    	
	    	if(score < 10) {
	    		
	    		
	    		currScore = 0;
	    		
	  
	    		
	    	}
	    	
	    	
	    	if(currScore == 0) {
	    		
	    		
	    		
	    	}
	    	
	    	else {
	    		
	    		if(currScore >= highScore) {
	    			
	    			
	    			
	    			
	    		}
	    		
	    		
	    	}
	 
	        
	  
	
	    }
	    
	    	
	}	
	    

	



