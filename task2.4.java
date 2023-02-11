class Wrapper {
    public static void main(String[] args) {
        char letter = 'L';
        byte num = 127;
        boolean isSaturday = true;
        Character l = "L";
        Byte b = 127;
        Boolean o = true;

        if(letter == l && num == b && isSaturday == o) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}