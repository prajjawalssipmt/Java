public class forEachLoop {
    public static void main(String[] args) {

        String[] str = new String[]{
          "Prajjawal","Tanmay","Jaya","Archana","Arun","Laddu"
        };
        printForEach(str);
    }

    public static void printForEach(String[] arr) {
        for (String name : arr){
            System.out.println(name);
        }
    }
}
