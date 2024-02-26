package inherit.Equals;

public class EqualAndHashcodeTest {
    public static void main(String[] args) {
        Person person1=new Person("Prajjawal",24,"001");
        Person person2=new Person("Prajjawal",24,"001");
        Person person3=new Person("Tanmay",25,"002");

        if (person1.equals(person2)){
            System.out.println("Equals");
        }else {
            System.out.println("Not Equal");
        }

        if (person2.equals(person3)){
            System.out.println("Equals");
        }else {
            System.out.println("Not Equal");
        }
    }
}
