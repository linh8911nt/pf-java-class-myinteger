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
        if (value % 2 == 0){
            return true;
        } else
            return false;
    }

    //số lẻ
    public boolean isOdd(){
        if (value % 2 != 0)
            return false;
        else
            return true;
    }

    //số nguyên tố
    public boolean isPrime(){
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
    public static boolean isEven(int value){
        if (value % 2 == 0){
            return true;
        } else
            return false;
    }

    //số lẻ
    public static boolean isOdd(int value){
        if (value % 2 != 0)
            return false;
        else
            return true;
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

}
