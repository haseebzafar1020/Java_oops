//******Polymorphism*********//
// poly means many time  and morphism means form 
 //===>  kam ko many time karna diffrents forms ma this is called polymorphism 
                                             //disscuss ||
// there are to type of polymorphism 1=> is "Compile time"  2=>Run time

// rules ==> ya tu parameter diffrent hu ya phir ya types differnt hu means int , string , float , and etc...

 class empolyee {
  String name ;
  int age ;
  
  // FUNCTION OVERLOADING 
  // jab same name ka function hu usy Function oveloading kehty hn overload means same name ka function ko ak hi class ma likhna
  public void work (  ) {
       System.out.println(age);
       System.out.println(name);
  } 
  public void work (String name) {
       System.out.println(this.name);
  } 
  public void work (int age , String name) {
       System.out.println("great");
       System.out.println(age +" " + name);
  } 
    

empolyee(){
 this.name = "Bilal";
 this.age = 18;
}
 }
  public class polymorphism {

    public static void main(String[] args) {
        empolyee obj = new empolyee();
          obj.name = "haseeb";
          obj.age = 30;
       obj.work(obj.age , obj.name);
       
     

    }
    
}