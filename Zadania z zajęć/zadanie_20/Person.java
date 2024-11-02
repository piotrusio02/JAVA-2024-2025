import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    Integer age;

    Person(String firstName, String lastName, Integer age){
        if(firstName == null || firstName.isEmpty()){
            this.firstName = "";
        }
        else{
            this.firstName = firstName;
        }
        if(lastName == null || lastName.isEmpty()){
            this.lastName = "";
        }
        else{
            this.lastName = lastName;
        }
        if(age == null || age < 0){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person: " + this.firstName +" "+ this.lastName +  ", Age=" + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
