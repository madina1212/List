import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {
    private String nem;
    private int age;
    private int summasy;
    private String gender;

    public Student(String nem, int age, int summasy, String gender) {
        this.nem = nem;
        this.age = age;
        this.summasy = summasy;
        this.gender = gender;
    }

    public Student() {

    }

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSummasy() {
        return summasy;
    }

    public void setSummasy(int summasy) {
        this.summasy = summasy;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nem='" + nem + '\'' +
                ", age=" + age +
                ", summasy=" + summasy +
                ", gender='" + gender + '\'' +
                '}';
    }
    public void getStudet(List<Student> studets) {
        for (Student s : studets) {
            System.out.println(s);
        }
    }
    public void getName (List<Student>students) {
        ArrayList<Student> A = new ArrayList<>();
        ArrayList<Student> M = new ArrayList<>();
        for (Student student : students) {
            if (student.getNem().startsWith("A")||student.getNem().startsWith("M")){
                A.add(student);
            }else {
                M.add(student);
            }
        }
        A.forEach(System.out::println);
        System.out.println("------------------------");
        M.forEach(System.out::println);
    }

    public void filter(List<Student> studets) {
        ArrayList<Student> daughter = new ArrayList<>();
        ArrayList<Student> boy = new ArrayList<>();
        for (Student studet : studets) {
            if (studet.getGender().equals("daughter")) {
                daughter.add(studet);
            } else {
                boy.add(studet);
            }
        }
        daughter.forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        boy.forEach(System.out::println);
    }
    public void getAges(List<Student>studets) {
        ArrayList<Student> age = new ArrayList<>();
        ArrayList<Student> Age = new ArrayList<>();
        ArrayList<Student> Ages = new ArrayList<>();
        for (Student studet:studets) {
            if (studet.getAge()>15 || studet.getSummasy()>2000){
                age.add(studet);
            }else {
                Age.add(studet);
            }
        }
        age.forEach(System.out::println);
        System.out.println("--------------------------------");
        Age.forEach(System.out::println);
    }
    public void maxMoneyStudent(List<Student> students) {
        for (Student s : students) {
            int a = Math.max(s.getSummasy(), 0);
            if (a == s.getSummasy()) {
                System.out.println(s);
            }
        }
    }
    public void filterMaxMoneyGirl(List<Student>students ) {
        for (Student student: students) {
            System.out.println(student.getNem());
        }
  }
  public void summa1000(List<Student>students){
      for (Student student:students) {
          System.out.println(student.getSummasy()+1000);
      }
  }
}