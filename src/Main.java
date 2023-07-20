

public class Main {
    public static void main(String[] args) {

        Student student =new Student("Nurjigit","Umarov",22,"male");
        Student student1 =new Student("Begimai","Bagimai",16,"female");
        Student student2 =new Student("Akmaral","Ryskulova",21,"female");
        Student student3 =new Student("Bekbolsun","Bekmurza Uulu",25,"male");
        Student student4 =new Student("Nurtegin","Sagynaliev",15,"male");
         Student []students ={student,student4,student1,student2,student3};
         School school= new School("Peaksoft",students);
        System.out.println(school);
        System.out.println( "==========================");
        System.out.println("get all students:");
        school.getStudents(students);
        System.out.println("get all boys: ");
        school.getAllBoys(students);
        System.out.println( "get by name :");
        school.getByName("Nurjigit",students);


    }}