import java.util.ArrayList;
import java.util.Collections;

/**
 * Changed this class to perform calculations and manipulate data related to windfarm objects.
 */
public class WindFarmUtils {

    /** (#1 problem)
     * -Calculates the sum of each turbine maximum output within a windfarm.
     *  @param windFarm object
     *  @return The double value with the highest output.
     */
    public static double maximumOutputSum(WindFarm windFarm) {
        double output = 0.0;

        for (Turbine turbine : windFarm.getAllTurbines()) {
            output += turbine.getMaximumOutput();
        }

        return output;
    }

    /** (#2 problem)
     * - Calculates the sum of maximum output for all turbines across all Windfarms.
     *  @param windFarms arrayList object
     *  @return The double value with the highest output.
     */
    public static double allWindFarmsMaxOutput(ArrayList<WindFarm> windFarms) {
        double output = 0.0;

        for (WindFarm windFarm : windFarms)
            for (Turbine turbine : windFarm.getAllTurbines()) {
                output += turbine.getMaximumOutput();
            }

        return output;
    }

    /**
     * Finds the turbine with the highest current output from a list of turbines.
     * @param turbines An ArrayList of Turbine objects to be evaluated.
     * @return The Turbine object with the highest output, or null if the list is empty.
     */
    public static Turbine getHighestOutputForTurbine(ArrayList<Turbine> turbines) {
        if(turbines == null || turbines.isEmpty()) return null;
        return Collections.max(turbines);
    }

    /** (prior name: highestCurrentOutputForWindFarm)
     * Finds the turbine with the highest current outputting turbine within a windfarm.
     * @param windFarm object
     * @return The double value with the highest output.
     */
    public static double getHighestOutputForWindFarm(WindFarm windFarm) {
        return getHighestOutputForTurbine(windFarm.getAllTurbines()).getOutput();
    }

    /**
     * Finds the turbine with the highest maximum output within a wind farm
     * @param windFarm object
     * @return The Turbine object with the highest maximum output
     */
    public static double getHighestMaximumOutputForWindFarm(WindFarm windFarm) {
        return getHighestMaximumOutputForTurbines(windFarm.getAllTurbines()).getMaximumOutput();
    }

    /**
     * Finds the turbine with the highest maximum current output from a list of turbines.
     * @param turbines An ArrayList of Turbine objects to be evaluated.
     * @return The Turbine object with the highest output, or null if the list is empty.
     */
    public static Turbine getHighestMaximumOutputForTurbines(ArrayList<Turbine> turbines) {
        if(turbines == null || turbines.isEmpty()) return null;

        Turbine maximumTurbine = turbines.getFirst();

        for (int i = 1; i < turbines.size(); i++) { // Start loop at 1 since we're getting the first
            if (turbines.get(i).getMaximumOutput() > maximumTurbine.getMaximumOutput()) {
                maximumTurbine = turbines.get(i);
            }
        }

        return maximumTurbine;
    }

    /**
     * (Problem 5)
     */
    public static TurbineState isTurbineRunningOrUnderPerforming(Turbine turbine){
        return TurbineStateManager.determineTurbineState(turbine);
    }

    /** #5 alternative
     * - Implemented a different way of handling the Logic than the above method.
     * - Could also modify enum to include overridable methods which return state.
     */
    public static TurbineState isTurbineRunningOrUnderPerformingAlternate(Turbine turbine) {
        ModelType state = turbine.getModel().getModelType();
        double turbineOutput = turbine.getOutput();

        if (turbineOutput < 100) {
            switch (state) {
                case BIG:
                    return TurbineState.UNDER_PERFORMING;
                case MEDIUM:

                    break;
                case SMALL:
                    return TurbineState.RUNNING;

            }
        } else
        {
            switch (state) {
                case BIG:
                    return TurbineState.OFF;
                case MEDIUM:

                    break;
                case SMALL:
                    return TurbineState.UNDER_PERFORMING;

            }
        }
        return TurbineState.OFF;
    }
}