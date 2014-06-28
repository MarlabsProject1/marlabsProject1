package librarySys.userWindow;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;

public class ScrollBoard extends JScrollPane{
	
	InnerScrollBoard innerBoard;
	
	
	ScrollBoard(){
		setPreferredSize(new Dimension(300,150));
		//setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		innerBoard = new InnerScrollBoard();
		innerBoard.addTestBox();
		innerBoard.InnerAddBooks("lalala");
		innerBoard.InnerAddBooks("daalala");
		innerBoard.InnerAddBooks("lalala");
		innerBoard.InnerAddBooks("lalala");
		innerBoard.InnerAddBooks("lalala");
		innerBoard.InnerAddBooks("lalala");
		innerBoard.InnerAddBooks("ldadadala");
		innerBoard.addCheckBox();
		this.setViewportView(innerBoard);
	}
	
	
}
