import org.junit.Test;

public class Biz_test {

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
}
