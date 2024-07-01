public class BmiService {
    int calculate(int weight, double height) {
        return (int) (weight / (height * height));
    }
}