package kr.re.etri;

import net.sf.javaml.core.DenseInstance;
import net.sf.javaml.core.Instance;
import net.sf.javaml.distance.fastdtw.dtw.DTW;
import net.sf.javaml.distance.fastdtw.timeseries.TimeSeries;

public class DTWMain {
	public static void main(String[] args) {
		double[] values1 = new double[]{1,2,3,4,5,6,7,8,9,10};
		double[] values2 = new double[]{1,2,3,4,5,5,4,3,2,1};
		double[] values3 = new double[]{10,9,8,7,6,5,4,3,2,1};
		
		Instance instance1 = new DenseInstance(values1);
		Instance instance2 = new DenseInstance(values2);
		Instance instance3 = new DenseInstance(values3);

		TimeSeries ts1 = new TimeSeries(instance1);
		TimeSeries ts2 = new TimeSeries(instance2);
		TimeSeries ts3 = new TimeSeries(instance3);
		
		DTW dtw = new DTW();
		double rs1 = dtw.getWarpDistBetween(ts1, ts3);
		System.out.println(rs1);
		
	}
}
