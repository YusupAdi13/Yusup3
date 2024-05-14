public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
    
    for (int num : arr1) {
      sum += num;
    }
    
    for (int num : arr2) {
      sum += num;
    }
    
    return sum;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6};
    int result = arrayPlusArray(arr1, arr2);
    System.out.println(result);
  }    
}
