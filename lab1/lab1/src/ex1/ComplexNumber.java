package ex1;

public class ComplexNumber {
    private int Real;
    private int Imaginary;

    public ComplexNumber(int real, int imaginary) {
        Real = real;
        Imaginary = imaginary;
    }

    public int getReal() {
        return Real;
    }

    public void setReal(int real) {
        Real = real;
    }

    public int getImaginary() {
        return Imaginary;
    }

    public void setImaginary(int imaginary) {
        Imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "Real=" + Real +
                ", Imaginary=" + Imaginary +
                '}';
    }

    public ComplexNumber Addition(ComplexNumber CN1,ComplexNumber CN2){
        int real=CN1.getReal()+CN2.getReal();
        int imag=CN1.getImaginary()+CN2.getImaginary();
       ComplexNumber CN3=new ComplexNumber(real,imag);
        return CN3;
    }
    public ComplexNumber Subtraction(ComplexNumber CN1,ComplexNumber CN2){
        int real=CN1.getReal()-CN2.getReal();
        int imag=CN1.getImaginary()-CN2.getImaginary();
        ComplexNumber CN3=new ComplexNumber(real,imag);
        return CN3;
    }

    public ComplexNumber Multiplication(ComplexNumber CN1,ComplexNumber CN2){
        int real=(CN1.getReal()*CN2.getReal()) - (CN1.getImaginary()*CN2.getImaginary());
        int imag=(CN1.getReal()*CN2.getImaginary()) + (CN1.getImaginary()*CN2.getReal());
        ComplexNumber CN3=new ComplexNumber(real,imag);
        return CN3;
    }
}

