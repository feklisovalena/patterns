public class LogComplexNumberFactory implements IComplexNumberFactory {

    private Loggable logger;

    public LogComplexNumberFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber create(int real, int imaginary) {
        return new LogComplexCalculator(new ComplexCalculator(real, imaginary), logger);
    }
}
