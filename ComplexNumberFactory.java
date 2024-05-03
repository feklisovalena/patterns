public class ComplexNumberFactory implements IComplexNumberFactory {
    public ComplexNumber create(int real, int imaginary) {
        return new ComplexCalculator(real, imaginary);
    }
}
