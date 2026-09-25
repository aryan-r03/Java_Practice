import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc1.nextInt();
        }
        sc1.close();


        int min = Integer.MAX_VALUE;

        int  idx = 0;
        int i = 0;
        check:
        for(int num : nums){
            if(num < min) {
                min = num;
                idx = i;
            }
            i++;

        }
        System.out.println("The smallest element is : " + min + " at index " + idx);
    }
}

// Testing automatic GitHub push