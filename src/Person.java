public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws InvalidNameException {

        if (firstName != null) {
            this.firstName = firstName;
        }else{
            throw new InvalidNameException();
        }
    }

    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAge{
        if (age>0){
        this.age = age;
    } else{
        throw new InvalidAge("anii sunt gresiti");
        }
    }
}



