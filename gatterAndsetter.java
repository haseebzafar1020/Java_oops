// Setter AND Getter 
// ager apko private cheezoo ko Access karna ha tu Methoed ka zariya Acess kar sakty hn.

class test {
    private String name ;
    public int age;
    int height;


    public String getName(){
        return this.name;
    }

       public void setName(String name1){
       this.name = name1;
}
    
 
}
public class gatterAndsetter {
    public static void main(String[] args) {
      
    test obj = new test();
     obj.setName("haseeb");
     System.out.println(obj.getName());
    }
}
