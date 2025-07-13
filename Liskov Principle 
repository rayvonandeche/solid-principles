
abstract class Bird {
    public abstract void move();
}

// Subclass: FlyingBird honors Bird's contract
abstract class FlyingBird extends Bird {
    public abstract void fly();

    @Override
    public void move() {
        fly(); // FlyingBirds move by flying
    }
}

// Subclass: NonFlyingBird also honors Bird's contract
abstract class NonFlyingBird extends Bird {
    @Override
    public void move() {
        System.out.println("Walking or swimming...");
    }
}

// Concrete class: Sparrow is a FlyingBird
class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying in the sky!");
    }
}

// Concrete class: Penguin is a NonFlyingBird
class Penguin extends NonFlyingBird {
    // No fly() method here—Penguins can't fly!
}

// Main class to test substitution
public class BirdDemo {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();   // LSP holds
        Bird bird2 = new Penguin();   // LSP holds

        bird1.move();  // Output: Sparrow flying in the sky!
        bird2.move();  // Output: Walking or swimming...

        // We never call fly() on Penguin, so no runtime errors
    }
}