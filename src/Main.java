import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studets = new ArrayList<>();
        studets.add(new Student("Madina", 16, 1500,"daughter"));
        studets.add(new Student("Aigerim", 17,1000 ,"daughter"));
        studets.add(new Student("Kanyki", 14 ,2000,"daughter"));
        studets.add(new Student("Arzuu", 12, 2500,"daughter"));
        studets.add(new Student("Ulan", 30, 3000,"boy"));
        studets.add(new Student("Datka",21,500,"daughter"));
        studets.add(new Student("Aiibek",22,4000,"boy"));
        studets.add(new Student("MAksat",25,1200,"daughter"));
        studets.add(new Student("MAlik",19,3100,"boy"));
        studets.add(new Student("Syimyk",23,2100,"boy"));

        Student student = new Student();
        student.getName(studets);
        System.out.println("-------------------------------");
        student.getAges(studets);
        System.out.println("---------------------------------");
        student.summa1000(studets);
        System.out.println("-------------------------------------");
        student.filterMaxMoneyGirl(studets);
        System.out.println("----------------------------------------");
        student.getStudet(studets);
        System.out.println("--------------------------------------------");
        student.filter(studets);
        System.out.println("----------------------------------------------");
        student.getAges(studets);
        System.out.println("-----------------------------------------------");
        student.maxMoneyStudent(studets);
    }
}