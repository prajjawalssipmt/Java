public class LearnngIf {
    public static void main(String[] args) {
       boolean isMale = true;
       String name = "Prajjawal";
       if(isMale){
        System.out.println("Mr. "+name);
       }else{
        System.out.println("Not Found");
       }

       boolean isSeniorCitizen = true;
       boolean isAnAdult = false;

       if(isSeniorCitizen){
           System.out.println("Hello Senior Citizen");
       } else if (isAnAdult) {
           System.out.println("Hello Adult");
       }else {
           System.out.println("hello children");
       }
    }
}