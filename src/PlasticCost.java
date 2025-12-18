import java.util.Scanner;

// 2D class
class Plastic2D {
    double length, breadth;

    void get2DData(double l, double b) {
        length = l;
        breadth = b;
    }

    double cost2D() {
        double area = length * breadth;
        return area * 40;
    }
}

// 3D class inherits 2D
class Plastic3D extends Plastic2D {
    double height;

    void get3DData(double l, double b, double h) {
        get2DData(l, b);
        height = h;
    }

    double cost3D() {
        double volume = length * breadth * height;
        return volume * 60;
    }
}

// Main class
public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth for 2D sheet:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Plastic2D sheet = new Plastic2D();
        sheet.get2DData(l, b);
        System.out.println("Cost of 2D plastic sheet: Rs " + sheet.cost2D());

        System.out.println("\nEnter length, breadth and height for 3D box:");
        double l3 = sc.nextDouble();
        double b3 = sc.nextDouble();
        double h3 = sc.nextDouble();

        Plastic3D box = new Plastic3D();
        box.get3DData(l3, b3, h3);
        System.out.println("Cost of 3D plastic box: Rs " + box.cost3D());

        sc.close();
    }
}


