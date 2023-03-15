public class Island {
    private String country;
    private String capital;
    private String bofw;
    private int order;

    public Island() {
        this.order = 0;
        this.country = "Antigua and Barbuda";
        this.capital = "St. john's";
        this.bofw = "the Atlantic Ocean";
    }

    public Island(int order, String country, String capital, String bofw) {
        this.order = order;
        this.country = country;
        this.capital = capital;
        this.bofw = bofw;
    }

    //getters
    public String getCountry() {
        return this.country;
    }
    public String getCapital() {
        return this.capital;
    }
    public String getBofw() {
        return this.bofw;
    }

    // printing methods
    public void printCountry(){
        System.out.print(this.country);
    }
    public void printBofw() {
        System.out.print(this.bofw);
    }
    public void printCapital(){
        System.out.print(this.capital);
    }
    public void printIsland(){
        System.out.print("Country: ");
        printCountry();
        System.out.println();
        System.out.print("Body of water: ");
        printBofw();
        System.out.println();
        System.out.print("Capital: ");
        printCapital();
        System.out.println();
    }
}
