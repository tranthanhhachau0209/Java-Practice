public class Ex2 {
    public static int findSecondLargest(int[] arr) {

        // Nếu mảng có ít hơn 2 phần tử
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Duyệt từng phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {

            // Nếu phần tử hiện tại lớn hơn max
            if (arr[i] > max) {

                secondMax = max;
                max = arr[i];

            }

            // Nếu nhỏ hơn max nhưng lớn hơn secondMax
            else if (arr[i] > secondMax && arr[i] != max) {

                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main2(String[] args) {

        int[] arr1 = {1, 3, 4, 5, 0, 2};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {3};

        System.out.println(findSecondLargest(arr1));
        System.out.println(findSecondLargest(arr2));
        System.out.println(findSecondLargest(arr3));
    }
}
