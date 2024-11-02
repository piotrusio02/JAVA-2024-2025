public class Employee extends Person{

    Employee(String firstName,String lastName){
        super(firstName, lastName);
    }
    public void displayData(){
        System.out.println(getFirstName()+" "+getLastName());
    }

}
