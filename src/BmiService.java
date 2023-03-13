public class BmiService {
    public double calculate(double weightInKg, double heightInMeters) {
        double twoHeight = (heightInMeters * heightInMeters);
        double bmi = (weightInKg / twoHeight);
        return (int) bmi;
    }
}

