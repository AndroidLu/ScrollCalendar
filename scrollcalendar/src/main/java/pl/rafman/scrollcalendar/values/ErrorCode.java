package pl.rafman.scrollcalendar.values;

/**
 * @Author lhh
 * @ClasssName ErrorCode
 * @Description
 * @UpdateDate 2020-01-03 11:48
 */
public enum ErrorCode {
    OK(0, "成功");
    private int code;
    private String descript;

    ErrorCode(int code, String descript) {
        this.code = code;
        this.descript = descript;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }}


