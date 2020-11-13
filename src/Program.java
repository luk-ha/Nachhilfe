import java.util.ArrayList;

class Program {

    public static void main(String[] args) {
        boolean weitereAnlegen = true;
        ArrayList<Person> personen = new ArrayList<Person>();

        while (weitereAnlegen) {

            Person person = new Person();

            System.out.println("Vorname eingeben:");
            String vorname = System.console().readLine();

            person.setVorname(vorname);
            personen.add(person);

            System.out.println("Weitere anlegen (y/n)?");
            String weitere = System.console().readLine();
            if (weitere.equals("n"))
                weitereAnlegen = false;
        }

        System.out.println("Angelete Personen: ");
        for (Person p : personen)
            System.out.println("Vorname der Person: " + p.getVorname());
    }
}

class Person {
    String vorname;
    String nachname;

    Person() {

    }

    void setVorname(String vorname) {
        this.vorname = vorname;
    }

    String getVorname() {
        return vorname;
    }
}