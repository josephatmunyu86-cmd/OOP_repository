public class studentsenrollement{
    String coursename;
    int numberofstudents;
    static int totalStudents = 0;
    IUEAEnrolment(String courseName,int numberOfStudents){
        this.courseName= courseName;
        this.numberOfStudents= numberOfStudents;
        totalStudents=totalStudents+numberOfStudents;
    }
   public void displayCourseStatistics(double passed){
        double passPercentage= (passed * numberOfStudents) / 100.0;
        System.out.println("courseName:"+ courseName);
        System.out.println("numberOfStudents:"+numberOfStudents);
        System.out.println("passPercentage:"+passPercentage);
    }
    public void CalculateAverageAttendance(int attendedStudents){
             double attendancePercentage=((double) attendedStudents/numberOfStudents)*100;
             System.out.println("Attended for" +courseName+":"+attendancePercentage+"%");
    }
    static void displayUniversityStatistics(){
        System.out.println("UNIVERSITY WIDE STATISTICS");
        System.out.println("Total Students Across All Courses:"+totalStudents);
    }
    public static void main(String[] args) {
        IUEAEnrolment course1 = new IUEAEnrolment("Bachelor of Information Technology", 120);
        IUEAEnrolment course2 = new IUEAEnrolment("Bachelor of Business Administration", 80);
        IUEAEnrolment course3 = new IUEAEnrolment("Bachelor of computer Science", 100);
        System.out.println("INDIVIDUAL COURSE STATISTICS");
        course1.displayCourseStatistics(70);
        course2.displayCourseStatistics(40);
        course3.displayCourseStatistics(50);
        System.out.println("ATTENDACE STATISTICS");
        course1.CalculateAverageAttendance(108);
        course2.CalculateAverageAttendance(70);
        course3.CalculateAverageAttendance(92);
        IUEAEnrolment.displayUniversityStatistics();
    }
}