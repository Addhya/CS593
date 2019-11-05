import java.io.*;

class CI{

	float interst_calc(float prin, float rate) {
		return prin*rate;
	}

	static void line() {
		for(int i = 0; i<66;i++)
			System.out.print('=');
		System.out.println();
	}


	void disp(float prin, float rate, float n,float A) {
		System.out.println("||\t" + prin + "\t||\t" + rate + "\t||\t" + n + "\t||\t" + A + "\t||");
	}

	public static void main(String args[]){
		line();
		CI obj = new CI();
		System.out.println("||Principal||Rate||Number of Year||Acc. Interest||"); 
		line();
		float prin = Float.parseFloat(args[0]);
		float rate = Float.parseFloat(args[1]);
		float n = Float.parseFloat(args[2]);
		obj.disp(prin,rate,0,0);
		for(int i = 1; i <= n; i++){
			obj.disp(prin,rate,i,obj.interst_calc(prin,rate));
			prin += obj.interst_calc(prin,rate);
		}
		line();
	}
}	