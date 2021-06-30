package hello;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWorld {

	public static void main(String[] args) {

		String survivingValue = "";
		int count = 0;
		while (!StdIn.isEmpty()) {
			String value = StdIn.readString();
			count++;
			if (StdRandom.bernoulli(1 / (double) (count)))
				survivingValue = value;
		}
		StdOut.println(survivingValue);
	}
}
