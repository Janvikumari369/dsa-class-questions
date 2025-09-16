class MissingElementFinder{

    public static int findMissing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return arr[i] + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int missing = findMissing(arr);
        System.out.println("Missing element: " + missing);
    }
}