public abstract class Person {

    protected int Id;
    protected String name;

    public Person() {

        this.Id = 0000;
        this.name = "Unknown";
    }

    public Person(int Id, String name) {

        this.Id = Id;
        this.name = name;
    }

    public abstract void displayDetails();

}
