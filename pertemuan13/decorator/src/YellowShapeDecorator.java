public class YellowShapeDecorator extends ShapeDecorator {
    public YellowShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setYellowBorder(decoratedShape);

    }

    public void setYellowBorder(Shape decoratedShape) {
        System.out.println("Border color : Yellow");
    }
}
