import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
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

        // * 1 - Calculate the sum of the maximum output for all turbine within a wind farm and display this.

        // * 2 - Display the sum of the maximum output for all turbines across all wind farms.

        // * 3 - Using all wind farms print out the wind farm name followed by their turbine details.
        // - For nordex turbines we would like to see the name, maximum output and current output.
        // - For vestas turbines we would like to see the name and current output only.
        // - We would like to see the turbines within the windfarm ordered by current output in descending order

        // * 4 - Display the highest current output of any turbine within a wind farm

        // * 5 - The isTurbineRunningOrUnderPerforming method in DisplayUtils class uses
        // nested boolean logic to control whether a turbine is running or underperforming.
        // This method is a bit of a mess and we would like to see how you clean it up.

        //Turbo model types: BIG, MEDIUM, SMALL
        TurbineModel model1 = new TurbineModel("1", "WTG", ModelType.BIG);
        TurbineModel model2 = new TurbineModel("2", "GBF", ModelType.SMALL);
        TurbineModel model3 = new TurbineModel("3", "ZLF", ModelType.MEDIUM);

        //Nordex turbines | added unique ID - NDX001
        Turbine nordexTurbine1 = new NordexTurbine("NDX001", "Nordex Turbine", model1, 37, 3700.80);
        Turbine nordexTurbine2 = new NordexTurbine("NDX002", "Nordex Turbine", model2, 42, 4200.30);
        Turbine nordexTurbine3 = new NordexTurbine("NDX003", "Nordex Turbine", model3, 53, 5300.60);
        Turbine nordexTurbine4 = new NordexTurbine("NDX004", "Nordex Turbine", model1, 18, 1800.10);
        Turbine nordexTurbine5 = new NordexTurbine("NDX005", "Nordex Turbine", model2, 67, 6700.60);

        //Vestas turbines | added unique ID - VTS001
        Turbine vestasTurbine1 = new VestasTurbine("VTS001", "Vestas Turbine", model1, 19, 1900.20);
        Turbine vestasTurbine2 = new VestasTurbine("VTS002", "Vestas Turbine", model2, 34, 3400.30);
        Turbine vestasTurbine3 = new VestasTurbine("VTS003", "Vestas Turbine", model3, 53, 5300.50);
        Turbine vestasTurbine4 = new VestasTurbine("VTS004", "Vestas Turbine", model1, 42, 4200.20);

        //Create 3 wind farms with 3 turbines each and complete the following:
        WindFarm windFarm1 = new WindFarm("1", "Farmy McFarmFace", "56.185443", "-3.767525");
        windFarm1.addTurbine(nordexTurbine1);
        windFarm1.addTurbine(nordexTurbine2);
        windFarm1.addTurbine(vestasTurbine1);

        WindFarm windFarm2 = new WindFarm("2", "Turbo Farm", "42.424244", "121.56375");
        windFarm2.addTurbine(nordexTurbine3);
        windFarm2.addTurbine(nordexTurbine4);
        windFarm2.addTurbine(vestasTurbine2);

        WindFarm windFarm3 = new WindFarm("3", "Speed Farm", "-20.24912", "61.04928");
        windFarm3.addTurbine(nordexTurbine5);
        windFarm3.addTurbine(vestasTurbine3);
        windFarm3.addTurbine(vestasTurbine4);

        ArrayList<WindFarm> windFarms = new ArrayList<WindFarm>();
        windFarms.add(windFarm1);
        windFarms.add(windFarm2);
        windFarms.add(windFarm3);

        // Output
        double windFarmMaximumOutput = WindFarmUtils.maximumOutputSum(windFarm1); // (#1 task) Adds the maximum outputs for all turbines within a windfarm.
        System.out.println(windFarm1.getName() + "\n - Sum of Maximum Output: " + windFarmMaximumOutput);

        double maximumOutputForAllWindFarms = WindFarmUtils.allWindFarmsMaxOutput(windFarms); // (#2 task) Adds the maximum outputs for all turbines across all windfarms.
        System.out.println("Sum of all turbine's max output: " + maximumOutputForAllWindFarms + "\n");

        String formattedString = DisplayUtils.displayWindFarmTurbineDetails(windFarms); // (#3-3.3 task) Display all windfarms followed by their turbine details.
        System.out.println(formattedString);

        System.out.println(DisplayUtils.displayAllTurbineDetails(windFarm1.getAllTurbines(), false)); //(3.4 task) Windfarm turbines sorted in descending order.
        //System.out.println(WindFarmUtils.getDetailsForAllTurbines(windFarm1.getAllTurbines(), true));  // Windfarm turbines sorted in ascending  order.

        double highestOutputInWindfarm = WindFarmUtils.getHighestOutputForWindFarm(windFarm1); // (#4 task) retrieves the turbine with highest current output value. (4 problem).
        System.out.println("Highest output in WindFarm " + windFarm1.getName() + ": " + highestOutputInWindfarm);

        // (#5 task) -> displays state dependent on output and turbine state
        System.out.println("Turbine current state: " + WindFarmUtils.isTurbineRunningOrUnderPerforming(nordexTurbine1));
        System.out.println("Turbine current state: " + WindFarmUtils.isTurbineRunningOrUnderPerforming(nordexTurbine2));
        System.out.println("Turbine current state: " + WindFarmUtils.isTurbineRunningOrUnderPerforming(nordexTurbine3));
        //System.out.println("Turbine current state: " + WindFarmUtils.isTurbineRunningOrUnderPerformingAlternate(nordexTurbine1));


        //Extra Methods
        ArrayList<Turbine> turbines = new ArrayList<>();
        for (WindFarm windFarm : windFarms)
            turbines.addAll(windFarm.getAllTurbines()); //add all windfarm turbines to arraylist

        System.out.println(" ");
        System.out.println("Highest maximum output for all turbines: " +  WindFarmUtils.getHighestMaximumOutputForTurbines(turbines).getMaximumOutput());
        System.out.println("Highest maximum output for WindFarm " + windFarm1.getName() + ": " +  WindFarmUtils.getHighestMaximumOutputForWindFarm(windFarm1));

        System.out.println("Highest output for all turbines: " +  WindFarmUtils.getHighestOutputForTurbine(turbines).getOutput());
        System.out.println("Highest output in WindFarm " + windFarm1.getName() + ": " + WindFarmUtils.getHighestOutputForWindFarm(windFarm1));
        }
}