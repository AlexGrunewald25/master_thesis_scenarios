package master.demos.basis_permium_calculation_service.moduls;

import master.demos.basis_permium_calculation_service.util.enums.*;

public class BasicPremium {

    private int policyHolderAge;

    private Gender gender;

    private int policyHolderDrivingExperience;

    private CarType carType;

    private int carAge;

    private int carEnginePerformance;

    private SafetyEquipment safetyEquipment;

    private int carKilometerPerYear;

    private UsageType usageType;

    private ResidenceType residenceType;

    private double basicPremium;

    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    public void setPolicyHolderAge(int policyHolderAge) {
        this.policyHolderAge = policyHolderAge;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getPolicyHolderDrivingExperience() {
        return policyHolderDrivingExperience;
    }

    public void setPolicyHolderDrivingExperience(int policyHolderDrivingExperience) {
        this.policyHolderDrivingExperience = policyHolderDrivingExperience;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public int getCarEnginePerformance() {
        return carEnginePerformance;
    }

    public void setCarEnginePerformance(int carEnginePerformance) {
        this.carEnginePerformance = carEnginePerformance;
    }

    public SafetyEquipment getSafetyEquipment() {
        return safetyEquipment;
    }

    public void setSafetyEquipment(SafetyEquipment safetyEquipment) {
        this.safetyEquipment = safetyEquipment;
    }

    public int getCarKilometerPerYear() {
        return carKilometerPerYear;
    }

    public void setCarKilometerPerYear(int carKilometerPerYear) {
        this.carKilometerPerYear = carKilometerPerYear;
    }

    public UsageType getUsageType() {
        return usageType;
    }

    public void setUsageType(UsageType usageType) {
        this.usageType = usageType;
    }

    public ResidenceType getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(ResidenceType residenceType) {
        this.residenceType = residenceType;
    }

    public double getBasicPremium() {
        return basicPremium;
    }

    public void setBasicPremium(double basicPremium) {
        this.basicPremium = basicPremium;
    }
}
