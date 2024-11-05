package dpt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DptM {
    private static Map<String, Dpt> HM_DPT = new HashMap<String, Dpt>();

    static {
        HM_DPT.put("C0", new Dpt("C0"));
        HM_DPT.put("S0", new Dpt("S0"));
        HM_DPT.put("A1", new Dpt("A1"));
    }

//    String[] dptCdArray = new String[] {"C0", "S0", "A1"};
//    for (String dptCd : dptCdArray) {
//        String key = dptCd;
//        Dpt value = new Dpt(key);
//        HM_DPT.put(key, value);
//    }

    public Dpt[] dptArray() {
        Dpt[] list = new Dpt[HM_DPT.size()];

        int i = 0;
        for (String key : HM_DPT.keySet()) {
            Dpt value = HM_DPT.get(key);
            list[i] = value;
        }
        return list;
    }

    public List<Dpt> dptList() {
        ArrayList<Dpt> list = new ArrayList<Dpt>();
        for (String key : HM_DPT.keySet()) {
            Dpt value = HM_DPT.get(key);
            list.add(value);
        }
        return list;
    }

    public Dpt getDpt(String dptCd) {
        Dpt value = HM_DPT.get(dptCd);
        return value;
    }

    static {
        HM_DPT.put("C0", new Dpt("C0", null));
        HM_DPT.put("S0", new Dpt("S0", "C0"));
        HM_DPT.put("A0", new Dpt("A0", "C0"));
        HM_DPT.put("A1", new Dpt("A1", "A0"));
        HM_DPT.put("A2", new Dpt("A2", "A0"));
        HM_DPT.put("B0", new Dpt("B0", "C0"));
        HM_DPT.put("B1", new Dpt("B1", "B0"));
        HM_DPT.put("B2", new Dpt("B2", "B0"));
    }
}
