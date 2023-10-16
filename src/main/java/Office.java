public class Office {
    String companyName;
    int income;
    int outgoings;

    public Office(String companyName, int income, int outgoings){
        this.companyName = companyName;
        this.income = income;
        this.outgoings = outgoings;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getIncome() {
        return this.income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getOutgoings() {
        return this.outgoings;
    }

    public void setOutgoings(int outgoings) {
        this.outgoings = outgoings;
    }
}
