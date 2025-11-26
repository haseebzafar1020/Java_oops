// class ak blue print ha is ma ham just attribute bata tay hn kisi b object ka ...
class car{
    String name ;
    int price ;
    public void run () {
        System.out.println(this.name);
    }

}

public class Classes {
public static void main(String[] args) {
    car obj = new car();
    obj.name = "Civic";
    obj.price = 450000;
    obj.run();
    car obj1 = new car() ;
    obj1.name = "carolla";
    obj1.price = 690000;
    obj1.run();
}
    
}

//*************This keyword ******************/
// ya hammay  batata ha kis class ka object na bolya ha 
