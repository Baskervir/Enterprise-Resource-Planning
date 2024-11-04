public class Dpt {
    private String dptCd = null;
    private String dptNm = null;

    public Dpt(String dptCd) {
        this.dptCd = dptCd;

        if ("C0".equals(dptCd)) {
            dptNm = "사장실";
            return;
        }

        if ("S0".equals(dptCd)) {
            dptNm = "회계";
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
