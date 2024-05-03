public class Main {
    public static void main(String[] args) {
        IComplexNumberFactory complexNumberFactory = new ComplexNumberFactory();
        ViewCalculator view = new ViewCalculator(complexNumberFactory);
        view.run();
    }
}
