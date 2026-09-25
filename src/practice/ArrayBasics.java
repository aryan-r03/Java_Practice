import java.util.ArrayList;

public class ArrayBasics {
    public static void main(String[] args) {

        // // // Dynamic Array

        /*ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            nums.add(i * 2);
        }

        System.out.println("The size of the array is : " + nums.size());
        for(int num: nums){
            System.out.println(num);
        }

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) == 12){
                System.out.println(" 12 is found in the array !! " + i);
            };
        }*/





        // // // 2D - Array

        /*int[][] nums = new int[3][3];

        int digit = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = digit;
                digit++;
            }
        }

        for(int[] row : nums){
            for(int col : row){
                System.out.print(col+ " ");
            }
            System.out.println();
        }*/






        // // // 3D - Array

        /*int[][][] num3 = new int[3][3][4];

        int dig = 1;
        for(int i = 0; i < num3.length; i++){
            for(int j = 0; j < num3[i].length; j++){
                for(int k = 0; k < num3[j].length; k++){
                    num3[i][j][k] = dig;
                    dig++;
                }
            }
        }


        for(int[][] block : num3){
            for(int[] row : block){
                for(int col : row){
                    System.out.print(col + " ");
                }
                System.out.println();
            }
            System.out.println();
        }*/







        // // // 2D - Array (Multidimensional)

        /*ArrayList<ArrayList<Integer>> dim2 = new ArrayList<>();

        int d = 0;

        for(int i = 0; i < 3; i++){
            // Creating Rows
            dim2.add(new ArrayList<>());

            for(int j = 0; j < 4; j++) {
                dim2.get(i).add(d);
                d++;
            }
        }

        for(ArrayList<Integer> row : dim2){
            for(Integer col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }*/





        // // // 3D -- Array (Multidimensional)

        /*ArrayList<ArrayList<ArrayList<Integer>>> dim3 = new ArrayList<>();

        int el = 0;

        for(int i = 0; i < 2; i++){
            dim3.add(new ArrayList<>());

            for(int j = 0; j < 3; j++) {
                dim3.get(i).add(new ArrayList<>());

                for(int k = 0; k < 4; k++){
                    dim3.get(i).get(j).add(el);
                    el++;
                }
            }
        }


        for(ArrayList<ArrayList<Integer>> block : dim3){
            for(ArrayList<Integer> row : block){
                for(Integer col :  row){
                    System.out.print(col + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }*/


        int[] arr = {2, 5, 8, 9};
        int n = arr.length;

        System.out.println(n);


    }
}
