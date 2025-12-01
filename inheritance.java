
// Inheitance 
// ak generation se dosri generation cheezo ko inherit kaena 
// jab ak class ki property ko jab dosri class la lay laa..
// adavantage => reuseability bar jati ha bar bar hammy same code nai likh na parta 
  ///****************Type*****************
   

  /// single Level inheritance
  /// > upper base class ==> nichay Derived class huti ha..

// class Animals {
//  public void eat(){
//      System.out.println("Eating meat");
//  }
// }

//  class Dog extends Animals{
//     String name ;

//  }
    

// public class inheritance {
// public static void main(String[] args) {
//     Dog obj = new Dog();
//     obj.name = "musiii";
//     obj.eat();
//      System.out.println(obj.name);
// }
    
// }




// Multi level Inheritance 

/// > upper base class ==> nichay Derived ==> phir nichay Derived class
// parent class child class ki chezain access nai kar sakti but Child class parent ki cheezain access kae sakti hn...
// class Animals {
//  public void eat(){
//      System.out.println("Eating meat");
//  }
// }

//  class Dog extends Animals{
//     public void nature(){
//         System.out.println("bhao bhao");
//     } 

//  }
    
//  class babies extends Dog{
//     public void color (){
//         System.out.println("black");
//     }
//  }

// public class inheritance {
// public static void main(String[] args) {
//  babies obj = new babies();
//  obj.nature();
// obj.color();
// obj.eat();

// }
    
// }



/// Hierarchial level Inheritance
/// one base class and multiple subclass / drived class..

class Animals {
 public void eat(){
     System.out.println("Eating meat");
 }
}

 class Dog extends Animals{
    public void nature(){
        System.out.println("bhao bhao");
    } 

 }
    
 class babies extends Dog{
    public void color (){
        System.out.println("black");
    }
 }
  class femaleBabies extends babies  {
 public void type(){
    System.out.println("sensitive");
 }
    
 }

public class inheritance {
public static void main(String[] args) {
 femaleBabies obj = new femaleBabies();
 obj.nature();
obj.color();
obj.eat();
obj.type();

}
    
}


// ************hybird inheritence*************
// is ma kisi ka base classs ka kam child hutay hn kisi ka zyda hutay hn 