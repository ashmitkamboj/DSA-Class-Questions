import java.util.HashMap;

public class pairDifference {
    public static void main(String[] args) {
        int [] arr={5,20,3,2,5,80};
        int target=78;
        System.out.println(pairDiff(arr,target));
    }
    private static boolean pairDiff(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        int comp = arr[i] - target;
        if (map.containsKey(comp)) {
            return true;
        }
        map.put(arr[i], i);
    }
    return false;
}
}
