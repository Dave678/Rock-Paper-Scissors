
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Game {
	
	
	public static void pvp() {
		
		int num = 0;
		int rounds = 0;
		int count = 0;
		int count2 = 0;
		boolean b = true;
		
		
		JOP.msg("Best out of three games wins!");
		
		while (b == true) {
			
			
			JOP.msg("It's Player One's turn to choose.");
			Object[] options1 = { "Rock", "Paper",
	        "Scissors" };
	
			JPanel panel = new JPanel();
			panel.add(new JLabel("What will you choose?"));
			
		
		
			int result = JOptionPane.showOptionDialog(null, panel, "Enter a Number",
		    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
		    null, options1, null);
			
			
				
			if(result == 0) {
				
				count = 1;
				
			}
			
			if (result == 1) {
				
				count = 2;
				
			}
			
			if (result == 2) {
				
				count = 3;
				
			}
			
			
			
			
			JOP.msg("It's Player Two's turn to choose.");
			
		
			Object[] options2 = { "Rock", "Paper",
	        "Scissors" };
	
			JPanel panel1 = new JPanel();
			panel1.add(new JLabel("What will you choose?"));
		
		
		
			int result2 = JOptionPane.showOptionDialog(null, panel1, "Enter a Number",
		    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
		    null, options2, null);
			
			if(result2 == 0) {
				
				count2 = 1;
				
			}
			
			if (result2 == 1) {
				
				count2 = 2;
				
			}
			
			if (result2 == 2) {
				
				count2 = 3;
				
			}
			
			
			
			
			
			if((double)count / count2 == 1.0) {
				
				JPanel panel2 = new JPanel();
    	        panel2.add(new JLabel("You Tied!"));
    	        JOptionPane.showMessageDialog(null , panel2 );
    	        
    	        JOP.msg("Go again.");
    	        
    	       rounds -- ;
				
				
			}
			
			if(count == 1 && count2 == 2) {
				
				
				
				JPanel panel2 = new JPanel();
    	        panel2.add(new JLabel("Player Two Won! Player One chose Rock and Player Two chose Paper."));
    	        JOptionPane.showMessageDialog(null , panel2 );
    	        
    	        
    	        num += 20;
				
			}
				
			
			 if(count == 2 && count2 == 3 ) {
				
			
				 
				 JPanel panel2 = new JPanel();
	    	     panel2.add(new JLabel("Player Two Won! Player One chose Paper and Player Two chose Scissors."));
	    	     JOptionPane.showMessageDialog(null , panel2 );
	    	     
	    	     
	    	     num += 20;
				
			}
			
			if(count == 3 && count2 == 1) {
				
				
				
				JPanel panel2 = new JPanel();
    	        panel2.add(new JLabel("Player Two Won! Player One chose Scissors and Player Two chose Rock."));
    	        JOptionPane.showMessageDialog(null , panel2 );
    	        
    	       
    	        num += 20;
				
			}
			
			if(count == 1 && count2 == 3) {
				
				
				
				JPanel panel2 = new JPanel();
    	        panel2.add(new JLabel("Player One Won! Player One chose Rock and Player Two chose Scissors."));
    	        JOptionPane.showMessageDialog(null , panel2 );
    	        
    	        num += 10;
				
			}
				
			
			
			 if(count == 2 && count2 == 1 ) {
				
				
				 
				 JPanel panel2 = new JPanel();
	    	     panel2.add(new JLabel("Player One Won! Player One chose Paper and Player Two chose Rock."));
	    	     JOptionPane.showMessageDialog(null , panel2 );
	    	     
	    	     num += 10;
				
			}
			
			if(count == 3 && count2 == 2) {
				
				
				JPanel panel2 = new JPanel();
    	        panel2.add(new JLabel("Player One Won! Player One chose Scissors and Player Two chose Paper."));
    	        JOptionPane.showMessageDialog(null , panel2 );
				
    	        num += 10;
    	        
			}
			
			rounds ++;
			
			if(rounds > 2) {
				
				b = false;
				
			}
			
			
			
		}
		
		
		Determined.pvpWinDetermined(num);
		
		
	}	
	
	
	
	public static int pvc() { 
		
		JOP.msg("Best out of three games wins!");
		
		int pl1 = 0;
		int num = 1;
		int hsCount = 0;
		
		boolean b = true;
		
			while(b == true) {
				
				
				
		        Object[] options1 = { "Rock", "Paper",
		                "Scissors" };
	
		        JPanel panel = new JPanel();
		        panel.add(new JLabel("What will you choose?"));
		        
		        int result = JOptionPane.showOptionDialog(null, panel, "Rock, Paper, Scissors",
		         JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
		         null, options1, null);
		        
		        JPanel panel1 = new JPanel();
		        panel1.add(new JLabel("The computer is choosing..."));
		        JOptionPane.showMessageDialog(null , panel1 );
		        
		        
		        if (result == 0) {
		        	
		        	pl1 = 1;
		        	
		        }
		        
		        if (result == 1) {
		        	
		        	pl1 = 2;
		        	
		        }
		        
		        if (result == 2) {
		        	
		        	pl1 = 3;
		        	
		        }
		     
		        
		        if(Math.random() <= 0.50) {
		        	
		        	if(pl1 == 1) {
		        		
		        		JPanel panel2 = new JPanel();
		    	        panel2.add(new JLabel("You Won! The computer chose Scissors."));
		    	       
		    	        
		    	        JOptionPane.showMessageDialog(null , panel2 );
		        		
		        	}
		        	
		        	if(pl1 == 2) {
		        		
		        		JPanel panel2 = new JPanel();
		    	        panel2.add(new JLabel("You Won! The computer chose Rock."));
		    	        
		    	        JOptionPane.showMessageDialog(null , panel2 );
		        		
		        	}
		        	
		        	if(pl1 == 3) {
		        		
		        		JPanel panel2 = new JPanel();
		    	        panel2.add(new JLabel("You Won! The computer chose Paper."));
		    	        
		    	        JOptionPane.showMessageDialog(null , panel2 );
		        		
		        	}
		        	
		        	hsCount += 5;
		        	
		        	
		        }
		        
		        else  {
		        	
		        	if(pl1 == 1) {
		        		
		        		JPanel panel2 = new JPanel();
		    	        panel2.add(new JLabel("You lost! The computer chose Paper."));
		    	        
		    	        JOptionPane.showMessageDialog(null , panel2 );
		    	    
		        	}
		        	
		        	if(pl1 == 2) {
		        		
		        		JPanel panel2 = new JPanel();
		    	        panel2.add(new JLabel("You lost! The computer chose Scissors."));
		    	        
		    	        JOptionPane.showMessageDialog(null , panel2 );
		    	        
		    	       
		        		
		        	}
		        	
		        	if(pl1 == 3) {
		        		
		        		JPanel panel2 = new JPanel();
		    	        panel2.add(new JLabel("You lost! The computer chose Rock."));
		    	        
		    	        JOptionPane.showMessageDialog(null , panel2 );
		    	        
		    	        
		        		
		        	}
		        	
		        
		        	hsCount += 1;
				    	 
				 }
		        
			        num++;
		        	
		        	if(num > 3) {
				    	 
				    	 b = false;
		        	
		        	}
		        
		        	
			}
			
			
			System.out.println(hsCount);
			HighScore.getHs(hsCount);
			Determined.winDetermined(hsCount);
			return hsCount;	
			
			
		      
	
	}
	
	

}
