package Refacoring;

public class DrawIt {

    public static void main(String[] args) {

        // Objekte erstellen (UUID wird automatisch in Geometry gesetzt)
        Geometry filledGreyRect = new Rectangle(true, "grey", 2, 6);
        Geometry unfilledBlueRect = new Rectangle(false, "blue", 8, 9);
        Geometry filledGreyCircle = new Circle(true, "grey", 3);
        Geometry unfilledRedCircle = new Circle(false, "red", 3);
        Geometry c1 = new Circle(false,"pink", 3);
        
        GeometryCollection<Geometry> construction = new GeometryCollection<>();

        construction.add(c1);
        construction.add(filledGreyRect);
        construction.add(unfilledBlueRect);
        construction.add(filledGreyCircle);
        construction.add(unfilledRedCircle);

        // ID des Objekts merken, das wir "wie früher" mit 4 angesprochen hätten
        // (wir nehmen hier unfilledRedCircle, weil du damit später arbeitest)
        var targetId = unfilledRedCircle.getId();

        try {
            System.out.println("The area of the object is: " + construction.getById(targetId).calculateArea());
        } catch (InvalidAccessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(construction.contains(unfilledRedCircle));

        construction.remove(unfilledRedCircle);

        try {
            // Nach dem remove muss getById fehlschlagen
            System.out.println(construction.getById(targetId).calculateArea());
        } catch (InvalidAccessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(construction.contains(unfilledRedCircle));
    }
}