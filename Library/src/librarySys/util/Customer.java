package librarySys.util;

import java.io.Serializable;
import java.util.*;

public class Customer implements Serializable{
	private String customerName;
	private String password;
	private ArrayList<Integer> bookList;
	private double penalty;
	
	Customer(String name, String p){
		this.setCustomerName(name);
		this.setPassword(p);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Integer> getBooklist() {
		return bookList;
	}

	public void setBooklist(ArrayList<Integer> booklist) {
		this.bookList = booklist;
	}

	public double getPenalty() {
		return penalty;
	}

	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}
	
	public void rentBook(int bookID){
		bookList.add(bookID);
	}
	
	public void returnBook(int bookID){
		if(bookList.contains(bookID)){
			int index = bookList.indexOf(bookID);
			bookList.remove(index);
		}
	}
}
