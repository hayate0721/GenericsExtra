import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            students.add(new Student());
        }
        //printList(students);
        printMoreList(students);

        List<LPAStudent> lpastudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            lpastudents.add(new LPAStudent());
        }
        //printList(lpastudents);
        printMoreList(lpastudents);
        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1,2,3)));

        var queryList = new QueryList<>(lpastudents);
        var matches = queryList.getMatches("Course", "Python");
        printMoreList(matches);

    }
    public static void printMoreList(List<? extends Student> students){

        for(var student : students){
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void testList(List<?> list){
        for(var e : list){
            if(e instanceof String s){
                System.out.println("String: " + s.toUpperCase());
            }else if(e instanceof Integer i){
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }
//    public static void testList(List<String> list){
//
//        for(var element : list){
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list){
//
//        for(var element : list){
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }

//    public static <T extends Student> void printList(List<T> students){
//
//        for(var student : students){
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }
}
