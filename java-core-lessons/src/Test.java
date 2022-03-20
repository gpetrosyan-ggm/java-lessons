import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] elements = {1, 2, 3, 4, 5};
        int size = elements.length - 1;

        int tmp;
        for (int i = 0; i < size / 2; i++) {
            tmp = elements[size - i];
            elements[size - i] = elements[i];
            elements[i] = tmp;
        }

        System.out.println(Arrays.toString(elements));
    }

}
