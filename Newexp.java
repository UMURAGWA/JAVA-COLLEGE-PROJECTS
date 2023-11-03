public class Newexp {
    public static void main(String[] args){
    Student myStudent = new Student ("Mike", "CS", 3.2);
    
    System.out.println( myStudent.isOnHonour() );
    String name;
    String major;
    double gpa;

    public Student(String name, String major, double gpa){
        this.name=name;
        this.major=major;
        this.gpa=gpa;
    }
    public myStudent(){
    public boolean isOnHonour(){
        if(this.gpa>=3.5){
            return true;
        }
       else{
        return false;
       } 
    }
}}
    
}
