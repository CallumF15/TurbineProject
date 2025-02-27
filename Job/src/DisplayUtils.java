import java.util.ArrayList;
import java.util.Collections;

/**
 *  Changed this class to better represent its name
 *  Display Utilty should only display information
 */
public class DisplayUtils {

    /** (Problem 3-3.3)
     * - This method outputs the details for each turbine by windfarm.
     * - details are dependent on what type of turbine.
     * - Nordex (name, max output, output )
     * - Vestas (name, output).
     */
    public static String displayWindFarmTurbineDetails(ArrayList<WindFarm> windFarms) {
        StringBuilder output = new StringBuilder();

        for (WindFarm windFarm : windFarms) {
            output.append(windFarm.getName()).append("\n"); //
            ArrayList<Turbine> turbines = windFarm.getAllTurbines();

            for (Turbine turbine : turbines) {
                output.append(turbine.getTurbineInfo());
            }
            output.append("\n"); // Add space between wind farms
        }

        return output.toString();
    }

    /** (problem 3.4)
     * Retrieves the details of all turbines and sorts by output in either ascending/descending order.
     * @param turbines An ArrayList of Turbine objects to be sorted and displayed.
     * @param ascending A boolean value to determine list sort order
     * @return An ArrayList of Strings containing the names and outputs of turbines,
     *         sorted from either lowest to highest output or vice versa dependent on boolean.
     */
    public static ArrayList<String> displayAllTurbineDetails(ArrayList<Turbine> turbines, boolean ascending) {
        // Sort based on the boolean flag
        Collections.sort(ascending ? turbines : turbines.reversed());

        ArrayList<String> output = new ArrayList<>();
        output.add("Turbines Sorted by Output (" + (ascending ? "Ascending" : "Descending") + "):\n");

        for (Turbine turbine : turbines) {
            output.add(turbine.getName() + " - Output: " + turbine.getOutput() + "\n");
        }

        return output;
    }

    public static String displayWindFarmDetails(ArrayList<WindFarm> windFarms) {
        return null;
    }
}