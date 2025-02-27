public class NordexTurbine extends Turbine {

	NordexTurbine(String id,  String name, TurbineModel model, double Output, double MaximumOutput) {
		super(id, name, model, Output, MaximumOutput);
	}

	// * 3 - Using all wind farms print out the wind farm name followed by their turbine details.
	// - For nordex turbines we would like to see the name, maximum output and current output.
	// - We would like to see the turbines within the windfarm ordered by current output in descending order

	//Display info about turbine
	@Override
	public String getTurbineInfo() {
		String turbineName = super.getName();
		StringBuilder output = new StringBuilder(turbineName + "\n");

			output.append(" - Maximum output: ")
					.append(super.getMaximumOutput())
					.append("\n")
					.append(" - Output: ")
					.append(super.getOutput())
					.append("\n");

		return output.toString();
	}
}
