import java.util.ArrayList;


class TwoDim{
    // 2D Array -- Multidimensional
    void twoDim(){
        ArrayList<ArrayList<Integer>> dim2 = new ArrayList<>();

        int dig = 1;
        for(int i = 0; i < 3; i++){
            dim2.add(new ArrayList<>());

            for(int j = 0; j < 3; j++){
                dim2.get(i).add(dig);
                dig++;
            }
        }

        for(ArrayList<Integer> rows : dim2){
            for(Integer col : rows){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}

class ThreeDim{
    void threeDim(){
        ArrayList<ArrayList<ArrayList<Integer>>> dim3 = new ArrayList<>();
        int d = 1;

        for(int i = 0; i < 4; i++){                          // This loop is creating blocks for the 3D array.
            dim3.add(new ArrayList<>());

            for(int j = 0; j < 2; j++){                     // This loop is creating rows in the Blocks.
                dim3.get(i).add(new ArrayList<>());

                for(int k = 0; k < 4; k++){                 // This loop is creating columns in the Rows.
                    dim3.get(i).get(j).add(d);
                    d++;
                }
            }
        }

        // Printing the 3D array .

        for(ArrayList<ArrayList<Integer>> rows : dim3){
            for(ArrayList<Integer> col : rows){
                for(Integer el : col){
                    System.out.print(el + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}

class array{
    void Aray(){
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[5];
        arr[2] = new int[1];

        int digit = 1;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = digit;
                digit ++;
            }
        }

        for(int[] el : arr){
            for(int e1 : el){
                System.out.print(e1 + " ");
            }
            System.out.println();
        }
    }
}



public class Try {
    public static void main(String[] args) {
        TwoDim d2 = new TwoDim();
//        d2.twoDim();

        ThreeDim d3 = new ThreeDim();
//        d3.threeDim();

        array a1 = new array();
        a1.Aray();

    }


}


