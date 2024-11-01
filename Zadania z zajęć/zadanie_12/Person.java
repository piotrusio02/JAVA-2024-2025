public class Person {
    String firstName;
    String lastName;
    Integer age;

    Person(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    Person(String firstName, String lastName){
        this(firstName,lastName,0);

    }

    public void temp(){
        System.out.println(firstName+" "+lastName+", "+age);
    }
}
