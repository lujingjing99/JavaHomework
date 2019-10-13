
package bag;

public class Matrixmul {
	public static void main(String[] args) throws InterruptedException {
		int i,j,t = 0;
		int leng = 1500;
		long startTime,endTime;
		long a[][] = new long[leng][leng];
		long b[][] = new long[leng][leng];
	    //--------------�Ծ���A�;���B���г�ʼ��-------------  

	    for(i=0;i<leng;i++)     

	    {  

	        t=i+1;  

	        for(j=0;j<leng;j++)  

	        {  

	            a[i][j]=t++;  

	            b[i][j]=1;  

	        }  

	    }

		Matrix matrixone = new Matrix(a, b, 0, leng);

		Matrix matrixtwo = new Matrix(a, b, 1, leng);

		Thread threadone = new Thread(matrixone);

		Thread threadtwo = new Thread(matrixtwo);

		//-------------------���м���--------------------

		startTime = System.currentTimeMillis();

		threadone.start();

		threadtwo.start();

		threadone.join();

		threadtwo.join();

		endTime = System.currentTimeMillis();

        System.out.println("���н�� = " + (matrixone.getSum() + matrixtwo.getSum()));  

        System.out.println("����ʱ�� = " + (endTime - startTime)); 

        //-------------------���м���--------------------

        startTime = System.currentTimeMillis();

        Matrix matrixthree = new Matrix(a, b, 0, leng);

        matrixthree.serial();

        endTime = System.currentTimeMillis();

        System.out.println("���н�� = " + matrixthree.getSum());  

        System.out.println("����ʱ�� = " + (endTime - startTime)); 

	}

}

class Matrix implements Runnable{

 

	private long A[][];

	private long B[][];

	private long C[][];

	private int start ;

	private int end ;

	private long sum = 0 ;

	

	public Matrix(long a[][],long b[][],int st,int en){

		this.A = a;

		this.B = b;

		this.start = st;

		this.end = en;

		this.C = new long[en][en];

	}

	@Override

	public void run() {

		// TODO Auto-generated method stub

		int i,j,k;

	    for( i=start; i< end; i += 2)  

	    {  

	        for( j=0;j<end;j++)  

	        {  

	            C [i][j] = 0;  

	            for( k=0; k< end;k++)  

	            {  

	                C[i][j]+=A[i][k]*B[k][j];  

	            }  

	        }  

	    } 

	    

	    for( i=start; i<end; i+=2)  

	        for( j=0; j<end; j++)   

	            sum += C[i][j];  

	}

	

	public void serial() {  //���м���һ������ĳ˷�Ȼ�������

		int i,j,k;

	    for( i=0; i< end; i ++)  

	    {  

	        for( j=0;j<end;j++)  

	        {  

	            C[i][j]=0;  

	            for( k=0; k< end;k++)  

	            {  

	                C[i][j]+=A[i][k]*B[k][j];  

	            }  

	        }  

	    }  

	    for( i=0; i<end; i++)  

	        for( j=0; j<end; j++)   

	            sum += C[i][j];  

	}

	public long getSum() {

		return this.sum;

	}

}
