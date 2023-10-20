public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetr = 1.87;
        double weightKg = 98;
        double Bmi = service.calculate(heightMetr, weightKg);
        System.out.println(Bmi);

    }
}