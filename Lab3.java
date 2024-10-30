package lab3;

public class Lab3 {

	public static String printStars(int n) {
		String x = "";

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				x += "-";
			}
			for (int k = 0; k < n - i; k++) {
				x += "*";
			}
			if (i < n - 1) {
				x += "\n";
			}
		}

		return x;

	}

	public static String expand(int num, int d) {
		String str = "";
		if (num >= 0 && d >= 0) {
			for (int i = 0; i < d; i++) {
				int dig = (int) (num % (Math.pow(10, d - i)));
				int ig = (int) dig / ((int) (Math.pow(10, d - i - 1)));

				if (i < d - 1) {
					str += ig + "*" + (int) Math.pow(10, d - i - 1) + " + ";
				} else {
					str += ig;
				}
			}
		} else {
			str += "Invalid";
		}
		return str;
	}

	public static String getSeqStat(int ft, int d, int n) {
		int sum = 0;
			int prod = 1;
			String answer = "";
		String seq = "";
		for (int i=1;i<=n; i++) {
			int k = ft + (i-1)*d;
			
		sum= sum +k;
				prod=prod*k;
			
			seq+=k+", ";
				answer +="[<"+seq.substring(0,seq.length()-2)+">: "+sum+", "+prod+"]; ";
		}
		return "{"+answer.substring(0,answer.length()-2)+"}";
	}

	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String res = "<";
		int var1 = 0;
		int var2 = 0;
		
		while (var1<n1 || var2<n2){
			if(var1<n1) {
			int t1 = ft1+(var1)*d1;
						res +=t1;
					var1++;
				if (var1<n1||var2<n2) {
					res	 +=", ";
				}
			}
			if (var2<n2) {
			int t2 = ft2 + (var2)*d2;
					res +=t2;
					var2++;
				if(var1<n1 || var2<n2) {
					  res+=", ";
				}
			}
		
		}
		
		res += ">";
		return res;
		
		
			
	}

}
