// Coding exercise 31

public class Wall {

    private double width;
    private double height;

   public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
        this.width = width > 0 ? width : 0;
        this.height = height > 0 ? height : 0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 0;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }

    public double getArea() {
        return width * height;
    }

/*
    public static void main(String[] args) {

     Wall w = new Wall(5,4);
     System.out.println(w.getArea());

     w.setHeight(-1.5);
     System.out.println(w.getArea());

 }
*/
}
