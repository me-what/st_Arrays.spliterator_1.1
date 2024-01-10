import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

// 1
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "AAA"));
        list.add(new Student(2, "BBB"));
        list.add(new Student(3, "CCC"));
        list.add(new Student(4, "DDD"));
        list.add(new Student(5, "EEE"));
        Spliterator<Student> students = list.spliterator();
        System.out.println("list of Students:");
        students.forEachRemaining((n) -> System.out.println(n.rollno+" "+n.name));
        System.out.println();


        // 2
        int[] array1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Spliterator<Integer> s1 = Arrays.spliterator(array1);
        s1.forEachRemaining((n) -> System.out.print(n+" "));
        System.out.print("\n");

        double[] array2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Spliterator<Double> s2 = Arrays.spliterator(array2);
        s2.forEachRemaining((n) -> System.out.print(n+" "));
        System.out.print("\n");

        long[] array3 = {121, 41, 32, 14, 33, 71, 99, 32};
        Spliterator<Long> s3 = Arrays.spliterator(array3);
        s3.forEachRemaining((n) -> System.out.print(n+" "));
    }
}