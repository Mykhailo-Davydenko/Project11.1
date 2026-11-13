import java.util.ArrayList;
import java.util.Random;
public class NumberAnalyzer {
    private ArrayList<Integer> numbers = new ArrayList<>();
    public void addNumber(int n) {
        numbers.add(n);
    }
    public double getAverage(){
        if (numbers.isEmpty()){
            return 0;
        }else {
            double sum = 0;
            for (int n: numbers){
                sum += n;

            }
            return sum/numbers.size();
        }
    }
    public int getMax(){
        if (numbers.isEmpty()){
            return 0;
        }else {
            int max = numbers.get(0);
            for (int n: numbers){
                if (n > max) {
                    max = n;
                }

            }
            return max;
        }
    }
    public int getMin(){
        if (numbers.isEmpty()){
            return 0;
        }else {
            int min = numbers.get(0);
            for (int n: numbers){
                if (n<min){
                    min = n;
                }
            }
            return min;
        }
    }
    public void removeNegativeNumbers() {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            }
        }
    }
    public void printResults() {
        System.out.println("Numbers: " + numbers);
        System.out.printf("Average: %.2f%n", getAverage());
        System.out.println("Max: " + getMax());
        System.out.println("Min: " + getMin());
    }

}
