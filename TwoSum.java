import java.util.Scanner;
public class TwoSum {
public static int[] twoSum(int []nums, int target, int len){
    for (int i =0; i<len-1; i++){
        for(int j = i+1; j<len; j++){
            if( nums[i] + nums[j] == target ){
                return new int[] {i,j};
            }
        }
        }
        throw new IllegalArgumentException("No two numbers add up to the target sum.");
    }

public static void main(String []a){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of the array : ");
    int length = input.nextInt();
    int[] nums = new int[length];
    System.out.println("Enter the Elements: ");
    for(int i =0 ; i< nums.length; i++){
        nums[i] = input.nextInt();
    }
    System.out.println("Enter the target Element :");
    int target = input.nextInt();
    int []result = twoSum(nums, target, length);
    System.out.println("The target"+ target+" is found at the indexes "+result[0]+"and"+result[1]);
}
}
