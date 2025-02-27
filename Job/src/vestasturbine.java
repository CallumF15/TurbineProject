public class VestasTurbine extends Turbine {

	VestasTurbine(String id, String name, TurbineModel model, double Output, double MaximumOutput) {
		super(id, name, model, Output, MaximumOutput);
	}

	// * 3 - Using all wind farms print out the wind farm name followed by their turbine details.
	// - For vestas turbines we would like to see the name and current output only.
	// - We would like to see the turbines within the windfarm ordered by current output in descending order

	@Override
	public String getTurbineInfo() {
		String turbineName = super.getName();
		StringBuilder output = new StringBuilder(turbineName + "\n");

		output.append(" - Output: ")
				.append(super.getOutput())
				.append("\n");

		return output.toString();
	}
}