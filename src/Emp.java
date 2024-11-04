public class Emp {
    private String empN;
    private String nm;
    private long sal;
    public String dptCd;

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
}