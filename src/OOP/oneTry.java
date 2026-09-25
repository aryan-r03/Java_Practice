package OOP;
import java.util.ArrayList;

public class oneTry {
    public static void main(String[] args) {

        ArrayList<ArrayList<ArrayList<Integer>>> dim2 = new ArrayList<>();

        int digit = 1;

        for(int i = 0; i < 3; i++){
            dim2.add(new ArrayList<>());

            for(int j = 0; j < 3; j++) {
                dim2.get(i).add(new ArrayList<>());

                for (int k = 0; k < 3; k++) {
                    dim2.get(i).get(j).add(digit);
                    digit++;

                    if(digit >= 10){
                        digit = 1;
                    }
                }
            }
        }

        for(ArrayList<ArrayList<Integer>> row : dim2){
            for(ArrayList<Integer> col : row){
                for(Integer el : col){
                    System.out.print(el + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
