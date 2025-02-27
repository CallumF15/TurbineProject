import java.util.ArrayList;

public class WindFarm {
	private String id = "";
	private String name = "";
	private String Longitude = "";
	private String Latitude = "";
	private ArrayList<Turbine> turbines;
	private WindFarmUtils utils; //maybe useless decide to remove

	WindFarm(String id, String name, String longitude, String latitude) {
		this.id = id;
		this.name = name;
		this.Longitude = longitude;
		this.Latitude = latitude;

		this.utils = new WindFarmUtils();
		this.turbines = new ArrayList<Turbine>();
	}

	//Getters & Setters
	public String getName() {
		return this.name;
	}
	public WindFarmUtils getUtils() {
		return this.utils;
	}
	public ArrayList<Turbine> getAllTurbines() {
		return this.turbines;
	}

	//Methods
	public void addTurbine (Turbine turbine) {
		turbines.add(turbine);
	}
	public void removeTurbine (Turbine turbine) {
		turbines.remove(turbine);
	}
}