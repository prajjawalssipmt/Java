 class Course {
    static int maxCapacity=100;
    String courseName;
    int enrollment;
    String[] enrollStudents ;

    Course(String courseName){
        this.courseName= courseName;
        this.enrollment=0;
       this.enrollStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity =maxCapacity;
    }

    void enrollStudent(String studentName){
        enrollStudents[enrollment]=studentName;
        enrollment++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student Removed");
        enrollment++;
    }

     public static void main(String[] args) {
        Course dsa = new Course("Class");

     }

}
