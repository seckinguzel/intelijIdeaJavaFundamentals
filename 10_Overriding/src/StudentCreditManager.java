public class StudentCreditManager extends BaseCreditManager{

    public double calculate(double cost){

        return cost * 1.10; //java nin bir özelligi overridable ozelligi sayesinde BaseCreditManager daki işlemin faizini burada 1.10 alarak uzerine yazmis yani ezmis olduk

    }

}
