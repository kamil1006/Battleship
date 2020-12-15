class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {

        double dd=0;
        try {
            dd=Double.parseDouble(input);
        }
        catch (Exception e){


        }
        return dd;
    }
}