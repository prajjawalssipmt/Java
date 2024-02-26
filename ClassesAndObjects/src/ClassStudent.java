
class  Student{
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    Student(Student s2){
        this.name= s2.name;
        this.age= s2.age;
    }

    public void printInfo(){
        System.out.print(this.name+"  ");
        System.out.println(this.age);
    }
}
public class ClassStudent {
    public static void main(String[] args) {
        Student s1=new Student("Prajjawal",24);
//        s1.name="Prajjawal";
//        s1.age=23;
        s1.printInfo();
        System.out.println();
        Student s2=new Student(s1);
        s2.printInfo();
    }

}
