package inherit.Nested;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperation opr = new ArrayOperation(new int[]{1,3,4,7,5,9});
        ArrayOperation.Statistics stat=opr.new Statistics();
        System.out.println(stat.mean());
    }
}
