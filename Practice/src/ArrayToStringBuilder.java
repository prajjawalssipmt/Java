public class ArrayToStringBuilder {

    public static void main(String[] args) {
        String[] arr=new String[]{
                "My name is","Prajjawal Gupta","I am a", "Software Engineer"," from"," Jashpur"
        };
        StringBuilder sb=new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
