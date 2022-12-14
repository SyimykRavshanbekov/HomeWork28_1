import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        System.out.println(list.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Comparator.naturalOrder()));
    }
}