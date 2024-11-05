package biz;

import dpt.Dpt;
import emp.Emp;
import org.junit.Test;

public class Biz_test02 {
    @Test
    public void t01() {
        Dpt dpt = new Dpt("C0");
        System.out.println(dpt.getDptNm());

        Emp emp = new Emp("E01", "정민1", 10000000);
        System.out.println(emp.toString());
    }

    @Test
    public void t2() {
        Biz biz1 = new Biz();
        biz1.toString();

        Biz biz2 = new Biz();
        biz2.toString();

        System.out.println(biz2.getDpt("S0").getDptCd());
    }

    @Test
    public void t3() {
        String c0Name = Dpt.CO_NAME;

        System.out.println("상수에서 가져온 이름 : " + c0Name);

        Dpt dpt = new Dpt("C0");
        System.out.println("부서 이름 : " + dpt.getDptNm());
    }
}
