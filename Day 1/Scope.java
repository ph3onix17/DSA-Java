
public class Scope {
    int a = 10;
    static int  b = 10;
    
    public static void main(String args[]){
        String name = "Anura";

        Scope sc = new Scope();

        System.out.println(name);
        System.out.println(sc.a);
        System.out.println(b);

    }
}
