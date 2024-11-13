package biz;

import dpt.Dpt;
import dpt.DptM;
import emp.Emp;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
}
