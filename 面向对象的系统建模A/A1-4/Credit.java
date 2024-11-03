package A1_4;

import java.util.Date;
public class Credit extends Payment {
    private String number;
    private String type;
    private Date expireDate;
    public Credit(String number, String type, Date expireDate) {
        this.number = number;
        this.type = type;
        this.expireDate = expireDate;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Date getExpireDate() {
        return expireDate;
    }
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
