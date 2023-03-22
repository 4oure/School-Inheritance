import java.util.ArrayList;
/* 
cursor parking lot
[][][][]
[][][][]
[][][][]
[][][][]
[][][][]
[][][][]
[][][][]
[][][][]

math, religion, english

math: ap calculus AB, ap calculus BC, honors calculus(connoly), 

religion: H. Philosophy, H. Human Rights, Social Justice, Christian Life Choices

english: galicki (honors english 4), woosley (AP Eng lang), howe (AP English Lit)

social studies: APUSH (Demmanato), Honors USH (Siler), Honors Gov (Johnson), AP Gov (Schiede)   

*/
class Main {
  public static void main(String[] args) {
    Student Bill = new Student("male", 4.5, 18, true);
    Student Ryan = new Student("male", 4.2, 17, true);
    Student Gavin = new Student("male", 3.0, 17, true);
    Student Caden = new Student("male", 4.0, 18, false);
    Student Dan = new Student("male", 3.9, 18, false);
    Student Mathias = new Student("male", 4.3, 17, false);
    Student Kruzshak = new Student("male", 5.2, 18, true);
    Student Lauren = new Student("female", 4.4, 16, false);
    Student David = new Student("male", 4.2, 18, false);
      
    ArrayList<Student> CSAstudents = new ArrayList<>();
    ArrayList<Student> APChemStudents = new ArrayList<>();
    ArrayList<Student> APEngLitStudents = new ArrayList<>();
    ArrayList<Student> APEngLangStudents = new ArrayList<>();
    ArrayList<Student> honorsEnglishFourStudentss = new ArrayList<>();
    
    ArrayList<Student> honorsHumanRights = new ArrayList<>();
    ArrayList<Student> christianLifeChoices = new ArrayList<>();
    ArrayList<Student> honorsPhilosophyStudents = new ArrayList<>();
    ArrayList<Student> sacraments = new ArrayList<>();
    ArrayList<Student> socialJustice = new ArrayList<>();

  ArrayList<Student> APUSH = new ArrayList<>();
  ArrayList<Student> APGov = new ArrayList<>();
  ArrayList<Student> honorsGov = new ArrayList<>();
  ArrayList<Student> honorsUSH = new ArrayList<>();

    APEngLitStudents.add(Caden);

    APChemStudents.add(Bill);
    APChemStudents.add(Ryan);
    APChemStudents.add(Kruzshak);

    CSAstudents.add(Gavin);
    CSAstudents.add(Bill);
    CSAstudents.add(Ryan);
    CSAstudents.add(Caden);
    CSAstudents.add(Lauren);
    CSAstudents.add(Dan);
    CSAstudents.add(David);
    CSAstudents.add(Mathias);

    ArrayList<Student> ABStudents = new ArrayList<>();
    ABStudents.add(Bill);
    ABStudents.add(Ryan);
    ABStudents.add(Lauren);
    ABStudents.add(Mathias)
    
    
Subject computerScienceA = new Subject(CSAstudents.size(), true, false, false, "Mr. Monaghan", CSAstudents);
Subject APChem = new Subject(APChemStudents.size(), true, false, false, "Dr. Baker", APChemStudents);

Subject APCalculusAB = new Subject(ABStudents.size(), true, false,e false, "Mr. Connolly", ABStudents);

Subject APEngLit = new Subject(APEngLitStudents.size(), true, false, false, "Mrs. Howe", APEngLitStudents);


    

      ArrayList<Subject> scienceSubjects = new ArrayList<>();

    Department Science = new Department("Science", "Dr. Baker", 24, scienceSubjects, Faculty.SciTeachers);
    scienceSubjects.add(computerScienceA);
    scienceSubjects.add(APChem);

    Department Religion = new Religion("Religion, "Mr. Kimble", 10, )

    Department English = new English("English", "Mr Blair", 30, )
    
   
                                       
                                       System.out.println("Happy Leprechaun and Ginger Day");
  }
}