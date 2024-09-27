class Circle {
   
    double radius, diameter, area;

    //constructor
    public Circle() {
        this.radius = 1;
        this.diameter = 2 * radius;
        this.area = Math.PI * radius * radius;
    }

    //setter
    public void setRadius(double rad) {
        this.radius = rad;
        this.diameter = 2 * radius;
        this.area = Math.PI * radius  * radius;
    }

    //getters
    public double getRadius() {
        return this.radius;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double getArea() {
        return this.area;
    }


}   