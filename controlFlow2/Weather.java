public class Weather {
    public static void main(String[] args) {
        double rain = 0.45;
        double bright = 0.55;

        String forecast = (rain < bright) ? "It/'s nice day" : "Don/'t sad with unfriendly weather";
        System.out.println(forecast);
    }
}
