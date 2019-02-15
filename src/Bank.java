public class Bank {
    private String name;
    private int numberOfClients;
    private int numberOfCredits;
    private double capitalization;
    private String bankManager;
    private static final double MAX_AMOUNT_OF_GOLD = 1000.00;
    protected int numberOfSafes;
    protected int numberOfSpecialClients;

    public Bank() {
        this("default", 0, 0,
                0, "default", 0,
                0);
    }

    public Bank(String name, int numberOfClients, int numberOfCredits,
                double capitalization) {
        this(name, numberOfClients, numberOfCredits,
                capitalization, "default", 0,
                0);
    }

    public Bank(String name, int numberOfClients, int numberOfCredits,
                double capitalization, String bankManager, int numberOfSafes,
                int numberOfSpecialClients) {
        this.name = name;
        this.numberOfClients = numberOfClients;
        this.numberOfCredits = numberOfCredits;
        this.capitalization = capitalization;
        this.bankManager = bankManager;
        this.numberOfSafes = numberOfSafes;
        this.numberOfSpecialClients = numberOfSpecialClients;
    }

    public String toString() {
        return "Bank name: " + name + "\n" +
                "Number of clients: " + numberOfClients + "\n" +
                "Number of credits: " + numberOfCredits + "\n" +
                "Capitalization: " + capitalization + "\n" +
                "Bank manager: " + bankManager + "\n" +
                "Number of safes: " + numberOfSafes + "\n" +
                "Number of special clients: " + numberOfSpecialClients + "\n";
    }

    public void resetValues(String name, int numberOfClients, int numberOfCredits,
                            double capitalization, String bankManager, int numberOfSafes,
                            int numberOfSpecialClients) {
        this.name = name;
        this.numberOfClients = numberOfClients;
        this.numberOfCredits = numberOfCredits;
        this.capitalization = capitalization;
        this.bankManager = bankManager;
        this.numberOfSafes = numberOfSafes;
        this.numberOfSpecialClients = numberOfSpecialClients;
    }

    public static void printStaticMaxAmountOfGold() {
        System.out.println("Static method - amount of max gold: " + MAX_AMOUNT_OF_GOLD + "\n");
    }

    public void printMaxAmountOfGold() {
        System.out.println("Non-static method - amount of max gold: " + MAX_AMOUNT_OF_GOLD + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getCapitalization() {
        return capitalization;
    }

    public void setCapitalization(double capitalization) {
        this.capitalization = capitalization;
    }

    public String getBankManager() {
        return bankManager;
    }

    public void setBankManager(String bankManager) {
        this.bankManager = bankManager;
    }
}