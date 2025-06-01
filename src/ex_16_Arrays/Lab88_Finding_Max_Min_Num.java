package ex_16_Arrays;

public class Lab88_Finding_Max_Min_Num {
    public static void main(String[] args) {

        //Finding Maximum value:
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];

        // logic
        for(int i=0;i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        System.out.println("Max is, " + max);

        //Finding Minimum value:
        int min = array[0];

        for(int i=0;i< array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Min is, " + min);
    }
}
