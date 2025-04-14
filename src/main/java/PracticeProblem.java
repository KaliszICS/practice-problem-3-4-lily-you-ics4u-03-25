public class PracticeProblem {

	public static void main(String args[]) {
		int sequence[] = recaman(6);
		for(int i = 0; i < sequence.length; i++){
			System.out.println(sequence[i]);
		}

	}

	public static int[] recaman(int n){
		if(n <= 0){
			return new int[]{};
		}
		int[] sequence = new int[n];


		
		recamanHelper(sequence, n);
		

		return sequence;
	}

	public static void recamanHelper(int[] seq, int num){
		if(num == 1){
			seq[num - 1] = 1;
			return;
		}
		
		recamanHelper(seq, num - 1);

		int num2 =  seq[num - 2] - num;

		boolean numIncluded = false;
		for(int j = 0; j < num; j++){
			if(num2 == seq[j]){
				numIncluded = true;
			}
		}

		if(num2 > 0 && !numIncluded){
			seq[num - 1] = num2;
		}
		else{
			seq[num - 1] = seq[num - 2] + num;
		}
		
	}

}
