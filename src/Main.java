public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println();
        System.out.println("weightInKg =98  heightInMeters =1.87");
        System.out.println("Bmi =");
        System.out.println(service.calculate(98, 1.87));

        System.out.println();
        System.out.println("weightInKg =125  heightInMeters =1.56");
        System.out.println("Bmi =");
        System.out.println(service.calculate(125, 1.56));

        System.out.println();
        System.out.println("weightInKg =68  heightInMeters =1.49");
        System.out.println("Bmi =");
        System.out.println(service.calculate(68, 1.49));
    }
}