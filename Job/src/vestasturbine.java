public class VestasTurbine {
	private String Id;
	private String Name;
	private TurbineModel Model;
	private double Output;
	private double Maximum_Output;

	VestasTurbine(String id, TurbineModel model, double Output, double MaximumOutput) {
		Id = id;
		Model = model;
		this.Output = Output;
		this.Maximum_Output = MaximumOutput;
	}
}