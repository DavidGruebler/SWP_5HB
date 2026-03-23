package innereKlassen.innere.typen;

public class Person {

    private String name;

 
    public Person(String name) {
        this.name = name;
    }

    public class Details {
        public void showName() {
            System.out.println(name);
        }
    }


    public static void main(String[] args) {
        Person p = new Person("Anna");
        Person.Details details = p.new Details(); 
        details.showName();
    }
}

