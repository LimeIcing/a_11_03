import java.util.LinkedList;

public class Main03 {

    /*
    Write a method called removeEvenInRange that accepts three parameters: a LinkedList , a starting index, and an
    ending index. The method’s behavior is to remove all occurrences of the even numbers that appear in the list between
    the starting index (inclusive) and the ending index (exclusive). Other values and occurrences of the even numbers
    that appear outside the given index range are not affected. For example, for the list
    [ 1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16 ], a call of removeEvenInRange(list, 5, 13) should produce
    the list [ 1, 1, 2, 0, 4, 5, 3, 11, 9, 0, 14, 0, 16 ]. Notice that the even numbers located at indexes between 5
    inclusive and 13 exclusive in the original list (before any modifications were made) have been removed.
     */

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(1);
        System.out.println(a);
        removeEvenInRange(a,1,5);
        System.out.println(a);
    }

    public static void removeEvenInRange(LinkedList<Integer> list, int start, int end) {
        for (int i = end; i >= start; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
