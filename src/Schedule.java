import java.util.ArrayList;

/* A schedule with a list of 24 time blocks */

public class Schedule {
    private static final int MAX_TIME_BLOCKS = 24;
    private ArrayList<TimeBlock> timeBlocks;

    // MODIFIES: this
    // EFFECTS: constructs a schedule with all given courses
    public Schedule(ArrayList<Course> courses) {
        timeBlocks = new ArrayList<>();
        initTimeBlocks();
        for (Course c : courses) {
            ArrayList<TimeBlock> courseTimeBlocks = new ArrayList<>();
            int courseStartTime = c.getStart_time();
            int courseEndTime = c.getEnd_time();
            String courseName = c.getCourse_name();
            convertToTimeBlocks(courseTimeBlocks, courseStartTime, courseEndTime, courseName);
            addCourses(courseTimeBlocks);
        }
    }

    // EFFECTS: returns all time blocks
    public ArrayList<TimeBlock> getTimeBlocks() {
        return timeBlocks;
    }

    // helper method for constructor
    // EFFECTS: creates new 1h time blocks for each hour a course takes
    private void convertToTimeBlocks(ArrayList<TimeBlock> courseTimeBlocks,
                                     int courseStartTime,
                                     int courseEndTime,
                                     String courseName) {
        for (int i = courseStartTime; i < courseEndTime; i++) {
            TimeBlock courseTimeBlock = new TimeBlock(courseName, i, i + 1);
            courseTimeBlocks.add(courseTimeBlock);
        }
    }

    // helper method for constructor
    // MODIFIES: this
    // EFFECTS: replaces time blocks in schedule with course time blocks
    private void addCourses(ArrayList<TimeBlock> courseTimeBlocks) {
        for (TimeBlock tb : timeBlocks) {
            for (TimeBlock cb : courseTimeBlocks) {
                if (tb.equals(cb)) {
                    int index = timeBlocks.indexOf(tb);
                    timeBlocks.set(index, cb);
                }
            }
        }
    }

    // helper method for constructor
    // EFFECTS: fills schedule with 24 1h time blocks
    private void initTimeBlocks() {
        for (int i = 0; i < MAX_TIME_BLOCKS; i++) {
                timeBlocks.add(new TimeBlock(i, i + 1));
        }
    }

    //fills schedule with study blocks
    private void studyBlocks(ArrayList<Course> courses){
        //1-2 credits = 1hr
        // 3-4 credits = 2hr
        //5-6 credits = 3hr

        Schedule studysched = new Schedule(courses);

        for (Course c0rse : courses ) {
                int credits = c0rse.getCourse_credit();
                int hours=0;
                int iterate = 0;
                if(credits < 2){
                    hours =1;
                    for(int i = 0; i<hours;i++) {
                        for (TimeBlock tb : timeBlocks) {
                            if (tb.getName() == "break") {
                                tb.setName("study");
                            }
                        }
                    }
                }
                if(credits > 2 && credits <= 4){
                    hours = 2;
                    for(int i = 0; i<hours;i++) {
                        for (TimeBlock tb : timeBlocks) {
                            if (tb.getName() == "break") {
                                tb.setName("study");
                            }
                        }
                    }
                }
                if(credits >4 && credits <=6 ){
                    hours = 3;  for(int i = 0; i<hours;i++) {
                        for (TimeBlock tb : timeBlocks) {
                            if (tb.getName() == "break") {
                                tb.setName("study");
                            }
                        }
                    }
                }



        }


        }






    }



