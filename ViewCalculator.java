public class ViewCalculator {
    private IComplexNumberFactory complexNumberFactory;

    public ViewCalculator(IComplexNumberFactory complexNumberFactory) {
        this.complexNumberFactory = complexNumberFactory;
    }

    public void run() {
        while (true) {
            int realPart = promptInt("Введите действительную часть: ");
            int imaginaryPart = promptInt("Введите мнимую часть: ");
            ComplexNumber complexNumber = complexNumberFactory.create(realPart, imaginaryPart);
            while (true) {
                String cmd = prompt("Введите операцию (*, +, -, /, = ): ");
                if (cmd.equals("*")) {
                    int real = promptInt("Введите действительную часть для multiplication: ");
                    int imaginary = promptInt("Введите мнимую часть для multiplication: ");
                    complexNumber.multiply(real, imaginary);
                    continue;
                }
                if (cmd.equals("+")) {
                    int real = promptInt("Введите действительную часть для addition: ");
                    int imaginary = promptInt("Введите мнимую часть для addition: ");
                    complexNumber.add(real, imaginary);
                    continue;
                }
                if (cmd.equals("-")) {
                    int real = promptInt("Введите действительную часть для subtraction: ");
                    int imaginary = promptInt("Введите мнимую часть для subtraction: ");
                    complexNumber.subtract(real, imaginary);
                    continue;
                }
                if (cmd.equals("/")) {
                    int real = promptInt("Введите действительную часть для division: ");
                    int imaginary = promptInt("Введите мнимую часть для division: ");
                    complexNumber.divide(real, imaginary);
                    continue;
                }
                if (cmd.equals("=")) {
                    int realResult = complexNumber.getRealPart();
                    int imaginaryResult = complexNumber.getImaginaryPart();
                    System.out.printf("А вот что получилось: %d + %di\n", realResult, imaginaryResult);
                    break;
                }
            }
            String cmd = prompt("Хотите ли вы выполнить другое вычисление (Y/N)?");
            if (!cmd.equals("Y")) {
                break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
