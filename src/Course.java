public class Course {
    private int course_credit;
    private String course_name;
    private int start_time;
    private int end_time;

    public Course(String name, int credits, int sTime, int eTime){
        course_name = name;
        course_credit = credits;
        start_time = sTime;
        end_time = eTime;
    }

    public int getCourse_credit(){
        return this.course_credit;
    }

    public String getCourse_name(){
        return this.course_name;
    }

    public int getStart_time(){
        return this.start_time;
    }

    public int getEnd_time(){
        return this.end_time;
    }
}
