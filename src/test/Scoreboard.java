//
//package test;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//
//class Student{
//    String name;
//    
//    public Student(String name){
//        this.name = name;
//    }
//    
// 	public boolean equals(Student e){
//		return (this.name == e.name);
//	}
//	
//	public String toString(){
//		return "Uczeń: " + name;
//	}   
//}
//
//class Grades {
//    int gradeEnglish;
//    int gradePolish;
//    int gradeMath;
//    
//    int sum = gradeEnglish + gradePolish + gradeMath;
//    int average = sum/3; 
//    
//    public Grades(int gradeEnglish, int gradePolish, int gradeMath) {
//        this.gradeEnglish = gradeEnglish;
//        this.gradeMath = gradeMath;
//        this.gradePolish = gradePolish;
//    }
//    
//       
//    
//    public String toString(){
//        return "Średnia wynosi: " + average;
//    }
//}
//
//class Scoreboard {
//    
//   public static void main (String[] args){
//       
//        Student student1 = new Student("ABC1");
//        Student student2 = new Student("ABC2");
//        Student student3 = new Student("ABC3");
//        
//        Grades grades1 = new Grades(2,3,6);
//        Grades grades2 = new Grades(1,5,2);
//        Grades grades3 = new Grades(4,3,5);
//        
//        HashMap<Student, Grades> scoreboard = new HashMap<Student, Grades>();
//        
//        scoreboard.put(student1, grades1);
//        scoreboard.put(student2, grades2);
//        scoreboard.put(student3, grades3);
// 
//        for(Map.Entry<Student, Grades> entry : scoreboard.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//   }
//}