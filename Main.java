class Demo054{
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
public class Main {
    public static void main(String[] args) {
    Demo054 d1 = new Demo054();
    System.out.println(d1.add(10,20));
    System.out.println(d1.cancate("Tula","Kethana"));
    System.out.println(d1.add(12.0,34.8,56.9));
    

    }
}