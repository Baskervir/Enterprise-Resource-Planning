package emp;

import dpt.Dpt;
import dpt.DptM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;

public class Emp {

    public static final String EMP_FILE_DIR;

    static {
        File files = new File("");
        String rootPath = files.getAbsolutePath();
        EMP_FILE_DIR = rootPath + "/doc";
    }

    public Emp(String empN) throws Exception {
        this.empN = empN;
        readFile();
    }

    public Emp(String empN, String nm) {
        this.empN = empN;
        this.nm = nm;
    }

    private void readFile() throws Exception {
        File file = getEmpFile();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (int i = 0; i < 20; i++) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }

                line = line.trim();
                String[] datas = line.split(":");
                if (datas.length != 2) {
                    continue;
                }

                setData(datas);
            }
        }

        catch (Exception ex) {
            this.nm = null;
            this.dptCd = null;
            this.sal = 0;

            throw ex;
        }
    }

    private void setData(String[] datas) {
        String key = datas[0];
        key = key.trim();

        String value = datas[1];
        value = value.trim();

        if ("NM".equals(key)) {
            this.nm = value;
            return;
        }

        if ("DPT_CD".equals(key)) {
            this.dptCd = value;
            return;
        }

        if ("SAL".equals(key)) {
            this.sal = new BigDecimal(value).longValue();
            return;
        }
    }

    private File getEmpFile() {
        String path = EMP_FILE_DIR + File.separatorChar + this.empN + ".dat";
        File file = new File(path);
        return file;
    }

    String empN;
    String nm;
    String dptCd;
    long sal;

    public String getEmpN() {
        return empN;
    }

    public String getNm() {
        return nm;
    }

    public long getSal() {
        return sal;
    }

    public String getDptCd() {
        return dptCd;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public void setDptCd(String dptCd) {
        this.dptCd = dptCd;
    }

    public String proFile() {
        StringBuffer sb = new StringBuffer();

        Dpt dpt = DptM.getDptM().getDpt(this.dptCd);
        String dptNm = "소속되지 않음";
        if (dpt != null) {
            dptNm = dpt.getDptNm();
        }

        sb.append("사번 : " + this.empN);
        sb.append("\n이름 : " + this.nm);
        sb.append("\n연봉 : " + this.sal);
        sb.append("\n부서명 : " + dptNm);

        return sb.toString();
    }

    public void flush() throws Exception {
        try (FileWriter fileWriter = new FileWriter(getEmpFile())) {
            fileWriter.write("EMP_N : " + this.empN);
            fileWriter.write("\nNM : " + this.nm);
            fileWriter.write("\nSAL : " + this.sal);
            fileWriter.write("\nDPT_CD : " + this.dptCd);
        }
    }
}