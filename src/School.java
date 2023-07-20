import java.util.Arrays;

public class School {
    private String nameOfClass;
    private Student[] students;

    public School(String nameOfClass, Student[] students) {
        this.nameOfClass = nameOfClass;
        this.students = students;
    }

    public School() {
    }

    public void getStudents(Student[] students) {
        //  System.out.println(Arrays.toString(students));
        for (Student student : students) {
            System.out.println(student);

        }


    }

    public void getAllBoys(Student[] students) {
        for (Student student : students) {
            if (student.getGender().equals("male")) {
                System.out.println(student);
            }
        }
    }

    public void getByName(String name, Student[] students) {
        for (Student student : students) {
            if (name.equals(student.getName())) {
                System.out.println(student);
            }
        }
    }


    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "nameOfClass='" + nameOfClass + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
