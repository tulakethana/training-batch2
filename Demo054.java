class Demo01{
    public int add(int a,int b){
        return a+b;
    }
    public String cancate(String a,String b){
        return a+b;

    }

    public double add(double a,double b,double c){
        return a+b+c;
    }
}
public class Demo054 {
    public static void main(String[] args) {
    Demo01 d1 = new Demo01();
    System.out.println(d1.add(10,20));
    System.out.println(d1.cancate("Tula","Kethana"));
    System.out.println(d1.add(12.0,34.8,56.9));
    

    }
}
