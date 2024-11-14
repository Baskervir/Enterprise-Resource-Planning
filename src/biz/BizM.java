package biz;

import dpt.DptM;
import emp.Emp;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Map;

public class BizM {
    private PrintWriter out = new PrintWriter(System.out);

    public void println(String msg) {
        out.println(msg);
        out.flush();
    }

    @Test
    public void req01() {
        String input = "E001";

        try {
            Emp empE001 = new Emp(input);
            String proFile = empE001.proFile();

            println(proFile);
        } catch (Exception ex) {
            ex.printStackTrace();
            String msg = ex.getMessage();
            println("사번 [" + input + "] proFile 출력을 실패 했습니다. [" + msg + "]");
        }
    }

    private DptM dptM = DptM.getDptM();

    public void req02(Map<String, String> input) throws Exception {
        String empN = input.get("EMP_N");
        String dptCd = input.get("DPT_CD");

        if (dptM.getDpt(dptCd) == null) {
            throw new Exception("[" + dptCd + "] 부서코드는 존재하지 않습니다.");
        }

        long sal = new BigDecimal(input.get("SAL")).longValue();

        Emp emp = new Emp(empN);
        emp.setSal(sal);
        emp.setDptCd(dptCd);

        emp.flush();
    }

    public void req03(Map<String, String> input) throws Exception {
        String empN = input.get("EMP_N");
        String nm = input.get("NM");
        String dptCd = input.get("DPT_CD");
        long sal = new BigDecimal(input.get("SAL")).longValue();

        if (dptM.getDpt(dptCd) == null) {
            throw new Exception("[" + dptCd + "] 부서코드는 존재하지 않습니다.");
        }

        Emp emp = new Emp(empN, nm);
        emp.setDptCd(dptCd);
        emp.setSal(sal);
        emp.flush();
    }

    public void req04() throws Exception {
        String empFileDir = Emp.EMP_FILE_DIR;
        File dir = new File(empFileDir);
        File[] files = dir.listFiles();
        for (File thisFile : files) {
            if (thisFile == null) {
                continue;
            }

            if (!thisFile.isFile()) {
                continue;
            }

            String thisFileName = thisFile.getName();
            if (!thisFileName.endsWith(".dat")) {
                continue;
            }

            if (!thisFileName.startsWith("E")) {
                continue;
            }

            String empN = thisFile.getName().replace(".dat", "");
            Emp emp = new Emp(empN);
            String proFile = emp.proFile();
            println(proFile);
        }
    }
}
