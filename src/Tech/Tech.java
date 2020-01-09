package Tech;

public class Tech {

    public Tech(Calc calc, int wage ,boolean choose ) {
        this.calc = calc;
        this.wage = wage;
        this.choose = choose;
    }

    private int wage;
    private boolean choose;
    private Calc calc;

    //add Strings
    public String saveText() {
        return "!Základ!\n\n" + "Hrubá mzda : " + wage + "Kč\n" + "Sleva poplatníka : " + choose + "\nSuperhrubá mzda : " + calc.superGrossWage(wage) + " Kč\n" + "\n!Zaměstnavatel odvody z mzdy!\n\n" + "Socialní pojištění: " + calc.socialInsuranceEmployer(wage) + " Kč\n" + "Zdravotní pojištění: " + calc.healthInsuranceEmployer(wage) + " Kč\n" +
                "\n!Zaměstnanec odvody z mzdy!\n" + "\nSocialní pojištění:" + calc.socialInsuranceEmployee(wage) + " Kč\n" + "Zdravotní pojištění: " + calc.healthInsuranceEmployee(wage) + " Kč\n" +
                "\n!Daň ze závislé činnosti!\n" + "\nZáklad daní : " + calc.round(wage) + " Kč\n" + "Daň: " + calc.tax(wage) + " Kč \n" + "Daň po odpoču slevy: " + calc.afterDeductionOfDiscounts(wage, choose) + " Kč\n" +
                "\nČistá mzda : " + calc.netWage(wage, choose) + " Kč";
    }
}
