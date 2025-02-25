import java.util.ArrayList;

public class WindFarm {
	private String id = "";
	private String name = "";

	private String Longitude = "";
	private String Latitude = "";

	private ArrayList<NordexTurbine> turbines;

	private WindFarmUtils utils = new WindFarmUtils();

	WindFarm(String id, String name, String longitude, String latitude) {
		this.id = id;
		Longitude = longitude;
		Latitude = latitude;
		this.name = name;

		this.utils = new WindFarmUtils();
	}
}