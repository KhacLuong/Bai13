public class Square implements IShape{
    private String name;
    private float width;

    public String getName() {
        return name;
    }

    @Override
    public float calculatArea() {
        return width*width;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Square() {
    }

    public Square(String name) {
        this.name = name;
    }

    public Square(float width) {
        this.width = width;
    }

    public Square(String name, float width) {
        this.name = name;
        this.width = width;
    }

    public static void main(String[] args) {
    }
}
