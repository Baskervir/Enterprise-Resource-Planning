package biz;

import dpt.Dpt;

public class Biz {
    private static Dpt[] DPT_ARRAY = null;

    static {
        DPT_ARRAY = new Dpt[3];
        DPT_ARRAY[0] = new Dpt("C0");
        DPT_ARRAY[1] = new Dpt("S0");
        DPT_ARRAY[2] = new Dpt("A1");
    }

    public Dpt[] dptList() {
        Dpt[] list = new Dpt[DPT_ARRAY.length];
        for (int i = 0; i < DPT_ARRAY.length; i++) {
            list[i] = DPT_ARRAY[i];
        }
        return list;
    }

    public Dpt getDpt(String dptCd) {
        for (Dpt dpt : DPT_ARRAY) {
            String thisDptCd = dpt.getDptCd();
            if (dptCd.equals(thisDptCd)) {
                return dpt;
            }
        }
        return null;
    }
}
