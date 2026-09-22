public class studentsenrollement {
    String coursename;
    int numberofstudents;
    static int totalStudents = 0;
    studentsenrollement(String coursename,int numberofstudents){
        this.coursename= coursename;
        this.numberofstudents= numberofstudents;
        totalStudents=totalStudents+numberofstudents;
    }
    public void displayCourseStatistics(double passed){
        double passPercentage= (passed * numberofstudents) / 100.0;
        System.out.println("courseName:"+ coursename);
        System.out.println("numberOfStudents:"+numberofstudents);
        System.out.println("passPercentage:"+passPercentage);
    }
    public void CalculateAverageAttendance(int attendedStudents){
        double attendancePercentage=((double) attendedStudents/numberofstudents)*100;
        System.out.println("Attended for" +coursename+":"+attendancePercentage+"%");
    }
    static void displayUniversityStatistics(){
        System.out.println("UNIVERSITY WIDE STATISTICS");
        System.out.println("Total Students Across All Courses:"+totalStudents);
    }
    public static void main(String[] args) {
        studentsenrollement course1 = new studentsenrollement("Bachelor of Information Technology", 120);
        studentsenrollement course2 = new studentsenrollement("Bachelor of Business Administration", 80);
        studentsenrollement course3 = new studentsenrollement("Bachelor of computer Science", 100);
        System.out.println("INDIVIDUAL COURSE STATISTICS");
        course1.displayCourseStatistics(70);
        course2.displayCourseStatistics(40);
        course3.displayCourseStatistics(50);
        System.out.println("ATTENDACE STATISTICS");
        course1.CalculateAverageAttendance(108);
        course2.CalculateAverageAttendance(70);
        course3.CalculateAverageAttendance(92);
        studentsenrollement.displayUniversityStatistics();
    }
}
