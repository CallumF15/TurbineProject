public class TurbineModel {
	private String id;
	private String name;
	private ModelType modelType;

	TurbineModel(String id, String name, ModelType modelType) {
		this.id = id;
		this.name = name;
		this.modelType = modelType;
	}

	public String getId() { return this.id;}
	public String getName() {
		return this.name;
	}
	public ModelType getModelType() {
		return this.modelType;
	}
}