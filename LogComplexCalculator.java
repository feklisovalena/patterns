public class LogComplexCalculator implements ComplexNumber {
    private ComplexNumber decorated;
    private Loggable logger;

    public LogComplexCalculator(ComplexNumber decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(int real, int imaginary) {
        int originalReal = decorated.getRealPart();
        int originalImaginary = decorated.getImaginaryPart();
        logger.log("Original Complex Number: " + originalReal + " + " + originalImaginary + "i. Begin calling add method with parameters: " + real + " + " + imaginary + "i");
        ComplexNumber result = decorated.add(real, imaginary);
        logger.log("Add method called successfully.");
        return result;
    }

    @Override
    public ComplexNumber subtract(int real, int imaginary) {
        int originalReal = decorated.getRealPart();
        int originalImaginary = decorated.getImaginaryPart();
        logger.log("Оригинальный комплексный номер: " + originalReal + " + " + originalImaginary + "i. Begin calling subtract method with parameters: " + real + " + " + imaginary + "i");
        ComplexNumber result = decorated.subtract(real, imaginary);
        logger.log("Метод subtract вызван успешно.");
        return result;
    }

    @Override
    public ComplexNumber divide(int real, int imaginary) {
        int originalReal = decorated.getRealPart();
        int originalImaginary = decorated.getImaginaryPart();
        logger.log("Оригинальный комплексный номер: " + originalReal + " + " + originalImaginary + "i. Begin calling divide method with parameters: " + real + " + " + imaginary + "i");
        ComplexNumber result = decorated.divide(real, imaginary);
        logger.log("Метод divide вызван успешно.");
        return result;
    }

    @Override
    public ComplexNumber multiply(int real, int imaginary) {
        int originalReal = decorated.getRealPart();
        int originalImaginary = decorated.getImaginaryPart();
        logger.log("Оригинальный комплексный номер: " + originalReal + " + " + originalImaginary + "i. Begin calling multiply method with parameters: " + real + " + " + imaginary + "i");
        ComplexNumber result = decorated.multiply(real, imaginary);
        logger.log("Метод multiply вызван успешно.");
        return result;
    }

    @Override
    public int getRealPart() {
        int result = decorated.getRealPart();
        logger.log("Получение действительной части: " + result);
        return result;
    }

    @Override
    public int getImaginaryPart() {
        int result = decorated.getImaginaryPart();
        logger.log("Получение мнимой части: " + result);
        return result;
    }
}