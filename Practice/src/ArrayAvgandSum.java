public class ArrayAvgandSum {
    public static void main(String[] args) {
        System.out.println("Welcome to array sum and avg");
        int[] myArr = ArrayUtility.inputArray();
        int len =myArr.length;
        int total= sum(myArr,len);
        System.out.println("sum of array is : "+total);
        int average = avg(myArr,len);
        System.out.println("avg of array is : "+average);

    }

    public static int sum(int[] arr,int len) {
        int sum=0;
        for (int i = 0; i < len; i++) {
                    sum+=arr[i];
        }
        return sum;
    }

    public static int avg(int[] arr,int len) {
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        return sum/len;
    }
    
}
