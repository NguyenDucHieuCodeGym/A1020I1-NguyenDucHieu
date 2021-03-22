package b16_io_test_file;

import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException {
        Student student = new Student(777, "Nguyen Van Y", "12/12/2012");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(
                "src/b16_io_test_file/student_nguon.csv")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(
                "src/b16_io_test_file/student.csv"), true));
        String lineRead;
        String[] lineReadArray;
        Student studentRead;
        while ((lineRead = bufferedReader.readLine()) != null) {
            bufferedWriter.write(lineRead);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
