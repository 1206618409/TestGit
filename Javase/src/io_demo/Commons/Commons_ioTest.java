package io_demo.Commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.util.Collection;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-07 13:09
 **/
public class Commons_ioTest {
    public static void main(String[] args) {
        long length = FileUtils.sizeOf(new File("baidu.html"));
        System.out.println(length);
        Collection<File> files = FileUtils.listFiles(new File("c:"), EmptyFileFilter.NOT_EMPTY, null);
        for (File file:files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}


