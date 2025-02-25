public class NordexTurbine {
	private String Id;
	private String Name;
	private TurbineModel Model;
	private double Output;
	private double Maximum_Output;

	NordexTurbine(String id, TurbineModel model, double Output, double MaximumOutput) {
		Id = id;
		Model = model;
		this.Output = Output;
		this.Maximum_Output = MaximumOutput;
	}
}