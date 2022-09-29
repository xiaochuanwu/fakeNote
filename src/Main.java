import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

/**
 * @author Adam Wu
 * @date 2022/9/29
 */
public class Main {
    public static void main(String[] args) {
        File file1 = new File("src/pages/学生工作管理信息系统 _1.html");
        File file2 = new File("src/pages/学生工作管理信息系统 _2.html");
        File file3 = new File("D:\\tem_1.html");
        File file4 = new File("D:\\tem_2.html");
        String name = "name";
        String studentNumber = "studentNumber";
        String dateOfApplication = "dateOfApplication";
        String qDate = "qDate";
        String Gender = "Gender";
        String Grade = "Grade";
        String Major = "Major";
        String idNumber = "idNumber";
        String College = "College";
        String Class = "Class";
        String pNumber = "pNumber";
        String startDate = "startDate";
        String endDate = "endDate";
        String Teacher = "Teacher";
        String reviewDate = "reviewDate";

        System.out.println(file1.isFile());
        System.out.println(file2.isFile());
        Scanner scanner = new Scanner(System.in);
        copyFile(file1, file3);
        copyFile(file2, file4);
        System.out.println("请输入姓名");
        name = scanner.nextLine();
        System.out.println("请输入学号");
        studentNumber = scanner.nextLine();
        System.out.println("请输入申请日期 格式为年-月-日 时:分:秒");
        dateOfApplication = scanner.nextLine();
        System.out.println("请输入请假天数");
        qDate = scanner.nextLine();
        System.out.println("请输入性别");
        Gender = scanner.nextLine();
        System.out.println("请输入年级");
        Grade = scanner.nextLine();
        System.out.println("请输入专业");
        Major = scanner.nextLine();
        System.out.println("请输入身份证号");
        idNumber = scanner.nextLine();
        System.out.println("请输入学院");
        College = scanner.nextLine();
        System.out.println("请输入班级");
        Class = scanner.nextLine();
        System.out.println("请输入联系方式");
        pNumber = scanner.nextLine();
        System.out.println("请输入开始日期 格式为年-月-日 时:分:秒");
        startDate = scanner.nextLine();
        System.out.println("请输入结束日期 格式为年-月-日 时:分:秒");
        endDate = scanner.nextLine();
        System.out.println("请输入辅导员");
        Teacher = scanner.nextLine();
        System.out.println("请输入审核日期 格式为年-月-日 时:分:秒");
        reviewDate = scanner.nextLine();
        modifyFileContent(file3, "露西", name);
        modifyFileContent(file3, "studentNumber", studentNumber);
        modifyFileContent(file3, "Date of application", dateOfApplication);
        modifyFileContent(file3, "qDate", qDate);
        modifyFileContent(file4, "Days", qDate);
        modifyFileContent(file4, "露西", name);
        modifyFileContent(file4, "studentNumber", studentNumber);
        modifyFileContent(file4, "Gender", Gender);
        modifyFileContent(file4, "Grade", Grade);
        modifyFileContent(file4, "Sfos", Major);
        modifyFileContent(file4, "idNumber", idNumber);
        modifyFileContent(file4, "College", College);
        modifyFileContent(file4, "Class", Class);
        modifyFileContent(file4, "pNumber", pNumber);
        modifyFileContent(file4, "startDate", startDate);
        modifyFileContent(file4, "endDate", endDate);
        modifyFileContent(file4, "Teacher", Teacher);
        modifyFileContent(file4, "reviewDate", reviewDate);
        System.out.println("假条生成成功，目录为D盘根目录");
    }

    public static void copyFile(File source, File dest) {
        try {
            FileUtils.copyFile(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean modifyFileContent(File file, String oldstr, String newStr) {
        List<String> list = null;
        try {
            list = FileUtils.readLines(file, "UTF-8");
            for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i).replaceAll(oldstr, newStr);
                list.remove(i);
                list.add(i, temp);
            }
            FileUtils.writeLines(file, "UTF-8", list, false);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static boolean modifyFileContent(String filePath, String oldstr, String newStr) {
        return modifyFileContent(new File(filePath), oldstr, newStr);
    }
}