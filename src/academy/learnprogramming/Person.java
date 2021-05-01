package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        if (this.firstName != null && this.firstName != "") {
            if (this.lastName != null && this.lastName != "") {
                return this.firstName + " " + this.lastName;
            } else {
                return this.firstName;
            }
        } else {
            if (this.lastName != null && this.lastName != "") {
                return lastName;
            } else {
                return "";
            }
        }
    }
}
