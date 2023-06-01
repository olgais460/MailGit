package Mail;

public class Salary {
    private String salaryCompany;
    private String salaryTo;
    private Integer salaryValue;

    public Salary(String salaryCompany, String salaryTo, Integer salaryValue) {
        this.salaryCompany = salaryCompany;
        this.salaryTo = salaryTo;
        this.salaryValue = salaryValue;
    }

    public String getSalaryCompany() {
        return salaryCompany;
    }

    public String getSalaryTo() {
        return salaryTo;
    }

    public Integer getSalaryValue() {
        return salaryValue;
    }
}
