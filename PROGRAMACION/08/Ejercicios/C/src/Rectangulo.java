public class Rectangulo {

    private int x1, y1, x2, y2;

    public int getX1() {
        return this.x1;
    }

    public int getY1() {
        return this.y1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY2() {
        return this.y2;
    }

    public void setX1(int x) {
        x1 = x;
    }

    public void setY1(int y) {
        y1 = y;
    }

    public void setX2(int x) {
        if (x > this.x1) {
            System.err.println("ERROR: valor erroneo.");
        } else {
            x2 = x;
        }
    }

    public void setY2(int y) {
        if (y > this.y1) {
            System.err.println("ERROR: valor erroneo");
        } else {
            y2 = y;
        }
    }

}
