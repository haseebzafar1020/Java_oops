// Static Keywords
// The static keyword in programming defines members (variables, methods, blocks, nested classes) that belong to the class itself, not individual objects
// 1 => satatic cheezy srif static Class hi Access kar sakti hn 
// 2 => without create objects using only class name 

class pen {
    public static int totalpen = 0 ;
 String name ;
 int price ;
    
{
totalpen++;
}

//  static void total (){  // static method 
    
//     System.out.println("Total pen " + totalpen );
// }
}
public class statickeyword {
    public static void main(String[] args) {
        pen obj1 = new pen();
        pen obj2 = new pen();
        pen obj3 = new pen();
        pen obj4 = new pen();
        pen obj5 = new pen();
        System.out.println(pen.totalpen);  //static ki wajah se ham na isy class ka refrence dia ha only 
    }
}
