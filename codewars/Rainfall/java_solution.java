public class Rainfall {

    public static double mean(String town, String strng) {
        double[] data = parseData(town, strng);
        if (data.length == 0) {
            return -1;
        }
        double dataSum = 0;
        for (double d: data) {
            dataSum += d;
        }
        return dataSum/data.length;
    }
    public static double variance(String town, String strng) {
        double[] data = parseData(town, strng);
        if (data.length == 0) {
            return -1;
        }
        double avg = mean(town, strng);
        double dataSqrSum = 0;
        for (double d: data) {
            dataSqrSum += (d - avg) * (d - avg);
        }
        return dataSqrSum/data.length;
    }
    private static double[] parseData(String town, String strng) {
        String[] tempArray = strng.split("\n");
        for (String tempStr: tempArray) {
            String[] cityData = tempStr.split(":");
            if (cityData[0].equals(town)) {
                String[] monthData = cityData[1].split(",");
                double[] rainData =  new double[12];
                for (int i=0; i<12; i++) {
                    rainData[i] = Double.valueOf(monthData[i].split(" ")[1]);
                }
                return rainData;
            }
        }
        return new double[0];
    }
}