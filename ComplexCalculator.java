public class ComplexCalculator implements ComplexNumber {

    private int realPart;
    private int imaginaryPart;

    public ComplexCalculator(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public ComplexNumber add(int real, int imaginary) {
        this.realPart += real;
        this.imaginaryPart += imaginary;
        return this;
    }

    @Override
    public ComplexNumber subtract(int real, int imaginary) {
        this.realPart -= real;
        this.imaginaryPart -= imaginary;
        return this;
    }

    @Override
    public ComplexNumber divide(int real, int imaginary) {
        this.realPart /= real;
        this.imaginaryPart /= imaginary;
        return this;
    }

    @Override
    public ComplexNumber multiply(int real, int imaginary) {
        int tempReal = this.realPart;
        this.realPart = this.realPart * real - this.imaginaryPart * imaginary;
        this.imaginaryPart = tempReal * imaginary + this.imaginaryPart * real;
        return this;
    }

    @Override
    public int getRealPart() {
        return realPart;
    }

    @Override
    public int getImaginaryPart() {
        return imaginaryPart;
    }
}

