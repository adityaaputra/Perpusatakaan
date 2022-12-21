package perpustakaan;

public abstract class Visitor {

	private String nama;
	private String ID; 
	
	public Visitor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nama
	 */
	public String getNama() {
		return nama;
	}

	/**
	 * @param nama the nama to set
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

}
