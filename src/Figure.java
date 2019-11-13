class Void implements Figure {
    public double perimeter() {
        return 0.0;
    }

    public double area() {
        return 0.0;
    }

    public Figure add(R2Point p) {
        return new Point(p);
    }
}

// Интерфейс, задающий новый тип - фигуру.
interface Figure {
    public double perimeter();
    public double area();
    public Figure add(R2Point p);
}

// Класс "нульугольник", реализующий интерфейс фигуры.
class Void implements Figure {
    public double perimeter() {
        return 0.0;
    }
    public double area() {
        return 0.0;
    }
    public Figure add(R2Point p) {
        return new Point(p);
    }
}
// Класс "одноугольник", реализующий интерфейс фигуры.
class Point implements Figure {
    private R2Point p;
    public Point(R2Point p) {
        this.p = p;
    }
    public double perimeter() {
        return 0.0;
    }
    public double area() {
        return 0.0;
    }
    public Figure add(R2Point q) {
        if (!R2Point.equal(p,q)) return new Segment(p, q);
        else return this;
    }
}
