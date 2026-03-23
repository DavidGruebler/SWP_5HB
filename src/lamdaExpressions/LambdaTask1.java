package lamdaExpressions;
 
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;
 
 
public class LambdaTask1 {
 
	
	
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("läuft");
		ActionListener listener = e -> System.out.println("Event" + e.getActionCommand());
		Supplier<String> supplier = () -> "Hallo";
		Consumer<Point> consumer = p -> p.translate(1, 2);
		Comparator<Rectangle> comparator = (r1, r2) -> Integer.compare(r1.width, r2.width);
		
		
	
 
	}
 
}
 