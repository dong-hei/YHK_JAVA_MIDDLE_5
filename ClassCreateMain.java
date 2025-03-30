package lang.clasz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
//        Class helloClass = Hello.class;
        Class helloClasz = Class.forName("lang.clasz.Hello");

        Hello o = (Hello) helloClasz.getDeclaredConstructor().newInstance();
        String result = o.hello();
        System.out.println("hello = " + o);
        System.out.println("result = " + result);
    }
}
