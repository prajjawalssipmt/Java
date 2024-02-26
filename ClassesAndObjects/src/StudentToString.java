public class StudentToString {
   String name ;
   int age;
   String rollNo;
   String house;

    public StudentToString(String name, int age, String rollNo, String house) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details -> name : "+name
                +" , age : "+age
                +" , rollNumber : "+rollNo
                +" , house : "+house;
    }

    public static void main(String[] args) {
        StudentToString stud =new StudentToString("Prajjawal Gupta",
                24,
                "303303319035",
                "Shivaji");
        System.out.println(stud );
    }
}
