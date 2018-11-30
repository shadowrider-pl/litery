package finbarre.litery;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/litery/litery/lit7a.in"));

			FirstMethod wl = new FirstMethod();

			long startTime = System.currentTimeMillis();
			long wynik = wl.firstMethod(in);
			System.out.println("Wynik  = " + wynik);
			long endTime = System.currentTimeMillis();
			System.out.println("That took " + (endTime - startTime) + " milliseconds");

			try (PrintWriter out = new PrintWriter("src/main/java/litery/litery/lit.out")) {
				out.println(wynik);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
