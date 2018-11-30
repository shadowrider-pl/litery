package finbarre.litery;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;


public class BinaryTreeTest {

//
//	@Test
//	public void lit0Test(){
//		String fileName="lit0";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
	@Test
	public void lit1Test(){
		String fileName="lit1";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit1ocenTest(){
		String fileName="lit1ocen";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit2Test(){
		String fileName="lit2";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit2cTest(){
		String fileName="lit2c";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit2ocenTest(){
		String fileName="lit2ocen";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit3aTest(){
		String fileName="lit3a";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit3bTest(){
		String fileName="lit3b";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit3ocenTest(){
		String fileName="lit3ocen";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit4aTest(){
		String fileName="lit4a";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void lit4bTest(){
		String fileName="lit4b";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void lit4ocenTest(){
		String fileName="lit4ocen";
		 try {
				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
		        BinaryTree bt = new BinaryTree();
		        long wynik = bt.tree(in);
		        assertThat(wynik).isEqualTo(out);

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

//	@Test
//	public void lit5aTest(){
//		String fileName="lit5a";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit5ocenTest(){
//		String fileName="lit5ocen";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit5bTest(){
//		String fileName="lit5b";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit6bTest(){
//		String fileName="lit6b";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit6aTest(){
//		String fileName="lit6a";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit7aTest(){
//		String fileName="lit7a";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit7bTest(){
//		String fileName="lit7b";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit8aTest(){
//		String fileName="lit8a";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit8bTest(){
//		String fileName="lit8b";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}

//	@Test
//	public void lit9aTest(){
//		String fileName="lit9a";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit9bTest(){
//		String fileName="lit9b";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit10aTest(){
//		String fileName="lit10a";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
//
//	@Test
//	public void lit10bTest(){
//		String fileName="lit10b";
//		 try {
//				List<String> in = Files.readAllLines(Paths.get("src/test/java/finbarre/litery/in/"+fileName+".in"));
//				long out = Long.valueOf(Files.readAllLines(Paths.get("src/test/java/finbarre/litery/out/"+fileName+".out")).get(0));
//		        BinaryTree bt = new BinaryTree();
//		        long wynik = bt.tree(in);
//		        assertThat(wynik).isEqualTo(out);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
}
