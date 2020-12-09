public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.25f, second = 2.45f;

        System.out.println("--Before Swap--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);

        float temporary = first;
        first = second;
        second = temporary;

        System.out.println("--After Swap--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);
    }
}
