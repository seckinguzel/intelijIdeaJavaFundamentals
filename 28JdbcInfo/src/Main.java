import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null; //connection için gerekli kod.
        DbHelper helper = new DbHelper(); //DbHelper class tanımlaması.
        Statement statement = null; //sql sorgu cümlesiyle ilgili işlemleri yapacak.
        ResultSet resultSet; //sorgunun sonucunda gelen datalar resultSet olarak düşünülebilir.
        ArrayList<Country> countries = new ArrayList<Country>(); //Country adında bir class oluşturduk ve içinede bir constructor oluşturduk, aşağıda listeye yeni bir ülke eklemek için bu aksiyonu yaptık.
        try{
            connection = helper.getConnection(); //db ile bağlantı kurmak için. bağlantı kurmak için gerekli kod DbHelper class ın da yazılı.
            statement = connection.createStatement(); //gönderilecek sorgu bu bağlantıyla gidecek.
            resultSet = statement.executeQuery("select Code, Name, Continent, Region from country"); //bu sorguyu çalıştırıp gelen datayı resultSet e aktarır.
            while (resultSet.next()){ //tek tek iterate et demek, yani tek tek gez demek.
                System.out.println(resultSet.getString("Name")); //239 ülkeyi yani database de var olan tüm ülkeleri çıktı olarak ekrana bastı.
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region"))); //Listeye yeni bir ülke ekler (insert etmez yani var olmayan bir ülkeyi eklemez!). Ayrıca bunları while içinde yazmasaydık eğer listeye eklerken hep baştan yenileyecekti ve en sonunda biz tek bir ülke görecektik.
            }
            System.out.println("Total country number= " + countries.size());
        }catch (SQLException exception){ //hata yakalama.
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close(); //bağlantıyı kapatma.
        }
    }
}