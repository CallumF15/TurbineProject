import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
         * !IMPORTANT! Feel free to work in the browser to complete the task. However,
         * closing the browser will result in loss of progress.
         *
         * We recommend either saving your progress locally via the save button and re
         * uploading the files if you have to step away OR downloading each of the files
         * and working in an IDE of your choice and re uploading.
         *
         * Once complete - hit the share button and send us the new generated link with
         * a months life span. DO NOT RESEND US THE SAME LINK - this will not share your
         * progress and only share the same details we have shared with you!
         *
         * Feel free to create and pass any objects to the DisplayUtils class needed to
         * fulfil the tasks below. You may also need to add fields to objects as necessary :).
         */

        /*-----------------------------------------------------------------------------------------*/

        //* you will be evaluated not only on the tasks below but also how clean the
        //  rest of the code base is, don't be shy to refactor or change files as necessary!

        // * Create 3 wind farms with 3 turbines each and complete the following:

        // * 1 - Calculate the sum of the maximum output for all turbines
        // within a wind farm and display this.

        // * 2 - Display the sum of the maximum output for all turbines across all wind farms.

        // * 3 - Using all wind farms print out the wind farm name followed by their turbine details.
        // - For nordex turbines we would like to see the name, maximum output and current output.
        // - For vestas turbines we would like to see the name and current output only.
        // - We would like to see the turbines within the windfarm ordered by current output in descending order

        // * 4 - Display the highest current output of any turbine within a wind farm

        // * 5 - The isTurbineRunningOrUnderPerforming method in DisplayUtils class uses
        // nested boolean logic to control whether a turbine is running or underperforming.
        // This method is a bit of a mess and we would like to see how you clean it up.

        // Here's some objects to get you started :)
        // turbo model types: BIG, MEDIUM, SMALL,
        TurbineModel model1 = new TurbineModel("1", "WTG", "BIG");
        TurbineModel model2 = new TurbineModel("1", "WTG", modelType.small);
        TurbineModel model3 = new TurbineModel("1", "WTG", "BIG");

        Turbine turbine1 = new Turbine("1", model1, 3400.67);
        tur

       

        WindFarm windFarm1 = new WindFarm("1", "Farmy McFarmFace", "56.185443", "-3.767525");
        WindFarm windFarm2 = new WindFarm("2", "Turbo Farm", "56.185443", "-3.767525");
        WindFarm windFarm3 = new WindFarm("3", "Speed Farm", "56.185443", "-3.767525");


        ArrayList<WindFarm> windFarms = new ArrayList<WindFarm>();
        windFarms.add(windFarm1);
        windFarms.add(windFarm2);
        windFarms.add(windFarm3);



        // Output
        double windFarmMaximumOutput = DisplayUtils.maximumOutputSum(windFarm1);
        System.out.println(windFarmMaximumOutput);

        double maximumOutputForAllWindFarms = DisplayUtils.allWindFarmsMaxOutput(windFarms);
        System.out.println(maximumOutputForAllWindFarms);

        String formattedString = DisplayUtils.turbinesByWindfarms(windFarms);
        System.out.println(formattedString);

        double highestOutputInWindfarm = DisplayUtils.highestCurrentOutputForWindFarm(windFarm1);
        System.out.println(highestOutputInWindfarm);

        DisplayUtils.isTurbineRunningOrUnderPerforming(turbine1);

    }

    public static class DisplayUtils {

        public static double maximumOutputSum(WindFarm windFarm) {
            double output = 0.0;

            return output;
        }

        public static double allWindFarmsMaxOutput(ArrayList<WindFarm> windFarms) {
            double output = 0.0;

            return output;
        }

        public static String turbinesByWindfarms(ArrayList<WindFarm> windFarms) {
            String output = "";

            return output;
        }

        public static double highestCurrentOutputForWindFarm(WindFarm windFarm) {
            double turbineMax = 0.0;

            return turbineMax;
        }

        public static TurbineState isTurbineRunningOrUnderPerforming(Turbine turbine) {

            if (turbine.output < 100) {
                if (turbine.getModel().type().equals(ModelType.BIG)) {
                    return TurbineState.UNDER_PERFORMING;
                } else {
                    return TurbineState.OFF;
                }
            }

            return turbine.output < 100 && turbine.getModel().type().equals(ModelType.SMALL) ? TurbineState.RUNNING
                    : TurbineState.UNDER_PERFORMING;
        }
    }
}