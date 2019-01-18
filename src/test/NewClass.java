/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Book{
	String title;
	String author;
	int year;
	
	// constructor with arguments
	public Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	// toString method used for printout the object
	public String toString(){
		return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
	}

	// getters
	public String  getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getYear(){
		return year;
	}
}

class Order{
	Book book;
	LocalDate dateOfOrder;
	
	// constructor with arguments
	public Order(Book book, int year, int month, int day){
		this.book = book;
		this.dateOfOrder = LocalDate.of(year, month, day);
	}
	
	// method used to printout the order
	public String toString(){
		return "Order created: " + dateOfOrder + "\n" +
		       " ordered book: " + book;
		
	}

	//getters
	public Book getBook(){
		return book;
	}
	
	public LocalDate getDateOfOrder(){
		return dateOfOrder;
	}
}

/* Name of the class has to be "Main" only if the class is public. */
class OrdersQueueExample
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Create 3 sample books
		Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
		Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
		Book theBook3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);
		Book theBook4 = new Book("Art of War", "Sun Tzu", 572);
		Book theBook5 = new Book("The Witcher", "Andrzej Sapkowski", 1982);                

		// Create 5 sample orders
		Order theOrder1 = new Order(theBook1, 2019, 1, 2);
		Order theOrder2 = new Order(theBook2, 2019, 1, 3);
		Order theOrder3 = new Order(theBook3, 2019, 1, 5);
		Order theOrder4 = new Order(theBook4, 2019, 1, 7);
		Order theOrder5 = new Order(theBook5, 2019, 1, 10);

		// Create the FIFO queue
		ArrayDeque<Order> theOrders = new ArrayDeque<Order>();

		// Check size of the queue
		System.out.println("Queue is created. It's size: " + theOrders.size());

		// Put the orders into the queue
		theOrders.push(theOrder1);
		theOrders.push(theOrder2);
		theOrders.push(theOrder3);
		theOrders.push(theOrder4);
		theOrders.push(theOrder5);

		// Check size of the queue
		System.out.println("Queue is filled. It's size: " + theOrders.size());
		System.out.println();
		
		// Examine the order at beginning of the queue
		System.out.println("First order in the queue is: \n" + theOrders.peek());
		System.out.println();

		// Get objects from queue
		Order temporaryOrder;
		temporaryOrder = theOrders.pop();

		// here you can do something with order taken from the queue
		temporaryOrder = theOrders.pop();
		temporaryOrder = theOrders.pop();
		temporaryOrder = theOrders.pop();
		temporaryOrder = theOrders.pop();

		// Check size of the queue
		System.out.println("Queue is emptied. It's size: " + theOrders.size());
		System.out.println();

		// Check what was taken as last
		System.out.println("Last order taken from queue was:\n" + temporaryOrder);
		System.out.println();
                
	}
}