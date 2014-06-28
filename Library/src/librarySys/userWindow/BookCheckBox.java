package librarySys.userWindow;

import java.awt.Color;

import javax.swing.JCheckBox;

public class BookCheckBox extends JCheckBox{
	BookCheckBox(String str){
		setBackground(Color.magenta);
	    setVisible(true);
	    setText(str);
	}
	
}
