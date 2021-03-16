public class Complex {
	private int real;
	private int imaginary;
	
	public Complex(int real, int imaginary) {
		this.real=real;
		this.imaginary = imaginary;
	}
	
	public Complex() {
		this(0,0);
	}
	
	public Complex(Complex c) {
			this.real = c.real;
			this.imaginary = c.imaginary;
	}
	
	public Complex getComplex() {
		return new Complex(this.real, this.imaginary);
	}
	
	public void setComplex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void addWithComplex(Complex complex) {
		this.real += complex.real;
		this.imaginary += complex.imaginary;
	}
	
	public void showNumber() {
		System.out.println(real+"+"+imaginary+"i");
	}

}
