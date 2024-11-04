import org.junit.Test;

public class Biz_test {

    @Test
    public void t1() {
        String emp1_empN = "E01";
        String emp1_nm = "정민";
        long emp1_sal = 10000000;

        String emp2_empN = "E02";
        String emp2_nm = "현호";
        long emp2_sal = 30000000;

        long sum = emp1_sal + emp2_sal;
        System.out.println(sum);

        String emp1Str = emp1_empN + " " + emp1_nm + " " + emp1_sal;
        String emp2Str = emp2_empN + " " + emp2_nm + " " + emp2_sal;

        System.out.println(emp1Str);
        System.out.println(emp2Str);
    }

    @Test
    
}
