// Practical No. 10
class OverloadDemo {

    void area(float x, float y) {
        System.out.println("the area of the rectangle is " + x * y + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is " + z + " sq units");
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();

        ob.area(11, 12);
        ob.area(2.5);
    }
}