

/// ************Constructor************
// in ka koi return type nai huta or in ka name class ka name jasa same huna chai ha 

// > 1 => non parameterized Constructor 


// class Student {
//     String name ;
//     int age ;
//     public void writename (){
//     System.out.println(this.name);
//     System.out.println(this.age);
//     }


//   // non parameterizid constructor 
//     Student(){
//         System.out.println("constructor called");
//          name = "haseeb";
//          age = 14;
//     }
    
// }

// public class  Constructor{
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.writename();
//     }
// }



// > 2 => parameterized Constructor 
// i ma parameter pass karty hn 


// class Student {
//     String name1 ;
//     int age1 ;
//     public void writename (){
//     System.out.println(this.name1);
//     System.out.println(this.age1);
//     }


//   //  parameterizid constructor 
//     Student(String name , int age){
//        this.name1 = name ;
//        this.age1 = age ;
//     }
    
// }

// public class  Constructor{
//     public static void main(String[] args) {
//         Student s = new Student("haseeb", 34 );
//         s.writename();
//     }
// }


// >  3 => Copy Constructor
// is ma ham ak object ki information dosray object ma dalty hn 


// class Student {
//     String name1 ;
//     int age1 ;
//     public void writename (){
//     System.out.println(this.name1);
//     System.out.println(this.age1);
//     }


//   //   Copy constructor 
//     Student(Student s2){
//        this.name1 = s2.name1 ;
//        this.age1 = s2.age1 ;
//     }
//     Student(){

//     }
// }

// public class  Constructor{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name1 = "haseeb";
//         s1.age1 = 19;
//         s1.writename();

//         Student s2 =new Student(s1);



