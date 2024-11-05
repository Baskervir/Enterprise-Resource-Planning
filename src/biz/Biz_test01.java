package biz;

import dpt.Dpt;
import emp.Emp;
import org.junit.Test;

public class Biz_test01 {

    @Test
    public void t1() {
        String emp1_empN = "E01";
        String emp1_nm = "정민1";
        long emp1_sal = 10000000;

        String emp2_empN = "E02";
        String emp2_nm = "정민2";
        long emp2_sal = 30000000;

        long sum = emp1_sal + emp2_sal;
        System.out.println(sum);

        String emp1Str = emp1_empN + " " + emp1_nm + " " + emp1_sal;
        String emp2Str = emp2_empN + " " + emp2_nm + " " + emp2_sal;

        System.out.println(emp1Str);
        System.out.println(emp2Str);
    }

    @Test
    public void t2() {
        String[] empCdArray = new String[2];
        empCdArray = new String[] {"E01", "E02"};

        String[] empNmArray = new String[2];
        empNmArray[0] = "정민1";
        empNmArray[1] = "정민2";

        long[] salArray = new long[] {10000000, 30000000};

        for (int i = 0; i < empCdArray.length; i++) {
            String empCd = empCdArray[i];
            String empNm = empNmArray[i];
            long sal = salArray[i];

            String empStr = empCd + " " + empNm + " " + sal;
            System.out.println(empStr);
        }
    }

    @Test
    public void t3() {
        Emp emp1 = new Emp("E01", "정민1", 10000000);
        Emp emp2 = new Emp("E02", "정민2", 30000000);

        String emp1Str = emp1.toString();
        System.out.println(emp1Str);

        String emp2Str = emp2.toString();
        System.out.println(emp2Str);
    }

    @Test
    public void t4() {
        Emp emp1 = new Emp("E01", "정민1", 10000000);
        Emp emp2 = new Emp("E02", "정민2", 30000000);

        Emp[] empList = new Emp[2];
        empList[0] = emp1;
        empList[1] = emp2;

        long sum = 0;
        for (Emp emp : empList) {
            sum = sum + emp.getSal();
            System.out.println(sum);
        }
    }

    @Test
    public void t5() {
        Dpt[] dptArray = new Dpt[3];
        dptArray[0] = new Dpt("C0");
        dptArray[1] = new Dpt("S0");
        dptArray[2] = new Dpt("A1");

        for (Dpt dpt : dptArray) {
            String dptNm = dpt.getDptNm();
            System.out.println(dptNm);
        }
    }
}
