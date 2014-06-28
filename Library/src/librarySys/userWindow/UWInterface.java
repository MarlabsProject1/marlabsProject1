package librarySys.userWindow;

import java.util.ArrayList;

import librarySys.util.Administrator;
import librarySys.util.Book;
import librarySys.util.Customer;

public interface UWInterface {
	void windowPopOut(ArrayList<Customer> customers, ArrayList<Book> books, ArrayList<Administrator> adms);
}
