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
  public String printClassRoster(ArrayList<String> list) {
    return "Class roster: " + list;
    
  }
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

  ArrayList<Student> APUSHStudents = new ArrayList<>();
  
  APUSHStudents.add(Bill);
  APUSHStudents.add(Ryan);
  APUSHStudents.add(Caden);
  APUSHStudents.add(Dan);
  
  ArrayList<Student> APGovStudents = new ArrayList<>();
  
  APGovStudents.add(Gavin);
  APGovStudents.add(David);  
  
  ArrayList<Student> honorsGovStudents = new ArrayList<>();
  
  honorsGovStudents.add(Ryan);
  honorsGovStudents.add(Lauren);
  honorsGovStudents.add(Dan);
  
  ArrayList<Student> honorsUSHStudents = new ArrayList<>();
  
  honorsUSHStudents.add(Mathias);
  honorsUSHStudents.add(Gavin);
    
    
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
    ABStudents.add(Mathias);

  ArrayList<Student> BCStudents = new ArrayList<>();
  BCStudents.add(Caden);
  BCStudents.add(Dan);
  BCStudents.add(Kruzshak);

	// faculty = int id, String name, int yearsExp, Department department, String degree, boolean depHead
    Faculty VonLange = new Faculty(10, "Mrs. Von Lange", Math, 15, "master", false);
    Faculty Johnson = new Faculty(20, "Mr. Johnson", 30, SocialStudies, "master", true);
    Faculty Blair = new Faculty(50, "Mr. Blair", 22, English, "master", true); //balls
    Faculty Kimble = new Faculty(15, "Mr. Kimble", 7, Religion, "master", true);
    Faculty Orndorff = new Faculty(3939102, "Mr. Orndorff", 0, Math, "bachelor", false);
		Faculty Torres = new Faculty(2919309, "Mr. Torres", 21, Math, "bachelor", true);
		Faculty Galicki = new Faculty(218394, "Mrs. Galicki", 7, English, "bachelor", false);

    Faculty Baker = new Faculty (90852, "Dr. Baker", 30, Science, "doctorate", true);

    Faculty Howe = new Faculty(76, "Mrs. Howe", 18, English, "bachelor", true);
		
    Faculty Monaghan = new Faculty(203958, "Mr. Monaghan", 22, Science, "master", false);

    Faculty Demmannato = new Faculty(723905, "Mrs. Demmannato", 4, SocialStudies, "master", false);
      
    Faculty Scheide = new Faculty();
    
    Faculty Fendryk = new Faculty();
    
    Faculty Siler = new Faculty();
    
    
Subject computerScienceA = new Subject(CSAstudents.size(), true, false, false, Monaghan, CSAstudents);
    
Subject APChem = new Subject(APChemStudents.size(), true, false, false, Baker, APChemStudents);

Subject APCalculusAB = new Subject(ABStudents.size(), true, false, false, Connolly, ABStudents);

Subject APEngLit = new Subject(APEngLitStudents.size(), true, false, false, Howe, APEngLitStudents);

Subject APCalculusBC = new Subject(BCStudents.size(), true, false, false, VonLange, BCStudents);

Subject APUSH = new Subject(APUSHStudents.size(), true, false, false, Demannato, APUSHStudents);

Subject APGov = new Subject(APGovStudents.size(), true, false, false, Scheide, APGovStudents);

Subject honorsGov = new Subject(honorsGovStudents)

   ArrayList<Subject> SSSubjects = new ArrayList<>();
    SSSubjects.add(APUSH);
    SSSubjects.add(APGov);
    SSSubjects.add(honorsGov);
    SSSubjects.add(honorsUSH);

      ArrayList<Subject> scienceSubjects = new ArrayList<>();

    Department Science = new Department("Science", Baker, 2, scienceSubjects, Faculty.SciTeachers);
    scienceSubjects.add(computerScienceA);
    scienceSubjects.add(APChem);

    Department Religion = new Department("Religion", Kimble, 2, religionSubjects, Faculty.RelTeachers);

    Department Math = new Department("Math", Torres, mathSubjects, Faculty.MathTeachers);

    Department English = new Department("English", Blair, 3, englishSubjects, Faculty.EngTeachers);

    Department SocialStudies = new Department("Social Studies", Johnson, 5, SSSubjects, Faculty.SSTeachers);


    calculateSalary("staff", "bachelor", true, 3);
    
    System.out.println("Happy Leprechaun and Ginger Day");
    }
  }