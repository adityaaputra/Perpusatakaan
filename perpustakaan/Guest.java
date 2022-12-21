package perpustakaan;

public class Guest extends Visitor implements Borrow {
	
	
	public Guest() {
		// TODO Auto-generated constructor stub
	}

	public void BorrowBook() {
		// TODO Auto-generated method stub
		System.out.println("Silahkan bayar Rp10.000");
		System.out.println("Buku bisa dipinjam 1 minggu");
	}

}
