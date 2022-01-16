import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){ //user input section
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of courses you have: ");
        int num_course = sc.nextInt();
        ArrayList<Course> courses = new ArrayList<Course>();

        for(int i=0; i<num_course; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Course name: ");
            String name = input.nextLine();
            System.out.println("How many credits is the course: ");
            int credits = input.nextInt();
            System.out.println("Start time (round up to the nearest hour on 24 hour clock): ");
            int start = input.nextInt();
            System.out.println("End time (round up to the nearest hour on 24 hour clock): ");
            int end = input.nextInt();
            Course newCourse = new Course(name,credits,start,end);
            courses.add(newCourse);
        }
     Schedule shced =  new Schedule(courses);
        shced.studyBlocks(courses);
        ArrayList<TimeBlock> shced2 = shced.getTimeBlocks();
        for(TimeBlock tb : shced2){
            System.out.println(tb.getStartTime());
            System.out.println(tb.getEndTime());
            System.out.println(tb.getName());
        }


    }
}

