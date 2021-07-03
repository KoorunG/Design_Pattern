package execution_around;

import java.io.BufferedReader;
import java.io.IOException;

public class Test {
    
    public static void main(String[] args) throws IOException {
        String oneLine = MakeProcessFile.processFile((BufferedReader br) -> br.readLine());         // 한줄 읽기
        String twoLine = MakeProcessFile.processFile((BufferedReader br) -> br.readLine() + br.readLine());     // 두줄 읽기

        System.out.println(oneLine);
        System.out.println(twoLine);
    }
}
