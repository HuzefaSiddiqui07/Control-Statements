// Nested If Statement

public class Nested_If01 {

	public static void main(String[] args) {
		int qc = 40;
		int gd = 30;
		int yt = qc+gd;
		int jk = qc-gd;
		int uv = yt*jk;
		
		if (yt<40) {
			System.out.println("qc is greater than yt");
			if (jk==gd) {
				System.out.println("jk is equal to gd");
				if (yt>uv) {
					System.out.println("yt is greater than uv");
				}
			}
		}
		else {
			System.out.println("yt is greater than qc, jk is less than gd, uv is greater than yt");
		}

	}

}
