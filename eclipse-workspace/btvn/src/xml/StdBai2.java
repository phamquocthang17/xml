package xml;

public class StdBai2 {
    private String name;
    private int tuoi;
    private double gpa;
    
	public StdBai2() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public StdBai2(String name, int tuoi, double gpa) {
		this.name = name;
		this.tuoi = tuoi;
		this.gpa = gpa;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", tuoi=" + tuoi + ", gpa=" + gpa + "]";
	}
	
}