package test;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Test02 {
    @Test
    public void t1() {
        String absolutePath = "C:\\public\\erp\\doc\\emplist.txt";

        System.out.println(absolutePath);

        File file = new File("");
        String rootPath = file.getAbsolutePath();

        String relatibePath = rootPath + "/doc/emplist.txt";
        System.out.println(relatibePath);
    }

    private String getFilePath() {
        File file = new File("");
        String rootPath = file.getAbsolutePath();

        String relativePath = rootPath + "/doc";
        return relativePath;
    }

    @Test
    public void t02() {
        System.out.println(File.separatorChar);

        String filePath = getFilePath();
        String sampleFilePath = filePath + File.separatorChar + "sample1.txt";

        File file = new File(sampleFilePath);

        System.out.println(file.isFile());

        System.out.println(file.getAbsolutePath());

        System.out.println(file.length());

        System.out.println(file.lastModified());

        String sample1Path = filePath;
        File dir = new File(sample1Path);
        File[] dirs = dir.listFiles();
        for (File thisFile : dirs) {
            System.out.println(thisFile.isDirectory());
            System.out.println(thisFile.getAbsolutePath());
        }
    }

    @Test
    public void t3() {
        
    }
}
