//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//import org.apache.commons.io.FileUtils;
//public class fileUtils {
//    public  boolean modifyFileContent(File file, String oldstr, String newStr) {
//        List<String> list = null;
//        try {
//            list = FileUtils.readLines(file, "UTF-8");
//            for (int i = 0; i < list.size(); i++) {
//                String temp = list.get(i).replaceAll(oldstr, newStr);
//                list.remove(i);
//                list.add(i, temp);
//            }
//            FileUtils.writeLines(file, "UTF-8", list, false);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return true;
//    }
//
//    public  boolean modifyFileContent(String filePath, String oldstr, String newStr) {
//        return modifyFileContent(new File(filePath), oldstr, newStr);
//    }
//
//}


