import java.util.*;

interface CalorieCalculator {
    int calculateCalories();
    //This interface is closed for modification because its definition doesn't need to change when new food types are added.
}

//You can add new food types (like Banana and Avocado) without modifying the existing Apple or Banana classes. 
//This demonstrates that the code is open for extension.
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

//the following class uses the CalorieCalculator interface to calculate the total calories. 
//It doesn't need to know the specific types of food items, making it closed for modification. 
class CalorieCounter {
    public int totalCalories(List<CalorieCalculator> items) {
        return items.stream()
                    .mapToInt(CalorieCalculator::calculateCalories)
                    .sum();
    }
}

//In the OpenclosedPrinciple class, you can add new food items to the list without modifying the existing code structure. 
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
