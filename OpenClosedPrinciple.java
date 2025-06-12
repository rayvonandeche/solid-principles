import java.util.*;


interface CalorieCalculator {
    int calculateCalories();
}

class Apple implements CalorieCalculator {
    public int calculateCalories() {
        return 95;
    }
}

class Banana implements CalorieCalculator {
    public int calculateCalories() {
        return 105;
    }
}

class Avocado implements CalorieCalculator {
    public int calculateCalories() {
        return 160;
    }
}

class CalorieCounter {
    public int totalCalories(List<CalorieCalculator> items) {
        return items.stream()
                    .mapToInt(CalorieCalculator::calculateCalories)
                    .sum();
    }
}


public class OpenClosedPrinciple {
    public static void main(String[] args) {
        List<CalorieCalculator> foodItems = Arrays.asList(
            new Apple(),
            new Banana(),
            new Avocado()
        );

        CalorieCounter counter = new CalorieCounter();
        int total = counter.totalCalories(foodItems);

        System.out.println("Total Calories: " + total);
    }
}
