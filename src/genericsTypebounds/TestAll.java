package genericsTypebounds;

public class TestAll {

	 public static void main(String[] args) {
		 
		 //Aufgabe 1 Sortierbare Box
		 
	     SortableBox<Integer> box1 = new SortableBox<>(10);
	     SortableBox<Integer> box2 = new SortableBox<>(20);
	     System.out.println(box1.compareToOtherBox(box2));
	     
	     //Aufgabe 2 ShapeBox
	     
	     ShapeBox<Circle> circleBox = new ShapeBox<>(new Circle());
	     ShapeBox<Rectangle> rectangleBox = new ShapeBox<>(new Rectangle());
	     
	     circleBox.drawShape();
	     rectangleBox.drawShape();
	     
	     
	 }

} 