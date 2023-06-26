public class PreviousArray{
    public static void main(String[] args) {
        int[] array = {6, 13, 11, 21, 69, 66};
        int count = 0;
        int k = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
