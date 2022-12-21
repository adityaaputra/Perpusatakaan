package perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<Book> ListOfBooks = new ArrayList<Book>();
	
	public void ShowAllBook() {
		for(int i = 0; i < ListOfBooks.size(); i++) {
			System.out.print(i + ". ");
			System.out.println(ListOfBooks[i].judul);
		}
	}
	
	public void BorrowBook() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input Book ID ... ");
		int borrowedBookID = in.nextInt();
		
		System.out.print("Input Guest Type ... ");
		int visitorType = in.nextInt();
		// Kalau visitor type = 1, maka dia guest, kalau type = 2, maka dia member
		if(visitorType == 1) {
			Guest g = new Guest();
			g.BorrowBook();
			ListOfBooks.get(borrowedBookID).setMaxBorrowingDuration(14); // 2 minggu
		}
		else if(visitorType == 2) {
			Member m = new Member();
			m.BorrowBook();
			ListOfBooks.get(borrowedBookID).setMaxBorrowingDuration(21); // 3 minggu
		}
		
		ListOfBooks.get(borrowedBookID).setBorrowedDateNow();
		ListOfBooks.get(borrowedBookID).setBorrowed(true);
	}
	
	public void ReturnBook() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input Book ID ... ");
		int borrowedBookID = in.nextInt();
		
		System.out.println("Input Return Date");
		System.out.print("Input return year");
		int year = in.nextInt();
		System.out.print("Input return month [1-12]");
		int month = in.nextInt();
		System.out.print("Input return day [1-31]");
		int day = in.nextInt();
		
		ListOfBooks.get(borrowedBookID).setReturnedDateByNumbers(year, month, day);
		ListOfBooks.get(borrowedBookID).setBorrowed(false);
		ListOfBooks.get(borrowedBookID).calculateBorrowingDuration();
		boolean isOverTime = ListOfBooks.get(borrowedBookID).isOverTime();
		if(isOverTime) {
			System.out.println("Buku dipinjam melebihi batas maksimal waktu peminjaman!");
		}
		else {
			System.out.println("Buku sudah dikembalikan secara in time.");
		}
	}
	
	public void AddBook() {
		Book newBook = new Book();
		ListOfBooks.add(newBook);
	}

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
