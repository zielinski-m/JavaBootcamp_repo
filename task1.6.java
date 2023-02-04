class Obj {
}

class Application {
    public static void main(String[] args) {
        Obj obj = new Obj();
        int hash = obj.hashCode();
        System.out.println(hash);
    }
}