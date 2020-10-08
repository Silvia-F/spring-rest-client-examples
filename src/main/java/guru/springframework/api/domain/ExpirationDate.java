package guru.springframework.api.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;

public class ExpirationDate implements Serializable {

    private OffsetDateTime date;

    private int timezoneType;

    private String timezone;

    public ExpirationDate(OffsetDateTime date, int timezoneType, String timezone) {
        this.date = date;
        this.timezoneType = timezoneType;
        this.timezone = timezone;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public int getTimezoneType() {
        return timezoneType;
    }

    public void setTimezoneType(int timezoneType) {
        this.timezoneType = timezoneType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
