class Aptitude{


public static void main (String[] args){
	
	
	String num1=args[0];
	int r=Integer.parseInt(num1);
	String num2=args[0];
	int c=Integer.parseInt(num2);
	
	Aptitude pd=new Aptitude();
	pd.primaryDiagonals(r,c);

}
	 public void primaryDiagonals(int r, int c){
		
	for(int row=1;row<=r;row++){
	//System.out.print("\n");
	for(int col=1;col<=c;col++){
		if(row==col){
				System.out.print(row + "" + col + "\t");
		}else{
			System.out.print(" ");
		}

	}
		
	
	}
	}
}
