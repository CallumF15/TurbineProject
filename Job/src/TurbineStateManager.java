import java.util.Map;

/**
 * Manages the state of a turbine based on its output and model type.
 */
public class TurbineStateManager
{
    /**
     * Map defining turbine states when output is below 100.
     * - BIG and MEDIUM turbines are considered UNDER_PERFORMING.
     * - SMALL turbines are considered RUNNING.
     * - (Medium turbines states are subject to change)
     */
    private static final Map<ModelType, TurbineState> LOW_OUTPUT_STATES = Map.of(
            ModelType.BIG, TurbineState.UNDER_PERFORMING,
            ModelType.MEDIUM, TurbineState.UNDER_PERFORMING,
            ModelType.SMALL, TurbineState.RUNNING
    );

    /**
     * Map defining turbine states when output is 100 or higher.
     * - BIG and MEDIUM turbines are considered RUNNING.
     * - SMALL turbines are considered UNDER_PERFORMING.
     * - (Medium turbines states are subject to change)
     */
    private static final Map<ModelType, TurbineState> HIGH_OUTPUT_STATES = Map.of(
            ModelType.BIG, TurbineState.OFF,
            ModelType.MEDIUM, TurbineState.RUNNING,
            ModelType.SMALL, TurbineState.UNDER_PERFORMING
    );

    /**
     * Determines the state of a given turbine based on its current output.
     * @param turbine The turbine whose state needs to be determined.
     * @return The corresponding {@link TurbineState} based on the turbine's model type and output.
     */
    public static TurbineState determineTurbineState(Turbine turbine) {
        return turbine.getOutput() < 100 ?
                LOW_OUTPUT_STATES.getOrDefault(turbine.getModel().getModelType(), TurbineState.OFF) :
                HIGH_OUTPUT_STATES.getOrDefault(turbine.getModel().getModelType(), TurbineState.OFF);
    }
}