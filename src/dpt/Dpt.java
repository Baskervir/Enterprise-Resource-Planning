package dpt;

public class Dpt {
    public static final String CO_NAME = "사장실";
    public static final String S0_NAME = "회계";

    private String dptCd;
    private String dptNm;

    public Dpt(String dptCd) {
        this.dptCd = dptCd;

        if ("C0".equals(dptCd)) {
            dptNm = CO_NAME;
            return;
        }

        if ("S0".equals(dptCd)) {
            dptNm = S0_NAME;
            return;
        }

        dptNm = dptCd + "부서";
    }

    public String getDptCd() {
        return dptCd;
    }

    public String getDptNm() {
        return dptNm;
    }
}
