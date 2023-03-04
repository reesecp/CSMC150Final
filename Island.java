public class Island {
    //prinate ?? outline;
    //have to figure out how to assine images of country outline to Island Object as well
    private String country;
    private String capital;
    private String ocean1;
    private String ocean2;
    private String sea;

    public Island() {
        this.country = "Antigua and Barbuda";
        this.capital = "St. John's";
        this.ocean1 = "Atlantic";
        this.ocean2 = null;
        this.sea = "Caribbean";
    }

    public Island(String country, String capital, String ocean1, String ocean2 , String sea) {
        this.country = country;
        this.capital = capital;
        this.ocean1 = ocean1;
        this.ocean2 = ocean2;
        this.sea = sea;
    }
}
