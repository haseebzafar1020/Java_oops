//*************This keyword ******************/
// ya hammay  batata ha kis class ka object na bolya ha 

// ya reference ka tor pr se huta ha..


class Student {
    String name ;
    int age ;
    public void writename (){
    System.out.println(this.name);
    System.out.println(this.age);
    }
    
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.writename();

    }
}
