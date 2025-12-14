

// overriding
// jab ap parent class ka same method child class ma same name se banata hu tu chid parent ko override karta ha



class pen {
    public void write (){
        System.out.println("Writing from pen class");
    }
}
class marker extends pen {
    @Override
    public void write(){
        System.out.println("writing from marker");
    }
}


public class overriding {
public static void main(String[] args) {
    marker obj = new marker();
obj.write();
    
}
}
