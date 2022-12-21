package perpustakaan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book {
	
	private String sinopsis;
	private String judul;
	private String bookID;
	private boolean borrowed;
	
	private LocalDate borrowedDate;
	private LocalDate returnedDate;
	private long maxBorrowingDuration;
	
	public void setBorrowedDateByNumbers(int year, int month, int day) {
		borrowedDate = LocalDate.of(year, month, day);
	}
	
	public void setBorrowedDateNow() {
		borrowedDate = LocalDate.now();
	}
	
	public void setReturnedDateByNumbers(int year, int month, int day) {
		returnedDate = LocalDate.of(year, month, day);
	}
	
	public long calculateBorrowingDuration() {
		long borrowDuration = ChronoUnit.DAYS.between(borrowedDate, returnedDate);
		return borrowDuration;
	}
	
	public boolean isOverTime() {
		return calculateBorrowingDuration() > maxBorrowingDuration;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the sinopsis
	 */
	public String getSinopsis() {
		return sinopsis;
	}
	/**
	 * @param sinopsis the sinopsis to set
	 */
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	/**
	 * @return the judul
	 */
	public String getJudul() {
		return judul;
	}
	/**
	 * @param judul the judul to set
	 */
	public void setJudul(String judul) {
		this.judul = judul;
	}
	/**
	 * @return the bookID
	 */
	public String getBookID() {
		return bookID;
	}
	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	public long getMaxBorrowingDuration() {
		return maxBorrowingDuration;
	}

	public void setMaxBorrowingDuration(long maxBorrowingDuration) {
		this.maxBorrowingDuration = maxBorrowingDuration;
	}
	
}
