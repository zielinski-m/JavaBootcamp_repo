import java.util.Random;

class HelloWorld {
        public static void main(String[] args) {
        System.out.println("Michal \n 29 \n Z");
    }
}

class Variables {
    public static void main(String[] args) {
        int age = 43;
        String name = "User";
        char score = 'A';
        boolean verification = true;
        double accountStatus = 20.154;
        System.out.println(age + " " + name + " " + score + " " + verification + " " + accountStatus);
    }
 }

class App {
    public static void main(String[] args) {
       String myName = "Janusz";
       int myAge = 22;
       double height = 1.78;
       char carClass = 'A';
       boolean isGoodProgrammer = true;
       System.out.println(myName + "\n" + myAge + "\n" + height + "\n" + carClass + "\n" + isGoodProgrammer);
    }
 }

class trafficApp {
    public static void main(String[] args) {
        String ok = "Good to go";
        String wrong = "Big traffic ahead";
        boolean roadTraffic = true ;
        boolean newRoadTraffic = false;
        if (roadTraffic) {
            System.out.println(ok);
        } else {
            System.out.println(wrong);
        }
        if (newRoadTraffic) {
            System.out.print(ok);
        } else {
            System.out.println(wrong);
        }
    } 
 }

class Number {
    public static void main(String[] args) {
        String space = " ";
        double X = 13;
        if(X % 7 == 0) {
            System.out.println("Liczba 7 jest dzielnikiem liczby" + space + X);
        } else {
            System.out.println("Liczba 7 NIE jest dzielinikiem liczby" + space + X);
        }
    }
}

class Array {
    public static void main(String[] args) {
        String names[] = new String[5];
        names[0] = "Ania";
        names[1] = "Krzysiek";
        names[2] = "Paula";
        names[3] = "Janusz";
        names[4] = "Wieslaw";
        String name = names[2];
        System.out.println(name + "\n" + names[3]);
    }
}

class Cinema {
    public static void main(String[] args) {
        String movies [] = new String [10];
        movies[0] = "mov1";
        movies[1] = "mov2";
        movies[2] = "mov3";
        movies[3] = "mov4";
        movies[4] = "mov5";
        movies[5] = "mov6";
        movies[6] = "mov7";
        movies[7] = "mov8";
        movies[8] = "mov9";
        movies[9] = "mov10";
        String movie = movies[5];
        System.out.println(movie);
    }
}

class CinemaRandom {
    public static void main(String[] args) {
        String movies [] = new String [10];
        movies[0] = "mov1";
        movies[1] = "mov2";
        movies[2] = "mov3";
        movies[3] = "mov4";
        movies[4] = "mov5";
        movies[5] = "mov6";
        movies[6] = "mov7";
        movies[7] = "mov8";
        movies[8] = "mov9";
        movies[9] = "mov10";
        // System.out.println(movies[4]);
        Random randMovie = new Random();
        int movieIndex = randMovie.nextInt(movies.length);
        String movie = movies[movieIndex];
        System.out.println(movie);
    }
}


class Plane {
    public int planeAscent(int speed, int altitude, int time) {
        return (speed * altitude) / time;
    }
    public String landingGear (String gear) {
        return gear;
    }
    public boolean lightsOn (boolean lights) {
        return lights;
    }
    public void altitude(){}
}
class PlaneCalculator {
    public static void main(String[] args) {
        Plane calculator = new Plane();
        int result = calculator.planeAscent(10, 2, 4);
        System.out.println(result);
    }
}


class SimpleCalculator {
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int subtractAFromB(int a, int b) {
        return b - a;
    }
}    
class Application {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.addAToB(2, 200);
        System.out.println(result);    
    }
}


class Username {
    public String userName;
    public int userPin;
    public String userAge;
}


class CalculatorApp {
    public double subtractAFromB(double a, double b) {
        return b - a;
    }
}

class Result {
    public static void main(String[] args) {
        CalculatorApp calculator = new CalculatorApp();
        double result = calculator.subtractAFromB(15.45, 10.21);
        System.out.println(result);
    }
}

class User {
    private String name;
    private String sex;

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }
    public String getSex() {
        return this.sex;
    }
}

class UserApplication {
    public static void main (String[] args) {
        User michal = new User("Michal", "male");
        String name = michal.getName();
        String sex = michal.getSex();

        System.out.println(name + " " + sex);
    }
}

class TheLrgCity {          // TheLrgCity - The largest city in selected country
    private String city;
    private int population;

    public TheLrgCity(String city, int population) {
        this.city = city;
        this.population = population;
    }

    public String getCity() {
        return this.city;
    }
    public int getPopulation() {
        return this.population;
    }
}

class CityApplication {
    public static void main(String[] args) {
        TheLrgCity usa = new  TheLrgCity("New York", 8468000);
        TheLrgCity poland = new  TheLrgCity("Warsaw", 1765000);
        String cityUsa = usa.getCity();
        String cityPoland = poland.getCity();
        int populationUsa = usa.getPopulation();
        int populationPoland = poland.getPopulation();

        System.out.println(cityUsa + " " + populationUsa + "\n" + cityPoland + " " + populationPoland );
    } 
}

class Vehicle {
    private String model;
    private String year;
    
    public Vehicle (String model, String year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return this.model;
    }
    public String getYear() {
        return this.year;
    }
}

class Car extends Vehicle {
    private double engineCapacity;

    public Car(double engineCapacity, String model, String year) {
        super(model, year);
        this.engineCapacity = engineCapacity;
    }
    public double getEngineCapacity() {
        return this.engineCapacity;
    }
    public void turnOnEngine() {
    }
    public void turnOffEngine() {
    }
}

class CarApplication {
    public static void main(String[] args) {
        Car car = new Car(2.5, "XYZ", "2014");
        String model = car.getModel();
        double engineCapacity = car.getEngineCapacity();
        System.out.println(model + "\n" + engineCapacity);
    }
}

class Animal {
    private String eat;
    private String drink;

    public Animal(String eat, String drink) {
        this.eat = eat;
        this.drink = drink;
    }
    public String getEat() {
        return this.eat;
    }
    public String getDrink() {
        return this.drink;
    }
}

class Dog extends Animal {
    public Dog(String eat, String drink){
        super(eat, drink);
    } 
}

class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("chips", "water");
        String drink = dog.getDrink();
        String eat = dog.getEat();
        System.out.println(drink + " " + eat);
    }
}


class Vechicles {
    private String model;
    private String year;

    public Vechicles(String model, String year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return this.model;
    }
    public String getYear() {
        return this.year;
    }
}

class Cars extends Vechicles {
    private double engineCapacity;

    public Cars(double engineCapacity, String model, String year) { 
        super(model, year);
        this.engineCapacity = engineCapacity;
    }
    public double getEngineCapacity() {
        return this.engineCapacity;
    }
    public void engineOn() {
    }
    public void engineOff() {
    }
}   

class Application_Cars { 
    public static void main(String[] args) {
        Cars car = new Cars(2.4, "polo", "2008");
        String model = car.getModel();
        String year = car.getYear();
        double engineCapacity = car.getEngineCapacity();
        System.out.println(model + "\n" + year + "\n" + engineCapacity);
    }
}


class UserValidator {
    public boolean validateAge(int age) {
        if (age <= 15) {
            System.out.println("Too young!");
            return false;
        } else {
            System.out.println("User age is okay!");
            return true;
        }
    }
    public void validateSex(char sex) {
        if (sex == 'm') {
            System.out.println("User is a male");
        } else if (sex == 'f') {
            System.out.println("User is a female");
        } else {
            System.out.println("Unknown sex!");
        }

    }
}

class Application {
    public static void main(String[] args) {
        System.out.println("Starting...");
        int age = 15;
        char sex = 'm';
        UserValidator validator = new UserValidator();
        boolean isHigherThanOrEqualsFifteen = validator.validateAge(age);
        if (isHigherThanOrEqualsFifteen) {
            validator.validateSex(sex);
        }
        System.out.println("end");

    }
}

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
            System.out.println("Validating completed");
        }
    }
}  

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("I am drawing a Circle!");
    }
}
class Square implements Shape {
    public void draw() {
        System.out.println("I am drawing a Square!");
    }
}
class Triangle implements Shape {
    public void draw() {
        System.out.println("I am drawing a Triangle!");
    }
}

class ShapeDrawyer {
    private Shape shape;

    public ShapeDrawyer(Shape shape) {
        this.shape = shape;
    }
    public void process() {
        this.shape.draw();
    }
}

class Application {
    public static void main(String[] args) {
        Shape square = new Square();
        ShapeDrawyer shapeDrawyer = new ShapeDrawyer(square);
        shapeDrawyer.process();
    }
}

interface Telephone {
    void callTo(String name);
    default void callToMom() {
        System.out.println("Calling to mom");
    }
    static String getNumber(){
        return "4415141";
    }
}
class Mobile implements Telephone {

    public void callTo(String name) {
        System.out.println("Calling to" + name);
    }

}
class App {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.callTo("Adam");
        mobile.callToMom();
        System.out.println(Telephone.getNumber());
    }
}


interface Atm {

    void deposit();
    void withdrawal();
    default void bankSignalConnection(String status){
        System.out.println("Connection status: " + status);
    }
    static String atmClosed() {
        return "Out of service";
    }
}

class ATMImpl implements Atm {

    public void deposit() {
        System.out.println("Select a deposit amount ");
    }
    public void withdrawal() {
        System.out.println("Select a payout amount");
    }
}

class Application {
    public static void main(String[] args) {
        ATMImpl atm = new ATMImpl();
        atm.deposit();
        atm.withdrawal();
        atm.bankSignalConnection("Average");
        System.out.println(Atm.atmClosed());  
        };
}

interface Atm {

    void deposit();
    void withdrawal();
    default void bankSignalConnection(String status){
        System.out.println("Connection status: " + status);
    }
    static String atmClosed() {
        return "Sorry, Out of service";
    }
}

class ATMImpl implements Atm {

    public void deposit() {
        System.out.println("Select a deposit amount ");
    }
    public void withdrawal() {
        System.out.println("Select a payout amount");
    }
}

class Application {
    public static void main(String[] args) {
        ATMImpl atm = new ATMImpl();
        atm.deposit();
        atm.withdrawal();
        atm.bankSignalConnection("Average");
        System.out.println(Atm.atmClosed());  
        };
}

interface Animal {
    String voice();
    String name();
}

class Dog implements Animal {
    public String voice() {
        return "Hau hau!";
    }
    public String name() {
        return "Dog";
    }
}

class Cat implements Animal {

    public String voice() {
        return "miau!";
    }
    public String name() {
        return "Cat";
    }
}

class Mouse implements Animal {

    public String voice() {
        return "pi!";
    }
    public String name() {
        return "Mouse";
    }
}

class AnimalRecognizer {
    public String recognize(Animal animal) {
        return "I am sure that this is: " + animal.name() + " and sounds like: " + animal.voice();
    }
}

class Application {
    public static void main(String[] args) {
        AnimalRecognizer recognizer = new AnimalRecognizer();
        String recognizedAnimal = recognizer.recognize(new Cat());
        System.out.println(recognizedAnimal);
    }
}



interface Quest {
    String name();
    void process();
}

class DeadIslandQuest implements Quest {
    public String name() {
        return "Dead Island Quest";
    }
    public void process() {
        System.out.println("BEWARE!! You're crossing Death Island teritory. Fight with skeletons!");
    }
}

class EliteKnightQuest implements Quest {
    public String name() {
        return "Elite Knight Quest";
    }
    public void process() {
        System.out.println("HELP!! The Princess is in troubles! Help her escape from the evil castle. Hurry up!");
    }
}
class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }
    public void start() {
        System.out.println("Starting the adventure");
        this.quest.process();
        System.out.println("Good job, you completed the: " + quest.name());
    }
}

class Application {
    public static void main(String[] args) {
        Quest deadIsland = new DeadIslandQuest();
        Quest eliteKnigt = new EliteKnightQuest();
        Knight deadMission = new Knight(deadIsland);
        Knight eliteMission = new Knight(eliteKnigt);
        eliteMission.start();
        
    }
}

abstract class BankingTransactions {

    abstract protected void bankWithdrawalApproveCheck();
    abstract protected void accountBallanceCheck();
    abstract protected void bankWithdrawalApprovedInfo();

    private void cardInput() {
        System.out.println("Please enter your card");
    }
    private void pinCode() {
        System.out.println("Enter your 4-digits PIN number ****");
    }
    private void withdrawalAmount() {
        System.out.println("Enter withdrawal amount");
    }
    private void withdrawingProcess() {
        System.out.println("Withdrawing cash");
    }
    private void endingQuote() {
        System.out.println("Thank you for choosing our Bank");
    }

    public void startAtmProgram () {
        this.cardInput();
        this.pinCode();
        this.withdrawalAmount();
        this.bankWithdrawalApproveCheck();
        this.accountBallanceCheck();
        this.bankWithdrawalApprovedInfo();
        this.withdrawingProcess();
        this.endingQuote();
    }
}


class Transactions extends BankingTransactions {

    protected void bankWithdrawalApproveCheck() {
        System.out.println("Receiving withdrawal request");
    }
    protected void accountBallanceCheck() {
        System.out.println("Checking account ballance");
    }
    protected void bankWithdrawalApprovedInfo() {
        System.out.println("Confirmation of approved withdrawal request");
    }
}

class Application {
    public static void main(String[] args) {
        Transactions transactions = new Transactions();
        transactions.startAtmProgram();
    }
}

