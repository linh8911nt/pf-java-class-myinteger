import java.util.Scanner;

public class MyIntegerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value: ");
        int value = input.nextInt();

        displayNonParameter(value);

        displayHasParameter(value);

        MyInteger number = new MyInteger(value);
        displayParameterIsObject(number);

        displayCompareParamaterInt(value);

        displayCompareParameterObject(value);

        displayParseInt();

        displayParseIntString();
    }

    public static void displayNonParameter(int value){
        MyInteger myInterger1 = new MyInteger(value);

        System.out.println("display method non parameter");
        System.out.println("number is event " + myInterger1.isEven());
        System.out.println("number is odd " + myInterger1.isOdd());
        System.out.println("number is prime " + myInterger1.isPrime());
    }

    public static void displayHasParameter(int value){
        System.out.println("display method has parameter");
        System.out.println("number is event " + MyInteger.isEven(value));
        System.out.println("number is odd " + MyInteger.isOdd(value));
        System.out.println("number is prime " + MyInteger.isPrime(value));
    }

    public static void displayParameterIsObject(MyInteger number){
        System.out.println("display method has parameter is object");
        System.out.println("number is event " + MyInteger.isEven(number));
        System.out.println("number is odd " + MyInteger.isOdd(number));
        System.out.println("number is prime " + MyInteger.isPrime(number));
    }

    public static void displayCompareParamaterInt(int value){
        MyInteger compareNumber = new MyInteger(5);

        System.out.println("display method compare has parameter int");
        System.out.println("is value equals number " + compareNumber.equals(value));
    }

    public static void displayCompareParameterObject(int value){
        MyInteger numberObject = new MyInteger();
        numberObject.setValue(8);
        MyInteger compareNumber = new MyInteger(value);
        System.out.println("display method compare has parameter object");
        System.out.println("is value equals number " + compareNumber.equals(numberObject));
    }

    public static void displayParseInt(){
        char[] listCharacter = {1, 'a', 7, 9};
        System.out.println("display method parseInt has parameter char[] ");
        System.out.println("List number ");
        for (int i = 0; i < listCharacter.length; i++) {
            System.out.print(MyInteger.parseInt(listCharacter)[i] + " ");
        }
    }

    public static void displayParseIntString(){
        String convertString = "name";
        System.out.println("\ndisplay method parseInt has parameter string");
        for (int i = 0; i < convertString.length(); i++) {
            System.out.print(MyInteger.parseInt(convertString)[i] + " ");
        }
    }
}
