package librarySys.util;

import java.io.Serializable;
import java.sql.Date;

public class Book implements Serializable{
	private int bookID;
	private String bookName;
	private boolean status;
	private String category;
	private String customerName;
	private String imagePath;
	private Date dueDate;
	
	Book(String name, String c, String im) {
		this.setBookName(name);
		this.setCategory(c);
		this.setImage(im);
		this.setStatus(false);
	}
	
	public void rent(String cName) {
		this.setCustomerName(cName);
	}
	
	public int getBookID() {
		return bookID;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookname) {
		this.bookName = bookname;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getImage() {
		return imagePath;
	}
	
	public void setImage(String image) {
		this.imagePath = image;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}

