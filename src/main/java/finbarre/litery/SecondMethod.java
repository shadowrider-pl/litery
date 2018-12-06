package finbarre.litery;

import java.util.List;

public class SecondMethod {
	public long secondMethod(List<String> in) {

		int n = Integer.parseInt(in.get(0));
		String u = in.get(1);
		String w = in.get(2);

		char[] uChar = u.toCharArray();
		char[] wChar = w.toCharArray();

		long wynik=0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (uChar[i] == wChar[j]) {
					if (wChar[i] == wChar[j]) {
						break;
					}

					char tmp = wChar[j-1];
					wChar[j-1] = wChar[j];
					wChar[j] = tmp;

					wynik++;
					j=j-2;
					
					if(uChar[i] == wChar[i]) {
						break;
					}
					
				}
			}
		}
		

		return wynik;
	}
}
