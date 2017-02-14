package BigTalkDesignPattern.No1_SimpleFactory;

/**
 * Created by psxjo on 2017/2/14.
 */
public class ClassesImplement {
}
class AddW implements Operation{
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    double numberA;
    double numberB;
    @Override
    public double getResult(){
        return  numberA + numberB;
    }

}
class Sub implements Operation{
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    double numberA;
    double numberB;
    @Override
    public double getResult(){
        return numberA-numberB;
    }
}

class Mul implements Operation{
	    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
    double numberA;
    double numberB;
    @Override
    public double getResult(){
        return numberA*numberB;
    }
}
class Div implements Operation{
	    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
    double numberA;
    double numerbB;
    @Override
    public double getResult(){
        return numberA/numerbB;
    }
}