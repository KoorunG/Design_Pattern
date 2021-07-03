package execution_around;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MakeProcessFile {
    public static String processFile(BufferedReaderProcessor p) throws IOException{
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        try(br;fr){
            return p.process(br);
        }
    }
}
