class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,5,4,9,8,7,10};
        int target = 5;
        int ans = Linearsearch(arr, target);
        System.out.println(ans);
    }

    static int Linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print("IN Index no ");
                return i;
            }
        }
        return -1;
    }
}