package librarySys.userWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UWFrameOut extends JFrame{
	
	//MotherBookListHere
	ArrayList<String> CenterDisplayList = new ArrayList<String>();
	
	private static UWFrameOut instance = null;
	
	NorthCateP ncP;
	CenterP cP;
	SouthMyListP smlP;
	
	UWFrameOut(){
		getContentPane().setBackground(Color.black);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static UWFrameOut getInstance(){
		if(instance == null){
			instance = new UWFrameOut();
		}
		return instance;
	}
		
	public void init(){
		//CenterDisplayList.add("display");
		
		cP = new CenterP();
		cP.initCP();
		ncP = new NorthCateP();
		smlP = new SouthMyListP();
		getContentPane().add(cP,BorderLayout.CENTER);
		getContentPane().add(ncP,BorderLayout.NORTH);
		getContentPane().add(smlP,BorderLayout.SOUTH);
	}
	
	public void frameAddBooks(){
		CenterDisplayList.add("omg");
		CenterDisplayList.add("This come from frameOut.addBooks");
	}
	
	public void framePassBookToCenter(){
		for(int ii=0; ii<CenterDisplayList.size();ii++){
			this.cP.cbP1.sb.innerBoard.InnerAddBooks(CenterDisplayList.get(ii));
		}
		this.cP.cbP1.sb.innerBoard.addCheckBox();
	}
	public void framePassBookListToCenter(){
		this.cP.cbP1.sb.innerBoard.addCheckBox(CenterDisplayList);
	}
	
	class CheckBoxListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
