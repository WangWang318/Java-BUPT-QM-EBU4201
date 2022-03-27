public class Patterns{
	public void Pattern1(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public void Pattern2(int n){
		for(int i = n; i >= 0; i--){
			for(int j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		Patterns p = new Patterns();
		int n = Integer.parseInt(args[0]);
		p.Pattern1(n);
		p.Pattern2(n);
	}
}