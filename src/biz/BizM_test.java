package biz;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BizM_test {
    @Test
    public void t1() {
        BizM bizM = new BizM();
        bizM.req01();
    }

    @Test
    public void t2() {
        BizM bizM = new BizM();

        try {
            HashMap<String, String> input = new HashMap<String, String>();
            input.put("EMP_N", "E004");
            input.put("SAL", "10000000");
            input.put("DPT_CD", "A1");
            bizM.req02(input);
        } catch (Exception ex) {
            bizM.println("오류 발생.");
            ex.printStackTrace();
        }
    }

    @Test
    public void t3() throws Exception {
        HashMap<String, String> input = new HashMap<>();
        input.put("EMP_N", "E003");
        input.put("NM", "정민3");
        input.put("SAL", "30000000");
        input.put("DPT_CD", "A1");

        BizM bizM = new BizM();
        bizM.req03(input);
    }
}
