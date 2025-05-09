public class App{
    public static void main(String[] args) throws Exception {
        //tinh chu vi, dien tich
        rectangle r1 = new rectangle();
		r1.getInformation();
		r1.display();
        //number
        Number n1 = new Number(); 
        Number n2 = new Number();
        n1.i = 2; 
        n2.i = 5; 
        n1 = n2;
        n1.i = 10;
        System.out.println(n2.i);
        System.out.println(n1.i);
        //passObject
        Number n = new Number(); 
        n.i = 14; 
        PassObject.f(n);
        System.out.println(n.i);
    }
}
