package librarySys;

import java.util.ArrayList;

import librarySys.util.Administrator;
import librarySys.util.Book;
import librarySys.util.Customer;

public class Library {
	
	ArrayList<Customer> customers;
	ArrayList<Administrator> administrators;
	ArrayList<Book> books;
	
	public static void  main(String[] args){
		
	}
	
	public void showUserWindow(){
		/*
		 * this method should pop out the user window and start running
		 */
	}
	
	public void showLoginWindow(){
		/*
		 * this method should pop out the login window and start running
		 */
	}
	
	/*
	 * return the list
	 */
	public ArrayList<Customer> getAllCustomer(){
		return customers;
	}
	public ArrayList<Book> getAllBook(){
		return books;
	}
	public ArrayList<Administrator> getAllAdmins(){
		return administrators;
	}
	
	/*
	 * GUI, LOGIN and Serialization main class should extends library
	 * they should modify object list using following method or overriding them 
	 */
	public void addCustomer(Customer cObj){
		customers.add(cObj);
	}
	public void addBook(Book bObj){
		books.add(bObj);
	}
	public void addAdministrator(Administrator aObj) {
		administrators.add(aObj);
	}	
	
	public void deleteCustomer(int customerID){
		//searching id and delete it
	}
	public void deleteBook(int bookID){
		//searching id and delete it
	}
	public void deleteAdministrator(int adminID){
		//search and delete, again
	}
}
