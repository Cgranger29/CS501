public class OfferedCourse extends Course{
    private String instructorName;
    private String term;
    private String classTime;

    public String getInstructorName(){
        return instructorName;

    }

    public String getTerm(){
        return term;
        
    }

    public String getClassTime(){
        return classTime;
    }

    public void setInstructorName(String name){
        instructorName = name;

    }
    public void setTerm(String termName){
        term = termName;
        
    }
    public void setClassTime(String time){
        classTime = time;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("   Instructor Name: " + instructorName);
        System.out.println("   Term: " + term);
        System.out.println("   Class Time: " + classTime);

    }
}
