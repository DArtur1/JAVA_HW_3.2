public class BmiService {
    public int calculate (double heightMeter, double weightKg) {
        int result = (int) (weightKg / (heightMeter * heightMeter));
        return result;
    }
}
