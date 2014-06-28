package librarySys.userWindow;

import java.awt.Color;

import javax.swing.JPanel;

public class CenterP extends JPanel{
	CenterButtonP cbP2;
	CenterBookP cbP1;
	
	CenterP(){
		setSize(600,300);
		setBackground(Color.green);
		//setLayout(new BorderLayout());
	}
	
	public void initCP(){
		cbP1 = new CenterBookP();
		cbP2 = new CenterButtonP();
		cbP1.initCP1();
		cbP2.initCP2();
		add(cbP1);
		add(cbP2);
	}
}
