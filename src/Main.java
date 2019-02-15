public class Main {
    public static void main(String[] args) {
        Bank defaultBank = new Bank();
        defaultBank.resetValues("Privat Bank", 50000, 34000,
                1200345.45, "Orest Starchak", 89,
                3240);
        String getInformationAboutBank = defaultBank.toString();
        System.out.println(getInformationAboutBank);
        defaultBank.printMaxAmountOfGold();
        Bank.printStaticMaxAmountOfGold();

        Bank lvivBank = new Bank("Lviv Bank", 2000, 1432, 3440223.23);
        lvivBank.resetValues("Lviv Bank", 2000, 1432,
                3440223.23, "Orest Starchak", 23,
                1000);
        getInformationAboutBank = lvivBank.toString();
        System.out.println(getInformationAboutBank);
        lvivBank.printMaxAmountOfGold();
        Bank.printStaticMaxAmountOfGold();

        Bank proCreditLab = new Bank("Procredit Bank", 4500, 3434,
                13440223.23, "Orest Starchak", 89,
                1000);
        getInformationAboutBank = proCreditLab.toString();
        System.out.println(getInformationAboutBank);
        proCreditLab.printMaxAmountOfGold();
        Bank.printStaticMaxAmountOfGold();
    }
}