public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Doe1");

        Person person2 = new Person();
        person2.setFirstName("Jane");
        person2.setLastName("Doe2");

        System.out.println("Person 1 : " + person1.getFirstName() + " " + person1.getLastName());

        System.out.println("Person 2 : " + person2.getFirstName() + " " + person2.getLastName());

    }
}
