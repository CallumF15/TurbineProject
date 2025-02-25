import java.util.Random;

public abstract class Turbine implements Comparable<Double> {
	private String id;
	private String name;
	private TurbineModel model;
	public double output;
	public double Maximum_Output;

	Turbine(String Id, TurbineModel Model, double maximumOutput) {
		this.id = Id;
		this.model = Model;
		this.Maximum_Output = maximumOutput;
		
		this.output = mockCurrentOutput(this.Maximum_Output);
	}
	
	private double mockCurrentOutput(double maxOutput) {
		Random rand = new Random();
		return rand.nextDouble(0, 5000);
	}
	
	public abstract String getTurbineInfo();

	public TurbineModel getModel() {
		return this.model;
	}
	
	@Override
	public int compareTo(Double value) {
		return 0;
	}
}