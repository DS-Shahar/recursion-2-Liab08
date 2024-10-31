package Explorer;

public class Main {
	
	
	static boolean f7(int n,int r) {
		if(n-r==0 ) {
			return true;
		}
		if(n-r<0) {
			return false;
		}
		n=n-r;
		return f7(n,r);
		
	}
	
	static boolean f8(int n,int a) {
		if(n==1) {
			return true;
		}
		if(a==2 && f7(n,a)==false) {
			return true;
		}
		if(f7(n,a)==true) {
			return false;
		}
		return f8(n,a-1);
	}
	
	static int q14(int i,int [] a) {
		if(i==0) {
			return a[0];
		}
		return a[i]+q14(i-1,a);
	}
	
	
	static int q15(int i,int [] a) {
		if(i==0) {
			if(a[0]>0) {
				return 1;
			}
			else {
			   return 0;
			}
		}
		if(a[i]>0) {
			return 1+q15(i-1,a);
		}
		return 0+q15(i-1,a);
	}
	
	
	static int q16(int n,int [] a,int i) {
		if(i==0 && a[i]!=n) {
			return -1;
		}
		if(a[i]==n ) {
			return i;
		}
		return q16(n,a,i-1);
	}
	
	static boolean q17(int [] a,int i) {
		if(i+1==a.length) {
			return true;
		}
		if(a[i]>a[i+1]) {
			return false;
		}
		return q17(a,i+1);
	}
	
	static boolean q18(int [] a,int i) {
		if(i+1==a.length) {
			return true;
		}
		if(f8(a[i],a[i]-1)==true) {
			return false;
		}
		return q18(a,i+1);
	}
	
	static int q19(int [][] a,int n,int i) {
		if(i==-1) {
			return 0;
		}
		if(q16(n,a[i],a[i].length-1)==-1) {
			return q19(a,n,i-1);
		}
		return q19(a,n,i-1)+1;
	}
	
	static boolean f20(int [] a,int i,int j) {
		if(i+1==j-1) {
			return true;
		}
		if(i+1==j) {
			return true;
		}
		if(a[i+1]!=a[j-1]) {
			return false;
		}
		return f20(a,i+1,j-1);
	}
	
	static boolean q20(int [] a) {
		int i = (int) ((a.length-1) * Math.random());
		int j = (int) ((a.length-1)* Math.random());
		if(i==j) {
			return false;
		}
		if(i>j) {
			return f20(a,j+1,i-1);
		}
		return f20(a,i+1,j-1);
	}
	
    public static void main(String[] args) {
    	int [] a= {3,3,3,3,3,3,3};
    	System.out.println(q20(a));
    }

}

