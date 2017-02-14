package BigTalkDesignPattern.No1_SimpleFactory;

/**
 * Created by psxjo on 2017/2/14.
 */
public class SimpleFactory {
    public Operation getOperation(String ope){
        if(ope == null){
            return null;
        }
        if(ope.equalsIgnoreCase("+")){
            return new AddW();
        }else if(ope.equalsIgnoreCase("-")){
            return new Sub();
        }else if(ope.equalsIgnoreCase("X")){
            return new Mul();
        }else if(ope.equalsIgnoreCase("/")){
            return new Div();
        }
        return null;
    }
}
