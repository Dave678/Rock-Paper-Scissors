import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	
	
	

	@SuppressWarnings("serial")
	public class MyFrame extends JFrame implements ActionListener {
	
		

		static JFrame f;
		
		static JButton b, b1, b2;
		
		static JLabel l;
		
		
		 
	    
		 @SuppressWarnings("deprecation")
		 
		public MyFrame() {  
			 
		 f = new JFrame("Rock, Paper, Scissors");
		 
	     
	     l = new JLabel(" ");
	
	    
	     b = new JButton("Player vs Player");
	     b1 = new JButton("Player vs Computer");
	     b2 = new JButton("View Highscore");
	
	     
	     JPanel p = new JPanel();
	     
	     p.add(b);
	     p.add(b1);
	     p.add(b2);
	     p.add(l);
	
	     
	     p.setBackground(Color.WHITE);
	
	    
	     f.add(p);
	
	     
	     f.setSize(500, 100);
	     
	     f.setLocationRelativeTo(null);
	     
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	     f.show();
	     
	     f.setVisible(true);
	     
	     b.addActionListener(this);
	     b1.addActionListener(this);
	     b2.addActionListener(this);
	     
	     
	      
	    
	 }




		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == b) {
				
				Game.pvp();
			}
			
			if(e.getSource() == b1) {
				
				
			     Game.pvc();
			}
			
			if(e.getSource() == b2) {
				
				HighScore.hs();
				
			}
			
		}
		 
		
	
		
			 
}