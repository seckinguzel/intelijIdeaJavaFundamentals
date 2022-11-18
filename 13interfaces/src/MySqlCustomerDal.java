public class MySqlCustomerDal implements ICustomerDal, IRepository { //Baska bir class ile extend etseydik eger extend implement den once yazilirdi syntax bu sekilde

    @Override
    public void Add() {

        System.out.println("MySql has been added!");

    }

}
