package biz;

import dpt.Dpt;
import dpt.DptM;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BizM {
    private DptM dptM = new DptM();

    private PrintStream out = System.out;

    @Test
    public void req01() {
        String input = "A2";

        Dpt dptA2 = dptM.getDpt(input);

        List<Dpt> dptA2List = new ArrayList<>();
        dptA2List.add(dptA2);

        String upDptCdA0 = dptA2.getUpDptCd();
        Dpt dptA0 = dptM.getDpt(upDptCdA0);
        dptA2List.add(dptA0);

        String upDptCdC0 = dptA0.getUpDptCd();
        Dpt dptC0 = dptM.getDpt(upDptCdC0);
        dptA2List.add(dptC0);

        int size = dptA2List.size();
        for (int i = 0; i < size; i++) {
            Dpt thisDpt = dptA2List.get(i);
            String thisDptNm = thisDpt.getDptNm();
            this.out.println(thisDptNm);
        }
    }
}
