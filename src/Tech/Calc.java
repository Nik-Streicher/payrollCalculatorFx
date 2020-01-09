package Tech;

public class Calc {

    public Calc(Parameters parameters) {
        this.parameters = parameters;
    }

    private Parameters parameters;

    // Start

    public double superGrossWage(double wage) {
        return (wage / 100) * parameters.getSGW();
    }

    // 1) employer

    public double socialInsuranceEmployer(double wage) {
        return (wage / 100) * parameters.getISEmployer();
    }

    public double healthInsuranceEmployer(double wage) {
        return (wage / 100) * parameters.getHSEmployer();
    }

    // 2) employee

    public double socialInsuranceEmployee(double wage) {
        return (wage / 100) * parameters.getISEmployee();
    }

    public double healthInsuranceEmployee(double wage) {
        return (wage / 100) * parameters.getHSEmployee();
    }


    // 3) Tax on activity

    public double tax(double wage) {
        return (round(superGrossWage(wage)) / 100) * parameters.getTax();

    }

    public double afterDeductionOfDiscounts(double wage, boolean choose) {
        if (choose)
            return tax(wage) - parameters.getTaxDiscount();
        else return tax(wage);
    }

    public double netWage(double wage, boolean choose) {
        return wage - socialInsuranceEmployee(wage) - healthInsuranceEmployee(wage) - afterDeductionOfDiscounts(wage, choose);
    }

    // 4) Round
    public long round(double input) {
        long i = (long) Math.ceil(input);
        return ((i + 99) / 100) * 100;
    }
}
