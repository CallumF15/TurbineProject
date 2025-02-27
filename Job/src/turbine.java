import java.util.Random;

public abstract class Turbine implements Comparable<Turbine> {
	private String id;
	private String name;
	private TurbineModel model;
	private double output;
	private double Maximum_Output;

	Turbine(String Id, String name, TurbineModel Model, double Output, double maximumOutput) {
		this.id = Id;
		this.name = name;
		this.model = Model;
		this.Maximum_Output = maximumOutput; //maximum output that could be achieved under ideal conditions?
		this.output = mockCurrentOutput(this.Maximum_Output); //output -> actual output being generated
		//this.output = Output;
	}

	//Getters & Setters
	public abstract String getTurbineInfo();

	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public TurbineModel getModel() {
		return this.model;
	}
	public double getOutput() {
		return this.output;
	}
	public double getMaximumOutput() {
		return this.Maximum_Output;
	}

	//Methods

	//maxOutput was initially passed but wasn't used
	private double mockCurrentOutput(double maxOutput) {
		Random rand = new Random();
		return rand.nextDouble(0, maxOutput);
	}

	/**
	 * Compares this turbine's output to another turbine's output.
	 * @param other The other turbine to compare against.
	 * @return A negative integer if this turbine's output is less than the other turbine's,
	 * zero if they are equal, or a positive integer if this turbine's output is greater.
	 */
	@Override
	public int compareTo(Turbine other) {
		//return Double.compare(this.output, other.output);
		return (int)(this.output - other.getOutput());
	}
}