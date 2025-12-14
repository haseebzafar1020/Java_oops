//Intrfaces 
// is ma pure abstraction huti ha.... 
// non abstract  cheezay like (method, variable etc....) nai bana sakty ap is ma...

// interface Animal{
//    int eye = 2;     // is ma hamay ikhna nai parta abstrction keyword  , bulka already hi absstract huti ha chezay or na pubic keywod define karna pata.
//    void walk();

// }

// class horse implements Animal {
//     public void walk(){        // is ma hamay public lagana parta ha warna default mana jata ha. or error ati ha 
//         System.out.println("walks on 4 legs");
//     }
// }

// public class Interfaceses {
//    public static void main(String[] args) {
//      horse obj = new horse();
//      obj.walk();   
     
//    }
// }


//  one child class acceess multiple parent class 
// jo sirf interfaces ma implement hu sakta ha 

 interface Animal{
   int eye = 2;     // is ma hamay ikhna nai parta abstrction keyword  , bulka already hi absstract huti ha chezay or na pubic keywod define karna pata.
   void walk();

}
interface harbivour {
    void harbivour();
}


class horse implements Animal , harbivour {
    public void walk(){        // is ma hamay public lagana parta ha warna default mana jata ha. or error ati ha 
        System.out.println("walks on 4 legs");
    }
    public void harbivour()
    {
        System.out.println("Horse are harbivour animal ");
    }
}

public class Interfaceses {
public static void main(String[] args) {
    horse obj = new horse();
    obj.walk();
    obj.harbivour();
}
    
}


