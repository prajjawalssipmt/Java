public class StringconcatusingStringformat {
    public static void main(String[] args) {
        String fname = "prajjawal";
        String lname= "gupta";
        System.out.printf("%S %S",fname,lname);
        String fullname = fname.concat(" ").concat(lname);
        System.out.println("\n"+fullname.toUpperCase());

    }
}
