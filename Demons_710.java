class AA{
    protected int rollNo=555;
    protected void msg(){
        System.out.println("Hello Class A!"+rollNo);
    }
}
public class Demons_710  extends A{
    public static void main(String[] args) {
        AA ob = new AA();
        //A a= new A();
        //a.mg();
        Demons_710 d = new Demons_710();
        d.mg();
        System.out.println("Hello Class A!"+ob.rollNo);
        ob.msg();
    }
}
