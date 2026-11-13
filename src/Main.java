import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ShoppingListManager manager = new ShoppingListManager();
    manager.displayItems();
    manager.addItem("Meat");
    manager.addItem("Water");
    manager.addItem("Apple");
    manager.displayItems();
    manager.removeItem("Apple");
    manager.displayItems();
    manager.removeItem("Apple");
    manager.displayItems();
    System.out.println("part 2");

    NumberAnalyzer analyzer = new NumberAnalyzer();
    Random rnd = new Random();

    for (int i = 0; i < 12; i++) {
        analyzer.addNumber(rnd.nextInt(41) - 20);
    }

    System.out.println("Before removing negatives");
    analyzer.printResults();

    analyzer.removeNegativeNumbers();

    System.out.println("After");
    analyzer.printResults();

    System.out.println("Part3");
    StudentGrades student = new StudentGrades();
    student.addGrade(73.5);
    student.addGrade(77.0);
    student.addGrade(56.8);
    student.addGrade(84.5);
    student.printGrades();
    double avg = student.getAverageGrade();
    System.out.println("Average gade is "+ avg);
    System.out.println("Grades above average:"+student.getGradesAbove(avg));
    student.removeLowestGrade();
    System.out.println("After removing lowest");
    student.printGrades();

    System.out.println("Part4");
    StringListUtils utils = new StringListUtils();
    utils.addSentence("I like to drink green tea");
    utils.addSentence("hf ghhfhjdjdj llld");
    utils.printSentences();
    System.out.println("Total words: " + utils.countWords());
    System.out.println("Longest word: " + utils.findLongestWords());

    utils.removeShortWords(4);
    utils.printSentences();
    System.out.println("Total words after removal: " + utils.countWords());
}








}