package librarySys.userWindow;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class InnerScrollBoard extends JPanel{
	//GridBagConstraints gbc;
	
	ArrayList<String> innerBookList = new ArrayList<String>();
	//ArrayList<>
	
	InnerScrollBoard(){
		this.setBackground(Color.yellow);
		this.setSize(200, 200);
		this.setVisible(true);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//GridBagConstraints gbc = new GridBagConstraints();
	}
	
	public void addCheckBox() {
		this.removeAll();
		for(int ii=0; ii<innerBookList.size();ii++){
			BookCheckBox bcb = new BookCheckBox("New CheckBox:#"+innerBookList.get(ii));
			this.add(bcb);
			System.out.println("adding new box");
			this.revalidate();
		}
	    this.revalidate();
	}
	
	public void addCheckBox(ArrayList<String> StrAL) {
		this.removeAll();
		for(int ii=0; ii<StrAL.size();ii++){
			BookCheckBox bcb = new BookCheckBox("New CheckBox:#"+StrAL.get(ii));
			this.add(bcb);
			System.out.println("adding outsider box");
			this.revalidate();
		}
	    this.revalidate();
	}
	
	public void addTestBox(){
		BookCheckBox bcb = new BookCheckBox("New CheckBox:#"+"oooooooooooooooooo");
		BookCheckBox ccb = new BookCheckBox("New CheckBox:#"+"llllllllllllllllll");
		BookCheckBox dcb = new BookCheckBox("New CheckBox:#"+"dddddddddddddddddd");
		this.add(bcb);
		this.add(ccb);
		this.add(dcb);
		System.out.println("adding old boxes");
		this.revalidate();
	}
	
	public void InnerAddBooks(String str){
		innerBookList.add(str);
	}
}
