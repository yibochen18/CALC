/* a time block with a start and end time and name */

public class TimeBlock {
    private int startTime;
    private int endTime;
    private String name;

    // EFFECTS: constructs a time block with start and end time
    public TimeBlock(int start, int end) {
        startTime = start;
        endTime = end;
        name = "break";
    }

    public TimeBlock(int length,int start, int end ){
        startTime = start;
        endTime = start + length;
    }

    // EFFECTS: constructs a time block with start and end time and name
    public TimeBlock(String name, int start, int end) {
        startTime = start;
        endTime = end;
        this.name = name;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getName() {
        return name;
    }

     public void setStartTime(int start){
        startTime = start;
     }

     public void setEndTime(int end){
         endTime = end;
     }

     public void setName(String name){
        this.name = name;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeBlock timeBlock = (TimeBlock) o;

        if (startTime != timeBlock.startTime) return false;
        return endTime == timeBlock.endTime;
    }

    @Override
    public int hashCode() {
        int result = startTime;
        result = 31 * result + endTime;
        return result;
    }
}
