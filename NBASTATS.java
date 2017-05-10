
public class NBASTATS {

	public static void main(String[] args) {
		double[] rebound = new double[3];
		rebound[0] = 1.0;
		rebound[1] = 6.0;
		rebound[2] = 3.5;
		
		double sum = rebound[0]+rebound[1]+rebound[2];
		double avg = sum/3;
		System.out.println("Average amount of rebound for top 3%: "+avg);
		
		
		
		double[] pts = new double[15];
		
		pts[0] = 4.0;
		pts[1] = 6.7;
		pts[2] = 3.0;
		pts[3] = 3.2;
		pts[4] = 1.3;
		pts[5] = 15.0;
		pts[6] = 11.7;
		pts[7] = 3.2;
		pts[8] = 22.7;
		pts[9] = 4.7;
		pts[10] = 2.8;
		pts[11] = 8.7;
		pts[12] = 7.3;
		pts[13] = 11.5;
		pts[14] = 12.7;
		
		sum =0.0;
		for(int i=0;i<pts.length;i++){
			sum = sum + pts[i];
			
		}
		
		avg = sum/15;
		System.out.println("Average Points scored by Team: "+avg);
		
		
		
		

	}

}
