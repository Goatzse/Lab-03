import java.util.Scanner;

// Parent class
class Plate {
    int length, width;

    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate Constructor Called");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

// Child class of Plate
class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);   // calls Plate constructor
        height = h;
        System.out.println("Box Constructor Called");
        System.out.println("Height: " + height);
    }
}

// Child class of Box
class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);  // calls Box constructor
        thick = t;
        System.out.println("WoodBox Constructor Called");
        System.out.println("Thickness: " + thick);
    }
}

// Main class
public class jk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        int l = sc.nextInt();

        System.out.println("Enter width:");
        int w = sc.nextInt();

        System.out.println("Enter height:");
        int h = sc.nextInt();

        System.out.println("Enter thickness:");
        int t = sc.nextInt();

        // Object creation
        WoodBox wb = new WoodBox(l, w, h, t);
    }
}
