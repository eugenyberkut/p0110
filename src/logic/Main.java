package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Yevhen on 01.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        //readToStack();
        
    }

    private void readToStack() {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            Deque<String> stack = new ArrayDeque<>();
            String line;
            while ((line = reader.readLine())!=null) {
                stack.push(line);
            }
            try (PrintWriter writer = new PrintWriter("file.out")) {
                while (!stack.isEmpty()) {
                    String str = stack.pop();
                    writer.println(str);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
