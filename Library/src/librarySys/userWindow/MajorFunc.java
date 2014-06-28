package librarySys.userWindow;

import java.util.ArrayList;

import librarySys.util.Administrator;
import librarySys.util.Book;
import librarySys.util.Customer;

public class MajorFunc implements UWInterface{
	
	//following main function will be put into windowPopOut
	public static void main(String[] args){
		UWFrameOut o1 = UWFrameOut.getInstance();
		o1.init();
		o1.revalidate();
		//o1.cP.cbP1.display(o1.CenterDisplayList.get(0));
		o1.frameAddBooks();
		o1.framePassBookListToCenter();
	}


	@Override
	public void windowPopOut(ArrayList<Customer> customers,
			ArrayList<Book> books, ArrayList<Administrator> adms) {
		// TODO Auto-generated method stub
		
	}
	
	
}
