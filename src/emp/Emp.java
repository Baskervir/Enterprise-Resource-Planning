package emp;

import dpt.Dpt;
import dpt.DptM;

public class Emp {
    private String empN = null;
    private String nm = null;
    private long sal = 0;
    private String dptCd = "C0";

    public Emp(String inputEmpN, String inputNm, long inputSal) {
        this.empN = inputEmpN;
        this.nm = inputNm;
        this.sal = inputSal;
    }

    public String getEmpN() {
        return empN;
    }

    public String getNm() {
        return nm;
    }

    public long getSal() {
        return sal;
    }

    public String toString() {
        return this.empN + " " + this.nm + " " + sal;
    }

    public void setDptCd(String dptCd){
        DptM dptM = new DptM();
        Dpt dpt = dptM.getDpt(dptCd);
        if (dpt == null) {
            throw new RuntimeException(dptCd + " 는 존재하지 않습니다.");
        }
        this.dptCd = dptCd;
    }

    public String getDptCd() {
        return this.dptCd;
    }

    public String getProfile() {
        return this.empN + " " + this.nm + " " + sal;
    }
}