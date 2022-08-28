package dayTwo.two;


public class Array2Sum {
    public static void functionOne(){

        Integer[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        Integer sum=0;

        for (Integer i=0;i< arr.length;i++){
            for(Integer j=0;j<arr[i].length;j++){

                sum+=arr[i][j];
            }

        }

        System.out.println("数组总和:"+sum);

    }


}
