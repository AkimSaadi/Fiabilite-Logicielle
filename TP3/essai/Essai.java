package essai;

public class Essai {
	/**
	 * @author lugiez
	 * @version 1
	 */

	private double val = 0.0;

	public Essai(double val) {
		super();
		this.val = val;
	}

	/**
	 * @return value of attribute val
	 */
	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}
	
	public void ajouter(double v) {
		this.val += v;
	}
	
	/**
	 * To raise an exception for val==0
	 * @return 1/val
	 */
	public double inverserVal() throws IllegalArgumentException  {	
		double v = this.val;
		if (v == 0.0) {
			throw new IllegalArgumentException();
		}
		else {
			return 1 / v;
		}
	}
	
	/*
	 * infinite loop
	 */
	public double infinite() {
	boolean b = true;
	while (b) {
		b = true;
	}
	return 0.0;
	}
	
	public static void main(String[] args) {
		System.out.print("ok\n");
		Essai essai = new Essai(0.0);
		try {
			double v = essai.inverserVal();
			System.out.print(v);
		} catch (Exception e) {
			System.out.print("ko");
		}
	}

}

