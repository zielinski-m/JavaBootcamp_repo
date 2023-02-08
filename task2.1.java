class AverageArrayCounter {
    public static void main(String[] args) {
        
    int num[] = new int [20];
        num[0] = 1;
        num[1] = 12;
        num[2] = 10;
        num[3] = 6;
        num[4] = 3;
        num[5] = 4;
        num[6] = 42;
        num[7] = 2;
        num[8] = 124;
        num[9] = 65;
        num[10] = 212;
        num[11] = 11;
        num[12] = 56;
        num[13] = 76;
        num[14] = 8;
        num[15] = 5;
        num[16] = 23;
        num[17] = 96;
        num[18] = 63;
        num[19] = 4;

        // int sum = 0;
        double sum = 0;
        int arrayLenght = num.length;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            System.out.println("Array element number [" + i + "] = " + num[i]);
            System.out.println(sum);
        }

        double average = sum / arrayLenght;
        System.out.println("\n" + "The average of this array is " + average);
    }
 }