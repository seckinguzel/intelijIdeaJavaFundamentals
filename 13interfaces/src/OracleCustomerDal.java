public class OracleCustomerDal implements ICustomerDal, IRepository{ //Baska bir class ile extend etseydik eger extend implement den once yazilirdi syntax bu sekilde

    @Override
    public void Add() {

        System.out.println("OracleSql has been added!");

    }

}
