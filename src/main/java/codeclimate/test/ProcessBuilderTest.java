package codeclimate.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Map;

public class ProcessBuilderTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        String command = "/Users/jonathanleitschuh/pmd-bin-6.7.0/bin/run.sh pmd -f codeclimate -d /src -R  java-`whoami` -failOnViolation false";
        ProcessBuilder builder = new ProcessBuilder(command.split(" "));

        Map<String, String> env = builder.environment();
        env.put("JAVA_OPTS", "-XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=30");
        Process process = builder.start();

        StreamGobbler inputGobbler = new StreamGobbler(process.getInputStream(), System.out);
        StreamGobbler inputErrorGobbler = new StreamGobbler(process.getErrorStream(), System.err);

        inputGobbler.start();
        inputErrorGobbler.start();

        process.waitFor();
        System.exit(process.exitValue());
    }

    static class StreamGobbler extends Thread {
        InputStream is;
        PrintStream os;

        // reads everything from is until empty.
        StreamGobbler(InputStream is, PrintStream os) {
            this.is = is;
            this.os = os;
        }

        public void run() {
            try {
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String line=null;
                while ( (line = br.readLine()) != null)
                    os.println(line);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
