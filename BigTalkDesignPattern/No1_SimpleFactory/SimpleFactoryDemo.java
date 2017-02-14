package BigTalkDesignPattern.No1_SimpleFactory;

/**
 * Created by psxjo on 2017/2/14.
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Operation ope = simpleFactory.getOperation("+");
       ope.setNumberA (10);
       ope.setNumberA (12);
        double result = ope.getResult();
    }
}
