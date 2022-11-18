public class Main {

    public static void main(String[] args) {

        CreditUi creditUi = new CreditUi();
        creditUi.CalculateCredit(new TeacherCreditManager()); //BaseCreditManager hem FarmCreditManager hemde TeacherCreditManager in annesi oldugundan iceriye istedigimiz CreditManager i gonderebiliriz. Bu sekilde yarin SoldierCreditManager diye bir class eklesek onunda annesini BaseCreditManager yapip burada cagirabiliriz
        creditUi.CalculateCredit(new FarmCreditManager());

    }

}
