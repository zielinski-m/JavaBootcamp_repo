class UserValidator {

    public boolean nameValidator(String name) {

        if (name != null) {
            return true;
        } else {
            System.out.println("Incorrect name");
            return false;
        }
    }
    public void ageValidator(double age) {
        if (age > 30) {
            System.out.println("User is older than 30");
        } else {
            System.out.println("User is younger than 30");
        }
    }
    public void heightValidator(double height) {
        if (height > 160) {
            System.out.println("User is higher than 160cm");
        } else {
            System.out.println("User is lower than 160cm");
        }
    }
}

class Application {

    public static void main(String[] args) {

        System.out.println("Checking...");

        String name = "Adam";
        double age = 40.5;
        double height = 178;

        UserValidator validator = new UserValidator();
        boolean correctNameInput = validator.nameValidator(name);
        if (correctNameInput) {
            validator.ageValidator(age);
            validator.heightValidator(height);
        }
        System.out.println("Validation sucess!");
    }
}


