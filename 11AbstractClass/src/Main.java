public class Main {

    public static void main(String[] args) {

        ChildrenGameCalculator childrenGameCalculator = new ChildrenGameCalculator();

        childrenGameCalculator.calculate();
        childrenGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomenGameCalculator(); //GameCalculator() olarak kullanamam izin vermez

        gameCalculator.calculate(); //Women için hesaplar

    }

}
