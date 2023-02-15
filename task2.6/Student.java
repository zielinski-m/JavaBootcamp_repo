public class Student {
    String firstName;
     String lastName;
     String contactNumber;

    public Student(String firstName, String lastName, String contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }

    public void removeContactNumber() {
        contactNumber = "";
    }

    @Override
    public boolean equals(Object o) {
        Student e = (Student) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.contactNumber.equals(e.contactNumber);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(contactNumber.substring(0, 5));
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + contactNumber;
    }
}
