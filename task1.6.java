class Obj {
}

class Application {
    public static void main(String[] args) {
        Obj obj = new Obj();
        int hash = obj.hashCode();
        System.out.println(hash);
    }
}



// Zadanie z *

class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        }
    }
