package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by Yevhen on 01.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        //readToStack();
        //workWithList();
        workWithBookList();
    }

    private void workWithBookList() {
        Author a1 = new Author(1, "Пушкин");
        Author a2 = new Author(2, "Шевченко");
        Author a3 = new Author(3, "Хемингуэй");

        Book b1 =  new Book(1, "Сказки", 100, a1);
        Book b2 =  new Book(2, "Сказки", 150, a1);
        Book b3 =  new Book(3, "Кобзар", 150, a2);
        Book b4 =  new Book(4, "Старик и море", 200, a3);

        List<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(b1,b2,b3,b4));
//        System.out.println(books);
        for (Book book : books) {
            System.out.println(book);
        }

        for (Book book : books) {
            if (book.getAuthor().equals(a2)) {
                System.out.println(book);
            }
        }
    }

    private void workWithList() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Murka"));
        animals.add(new Cat("Pushok"));
        animals.add(new Dog("Tuzik"));
        animals.add(new Dog("R2D2"));
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).voice();
        }
        System.out.println("-------------");
        for (Animal animal : animals) {
            animal.voice();
        }
        System.out.println("--------------");
        HashSet<Animal> set = new HashSet<>(animals);
        for (Animal animal : set) {
            animal.voice();
        }
        Cat myCat = new Cat("Pushok");
        if (set.contains(myCat)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        Set<String> strs = new HashSet<>();
        strs.add("BA");
        strs.add("BC");
        strs.add("AB");
        strs.add("BB");

        System.out.println(strs);

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
