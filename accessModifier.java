//AccessModifier
//1 private ===> sirf apni hi class ka ander accessable huta ha ager class ka bahir access karna ha to ****GETTER and SETTERi***** Ka use kartay hn 
//2 default ===> apnay pacakage / folder ma accessable huta ha 
//3 public  ===> hr jagah Access kar sakty hn 
//4 protected ==> same Class , Same package , and SubClass/ Child clases ko b access milta ha..

  class demo {
 private String name ;
 public int age ;
 protected String name1;
}

public class accessModifier {
   public static void main(String[] args) {
    demo obj = new demo();
    obj.age = 67;
     obj.name1 = "haseeb";

   } 
}
