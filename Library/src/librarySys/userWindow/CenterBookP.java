package librarySys.userWindow;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CenterBookP extends JPanel{
	
	ScrollBoard sb;
	
	
	CenterBookP(){
		setSize(600,200);
		setBackground(Color.green);
		//setLayout(new BorderLayout());
	}
	
	public void initCP1(){
		sb = new ScrollBoard();
		this.add(sb);
		
	}
	
	//public void display(String str){
	//	System.out.println(str);
	//}
}
