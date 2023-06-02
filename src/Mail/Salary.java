package Mail;

public class Salary implements CommonMessage{
    private String salaryFrom;
    private String salaryTo;
    private Integer salaryContent;

    public Salary(String salaryFrom, String salaryTo, Integer salaryContent) {
        this.salaryFrom = salaryFrom;
        this.salaryTo = salaryTo;
        this.salaryContent = salaryContent;
    }

    public String getFrom() {
        return salaryFrom;
    }

    public String getTo() {
        return salaryTo;
    }

    public Integer getContent() {
        return salaryContent;
    }
}
