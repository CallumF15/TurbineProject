public class TurbineModel {
	private String id;
	private String name;
	private ModelType type;

	TurbineModel(String id, String name, modelType modelType) {
		this.id = id;
		this.name = name;
		this.modelType = type;
	}

	public String getName() {
		return this.name;
	}

	public ModelType type() {
		return this.type;
	}
}