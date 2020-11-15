package labsheet9.exercise2;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(){
        super("Ellipse");
        setMajorAxis(0);
        setMinorAxis(0);
    }

    public Ellipse(double majorAxis, double minorAxis){
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public double area() {
        return Math.PI*getMajorAxis()*getMinorAxis();
    }

    @Override
    public double perimeter() {
        double perimeter;
        perimeter = (getMajorAxis()*getMajorAxis())*(getMinorAxis()*getMinorAxis())/2;

        return 2*Math.PI*Math.sqrt(perimeter);
    }
}
