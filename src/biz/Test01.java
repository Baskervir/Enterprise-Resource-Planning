package biz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01 {
    @Test
    public void t1() {
        String[] empNArray = new String[] {"E01", "E02", "E03"};

        ArrayList<String> list = new ArrayList<String>();

        for (String empN : empNArray) {
            list.add(empN);
        }

        for (String empN : list) {
            System.out.println(empN);
        }
    }

    @Test
    @DisplayName("정민3은 E03 부서 입니다.")
    public void t2() {
        String[] empNArray = new String[] {"E01", "E02", "E03"};
        String[] empNmArray = new String[] {"정민1", "정민2", "정민3"};

        HashMap<String, String> hm = new HashMap<String, String>();

        for (int i = 0; i < empNArray.length; i++) {
            String key = empNArray[i];
            String value = empNmArray[i];

            hm.put(key, value);
        }

        assertEquals("정민3", hm.get("E03"));
    }

    @Test
    public void t3() {
        String[] empNArray = new String[] {"E01", "E02", "E03"};
        String[] empNmArray = new String[] {"정민1", "정민2", "정민3"};

        ArrayList<String> list = new ArrayList<String>();

        HashMap<String, String> hm = new HashMap<String, String>();

        for (int i = 0; i < empNArray.length; i++) {
            String empN = empNArray[i];
            list.add(empN);
        }

        for (int i = 0; i < empNArray.length; i++) {
            String key = empNArray[i];
            String value = empNmArray[i];
            hm.put(key, value);
        }

        System.out.println("List.get(2) = " + list.get(2));
        System.out.println("hm.get(\"E02\") = " + hm.get("E02"));

        System.out.println("list.size() = " + list.size());
        System.out.println("hm.size() = " + hm.size());

        for (String empN : list) {
            System.out.println(empN);
        }

//        for (int i = 0; i < list.size(); i++) {
//            String empN = list.get(i);
//            System.out.println(empN);
//        }
        for (int i = 0; i < empNArray.length; i++) {
            String empNm = hm.get(empNArray[i]);
            System.out.println(empNm);
        }

        for (String key : hm.keySet()) {
            String empNm2 = hm.get(key);
            System.out.println(empNm2);
        }
    }

    @SuppressWarnings({ "raqtypes", "unchecked"})
    @Test
    public void t4() {
        String[] empNArray = new String[] {"E01", "E02", "E03"};

        ArrayList list = new ArrayList();

        for (String empN : empNArray) {
            list.add(empN);
        }

        Object obj = list.get(2);
        String data = (String) obj;
        System.out.println(data);

        ArrayList<String> list2 = new ArrayList<String>();

        for (String empN : empNArray) {
            list2.add(empN);
        }

        data = list2.get(2);
    }

    @Test
    public void t5() {
        String[] empNArray = new String[] {"E01", "E02", "E03"};
        String[] empNmArray = new String[] {"정민1", "정민2", "정민3"};

        List<String> list = new ArrayList<String>();

        Map<String, String> hm = new HashMap<String, String>();

        for (int i = 0; i < empNArray.length; i++) {
            String key = empNArray[i];
            String value = empNmArray[i];

            list.add(key);
            hm.put(key, value);
        }

        System.out.println("List size : " + list.size());
        System.out.println("Map size : " + hm.size());
    }

    @Test
    public void t6() {
        ArrayList<String> arrayList = new ArrayList<String>();

        LinkedList<String> linkedList = new LinkedList<String>();

        String[] empNArray = new String[] {"E01", "E02", "E03"};
        for (String empN : empNArray) {
            arrayList.add(empN);
            linkedList.add(empN);
        }

        printList(arrayList);

        printList(linkedList);
    }

    private void printList(List<String> list) {
        for (String data : list) {
            System.out.println(data);
        }
    }
}