package librarySys.userWindow;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CenterButtonP extends JPanel{
	JButton rentBook;
	JButton returnBook;
	JButton addBook;
	JButton deleteBook;
	
	CenterButtonP(){
		setSize(600,100);
		setBackground(Color.green);
		setLayout(new FlowLayout());
	}

	public void initCP2() {
		// TODO Auto-generated method stub
		rentBook = new JButton("Rent'em!");
		returnBook = new JButton("Return");
		addBook = new JButton("addBook");
		deleteBook = new JButton("deleteBook");
		
		add(rentBook);
		add(returnBook);
		add(addBook);
		add(deleteBook);
	}
	
	
}
