class TestCircle {

    public static void main(String[] args) {

        //objects
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        //print getter methods 
        a.setRadius(3);
        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());

        b.setRadius(20);
        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());

        c.setRadius(19);
        System.out.println("Radius of the third circle: " + c.getRadius());
        System.out.println("Diameter of the third circle: " + c.getDiameter());
        System.out.println("Area of the third circle: " + c.getArea());

    }
}