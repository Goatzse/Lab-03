// Base class
class Fruit {
    void show() {
        System.out.println("This is Fruit class");
    }
}

// Banana inherits Fruit
class Banana extends Fruit {
    void show() {
        System.out.println("This is Banana class");
    }
}

// Cherry inherits Fruit
class Cherry extends Fruit {
    void show() {
        System.out.println("This is Cherry class");
    }
}

// Main class
public class FruitTest {
    public static void main(String[] args) {

        Fruit f = new Fruit();
        Banana b = new Banana();
        Cherry c = new Cherry();

        f.show();   // Fruit show()
        b.show();   // Banana show()
        c.show();   // Cherry show()
    }
}

