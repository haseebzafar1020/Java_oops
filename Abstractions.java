// //******Abstraction *//
// //user ko sirf uta na hi batana jis ki zarorat hu  baki cheezat hide karna...

// abstract class Animal {

// abstract void walk();  // is ko ap use nai kar sakty na ap is ka object nai bana sakty qk ya abstract ha.just ya blue print huta ha 

// }

// class Horse extends Animal{
// public void walk(){
// System.out.println("walk on 4 legs");
// }

// }
// class chicken extends Animal{
//     public void walk(){
// System.out.println("walk on 2 legs");
// }
// }





// public class Abstractions {
//     public static void main(String[] args) {
//         Horse obj = new Horse();
//         obj.walk();
//        chicken obj1 =new chicken();
//        obj1.walk();

//     }
// }


 
//&***************************Example 2 *****************************



abstract class car {
  abstract void drive ();   // abstract method ki body define nai karty..

  public void type(){
    System.out.println("4 wheels ");   // Abbstract class ma non abstact method b bana sakty hn...

  }

  car (){
    System.out.println("parent class constractor"); // jab child class ka constractor banay ga tu saab se pehly parent class ka constractor print hub ga.
                                                       // isy constructor chaning kehty hn..
  }               

}
class civic extends car{
public void drive (){
    String name ="Civic";
    int price = 87888; 
    System.out.println(name);
    System.out.println(price);

}
civic (){
System.out.println("child class constractor");
}
}


class toyota extends car{
    public void drive(int price){
        System.out.println("car is driving");
        System.out.println(price);
}

    @Override
    void drive() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drive'");
    }

}



public class Abstractions {
public static void main(String[] args) {
    civic obj  = new civic();   
     
}
 }
