class Wrapper {
    public static void main(String[] args) {
        char letter = 'L';
        byte num = 127;
        boolean isSaturday = true;
        Character l = letter;
        Byte b = num;
        Boolean o = isSaturday;

        if(letter == l && num == b && isSaturday == o) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}