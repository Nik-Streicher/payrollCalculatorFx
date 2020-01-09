package Tech;

public class Parameters {

    // tax, starting parameters
    private int taxDiscount = 2070;
    private double sGW = 133.8;

    // 1) employer
    private double iSEmployer = 24.8;
    private double hSEmployer = 9;


    // 2)employee
    private double iSEmployee = 6.5;
    private double hSEmployee = 4.5;


    // 3) Tax on activity
    private double tax = 15;

    // 4) getter + setter


    int getTaxDiscount() {
        return taxDiscount;
    }

    void setTaxDiscount(int taxDiscount) {
        this.taxDiscount = taxDiscount;
    }

    double getSGW() {
        return sGW;
    }

    void setSGW(double sGW) {
        this.sGW = sGW;
    }

    double getISEmployer() {
        return iSEmployer;
    }

    void setISEmployer(double iSEmployer) {
        this.iSEmployer = iSEmployer;
    }

    double getHSEmployer() {
        return hSEmployer;
    }

    void setHSEmployer(double hSEmployer) {
        this.hSEmployer = hSEmployer;
    }

    double getISEmployee() {
        return iSEmployee;
    }

    void setISEmployee(double iSEmployee) {
        this.iSEmployee = iSEmployee;
    }

    double getHSEmployee() {
        return hSEmployee;
    }

    void setHSEmployee(double hSEmployee) {
        this.hSEmployee = hSEmployee;
    }

    double getTax() {
        return tax;
    }

    void setTax(double tax) {
        this.tax = tax;
    }
}
