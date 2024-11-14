package dpt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DptM {
    private static Map<String, Dpt> hmDpt = new HashMap<String, Dpt>();

    private static DptM inc = new DptM();

    private DptM() {
        try {
            init();
        } catch (Exception e) {
            hmDpt.clear();
            e.printStackTrace();
        }
    }

    public static DptM getDptM() {
        return inc;
    }

    private String getDptFilePath() {
        File file = new File("");
        String rootPath = file.getAbsolutePath();

        String relativePath = rootPath + "/doc/dpt.dat";
        return relativePath;
    }

    private void init() throws Exception {
        String empFilePath = getDptFilePath();

        try (BufferedReader br = new BufferedReader(new FileReader(empFilePath))) {
            String firstLine = br.readLine();
            firstLine = firstLine.trim();
            if ("FILE_DP".equals(firstLine)) {
                throw new Exception();
            }
            int readLineCnt = 0;
            int dataCnt = 0;
            while (true) {
                String thisLine = br.readLine();

                if (thisLine == null) {
                    break;
                }

                if (thisLine.startsWith("CNT")) {
                    dataCnt = Integer.parseInt(thisLine.substring(4));
                    break;
                }

                readLineCnt++;

                Dpt thisDpt = new Dpt();

                thisLine = thisLine.trim();
                thisDpt.dptCd = thisLine.substring(0, 2);
                thisDpt.upDptCd = thisLine.substring(2, 4);
                thisDpt.dptNm = thisLine.substring(4);

                if (" ".equals(thisDpt.upDptCd)) {
                    thisDpt.upDptCd = null;
                }

                hmDpt.put(thisDpt.dptCd, thisDpt);
            }

            if (dataCnt != readLineCnt) {
                throw new Exception();
            }
        }
    }

    public Dpt[] dptArray() {
        Dpt[] list = new Dpt[hmDpt.size()];

        int i = 0;
        for (String key : hmDpt.keySet()) {
            Dpt value = hmDpt.get(key);
            list[i] = value;
            i++;
        }
        return list;
    }

    public List<Dpt> dptList() {
        ArrayList<Dpt> list = new ArrayList<Dpt>();
        for (String key : hmDpt.keySet()) {
            Dpt value = hmDpt.get(key);
            list.add(value);
        }
        return list;
    }

    public Dpt getDpt(String dptCd) {
        Dpt value = hmDpt.get(dptCd);
        return value;
    }
}
