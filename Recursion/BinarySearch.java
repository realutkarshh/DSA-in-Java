public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,22,34,45,67,88,98,102};
        int target = 67;
        int result = binarySearch(arr, 0, arr.length-1, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return binarySearch(arr, start, mid - 1, target);
        }
        return binarySearch(arr, mid + 1, end, target);
        
    }
}
