package Person;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Ivan")
                .withSurname("Ivanov")
                .withAge(30)
                .withHeight(175)
                .withWeight(80)
                .build();
        System.out.println(myPerson.getName()+" "+ myPerson.getSurname()+" "+ myPerson.getAge()
        +" "+ myPerson.getHeight() +" "+ myPerson.getWeight());
    }


}