package Tech;

public class Parameters {

    // tax, starting parameters
    private static int taxDiscount = 2070;
    public static double sGW = 133.8;

    // 1) employer
    private static double iSEmployer = 24.8;
    private static double hSEmployer = 9;


    // 2)employee
    private static double iSEmployee = 6.5;
    private static double hSEmployee = 4.5;


    // 3) Tax on activity
    private static double tax = 15;

    // 4) getter + setter
    int getTaxDiscount() {
        return taxDiscount;
    }

    public void setTaxDiscount(int taxDiscount) {
        Parameters.taxDiscount = taxDiscount;
    }

    double getSGW() {
        return sGW;
    }

    public void setSGW(double sGW) {
        Parameters.sGW = sGW;
    }

    double getISEmployer() {
        return iSEmployer;
    }

    public void setISEmployer(double iSEmployer) {
        Parameters.iSEmployer = iSEmployer;
    }

    double getHSEmployer() {
        return hSEmployer;
    }

    public void setHSEmployer(double hSEmployer) {
        Parameters.hSEmployer = hSEmployer;
    }

    double getISEmployee() {
        return iSEmployee;
    }

    public void setISEmployee(double iSEmployee) {
        Parameters.iSEmployee = iSEmployee;
    }

    double getHSEmployee() {
        return hSEmployee;
    }

    public void setHSEmployee(double hSEmployee) {
        Parameters.hSEmployee = hSEmployee;
    }

    double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        Parameters.tax = tax;
    }
}
