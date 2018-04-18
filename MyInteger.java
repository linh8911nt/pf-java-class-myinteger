import java.util.Objects;

public class MyInteger {
    private int value;

    public MyInteger() {
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //số chẵn
    public boolean isEven(){
        if (this.value % 2 == 0){
            return true;
        } else
            return false;
    }

    //số lẻ
    public boolean isOdd(){
        if (this.value % 2 != 0)
            return true;
        else
            return false;
    }

    //số nguyên tố
    public boolean isPrime(){
        if (this.value < 2) {
            return false;
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(this.value)) {
                if (this.value % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                return true;
            else
                return false;
        }
    }

    //số chẵn
    public static boolean isEven(int value){
        if (value % 2 == 0){
            return true;
        } else
            return false;
    }

    //số lẻ
    public static boolean isOdd(int value){
        if (value % 2 != 0)
            return true;
        else
            return false;
    }

    //số nguyên tố
    public static boolean isPrime(int value){
        if (value < 2) {
            return false;
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(value)) {
                if (value % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                return true;
            else
                return false;
        }
    }

    //số chẵn
    public static boolean isEven(MyInteger value){
        if (value.getValue() % 2 == 0){
            return true;
        } else
            return false;
    }

    //số lẻ
    public static boolean isOdd(MyInteger value){
        if (value.getValue() % 2 != 0)
            return true;
        else
            return false;
    }

    //số nguyên tố
    public static boolean isPrime(MyInteger value){
        if (value.getValue() < 2) {
            return false;
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(value.getValue())) {
                if (value.getValue() % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                return true;
            else
                return false;
        }
    }

    public boolean equals(int value){
        if (this.getValue() == value){
            return true;
        }
        return false;
    }

    public boolean equals(MyInteger value){
        if (this.getValue() == value.getValue()){
            return true;
        }
        return false;
    }

    public static int[] parseInt(char[] listCharacters){
        int [] listNumber = new int[listCharacters.length];
        for (int i = 0; i < listCharacters.length; i++) {
            listNumber[i] = (int) listCharacters[i];
        }
        return listNumber;
    }

    public static int[] parseInt(String convertString){
        int[] number = new int[convertString.length()];
        for (int i = 0; i < convertString.length(); i++) {
            number[i] = (int) convertString.charAt(i);
        }
        return number;
    }
}
