import java.util.Scanner;

public class CourseInformation {
    public static void main(String[] args){
        Course course1 = new Course();
        OfferedCourse course2 = new OfferedCourse();

        Scanner scnr = new Scanner(System.in);

        String course1Num = scnr.nextLine();
        String course1Title = scnr.nextLine();
        String course2Num = scnr.nextLine();
        String course2Title = scnr.nextLine();
        String course2Instructor = scnr.nextLine();
        String course2Term = scnr.nextLine();
        String course2Time = scnr.nextLine();

        course1.setCourseNumber(course1Num);
        course1.setCourseTitle(course1Title);

        course2.setCourseNumber(course2Num);
        course2.setCourseTitle(course2Title);
        course2.setInstructorName(course2Instructor);
        course2.setTerm(course2Term);
        course2.setClassTime(course2Time);

        course1.printInfo();
        course2.printInfo();

    }
}
