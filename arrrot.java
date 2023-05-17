// import java.util.*;
// class main{
//     public static void main(String args[]){
//         int arr[]={8,11,12,15,18,2,5,6};
//         System.out.println("The array is rotated "+ arrrot(arr) + " times");
//     }

//     public static int arrrot(int arr[]){
//         int low = 0;
//         int high=arr.length-1;
//         while(low<=high){
//             if(arr[low]<=arr[high]){
//                 return low;
//             }
//             int mid = (low +high) /2;
//             int next = (mid+1)% arr.length;
//             int pre = (mid+arr.length-1)%arr.length;
//             if(arr[mid]<=arr[next]&&arr[mid]<=arr[pre]){
//                 return mid;
//             }
//             else if(arr[mid]<=arr[high]){
//                 high = mid-1;
//             }
//             else if(arr[mid]>=arr[low]){
//                 low = mid+1;
//             }
//         }
//         return -1;
//     }
// }
import java.util.*;
class arrrot{
    public static void main(String args[]){
        int a=0;
        int d=0;
        String b="Welcome123";
        for(int i=0;i<b.length();i++){
        char c = b.charAt(i);
if((c>='a' && c<='z')||(c>='A' && c<='Z')){
if(c == 'a'|| c == 'e'|| c == 'i' || c == 'o' || c == 'u'){
            a++;
          }
          else{
            d++;
          }
}
        }
        System.out.println(a);
        System.out.println(d);
    }
}


// class Main
// {
//     // Function to find the total number of times the array is rotated
//     public static int findRotationCount(int[] nums)
//     {
//         // search space is nums[left…right]
//         int left = 0;
//         int right = nums.length - 1;
 
//         // loop till the search space is exhausted
//         while (left <= right)
//         {
//             // if the search space is already sorted, we have
//             // found the minimum element (at index `left`)
//             if (nums[left] <= nums[right]) {
//                 return left;
//             }
 
//             int mid = (left + right) / 2;
 
//             // find the next and previous element of the `mid` element
//             // (in a circular manner)
//             int next = (mid + 1) % nums.length;
//             int prev = (mid - 1 + nums.length) % nums.length;
 
//             // if the `mid` element is less than both its next and previous
//             // neighbor, it is the array's minimum element
 
//             if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
//                 return mid;
//             }
 
//             // if nums[mid…right] is sorted, and `mid` is not the minimum element,
//             // then the pivot element cannot be present in nums[mid…right],
//             // discard nums[mid…right] and search in the left half
 
//             else if (nums[mid] <= nums[right]) {
//                 right = mid - 1;
//             }
 
//             // if nums[left…mid] is sorted, then the pivot element cannot be present
//             // in it; discard nums[left…mid] and search in the right half
 
//             else if (nums[mid] >= nums[left]) {
//                 left = mid + 1;
//             }
//         }
 
//         // invalid input
//         return -1;
//     }
 
//     public static void main(String[] args)
//     {
//         int[] nums = { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 };
 
//         System.out.println("Array is rotated " + findRotationCount(nums) + " times");
//     }
// }