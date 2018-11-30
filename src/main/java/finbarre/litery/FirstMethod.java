package finbarre.litery;

import java.util.List;

public class FirstMethod {
	public long firstMethod(List<String> in) {

		int n = Integer.parseInt(in.get(0));
		String u = in.get(1);
		String w = in.get(2);
		int result = 0;

		StringBuilder sbu = new StringBuilder(u);
		StringBuilder sbw = new StringBuilder(w);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (sbu.charAt(i) == sbw.charAt(j)) {
					if (j != 0) {
						result = result + j;
					}
					sbw.deleteCharAt(j);
					break;
				}
			}
		}
		return result;
	}
}
