//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();


        Shape shape1 = shapeFactory.getShape("SQUARE");
        if (shape1 != null){
            shape1.draw();
        }

        Shape shape2 = shapeFactory.getShape("CIRCLE");
        if (shape2 != null){
            shape2.draw();
        }

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        if (shape3 != null){
            shape3.draw();
        }

        Shape shape4 = shapeFactory.getShape("TRIANGLE");
        if (shape4 != null){
            shape4.draw();
        }

    }
}