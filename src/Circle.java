public class Circle implements  IShape{
    private String name;
    private float radius;
    float  PI = 3.14f;

    public String getName() {
        return name;
    }
    @Override
    public float calculatArea() {
        return  radius*radius*PI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(String name) {
        this.name = name;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(String name, float radius) {
        this.name = name;
        this.radius = radius;
    }

}
