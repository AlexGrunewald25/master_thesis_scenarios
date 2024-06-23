package master.demos.customer_application_service.util.models;

public class CarInsuranceOffer {
    private double basicPremium;

    public CarInsuranceOffer() {
    }

    public CarInsuranceOffer(double basicPremium) {
        this.basicPremium = basicPremium;
    }

    public double getBasicPremium() {
        return basicPremium;
    }

    public void setBasicPremium(double basicPremium) {
        this.basicPremium = basicPremium;
    }
}
