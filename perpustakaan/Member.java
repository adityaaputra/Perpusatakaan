package perpustakaan;

public class Member extends Visitor implements Borrow {

	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BorrowBook() {
		// TODO Auto-generated method stub
		System.out.println("Buku bisa dipinjam 3 minggu"); 
	}

}
