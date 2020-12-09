public class AsciiValue {

    public static void main(String[] args) {

        char ch = 'a';
        double ascii = ch;

        int castAscii = (int) ch;

        System.out.println("The value of " + ch + " is: " +ascii);
        System.out.println("The value of " + ch + " is: " + castAscii);

    }
}
