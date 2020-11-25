import java.lang.*;

class test {
    public static String insertString(
            String originalUrl,
            String stringToBeInserted,
            int index)
    {

        String newString = new String();

        for (int i = 0; i < originalUrl.length(); i++) {
            newString += originalUrl.charAt(i);

            if (i == index) {

                newString += stringToBeInserted;
            }
        }

        return newString;
    }

    public static void main(String[] args)
    {

        String originalString = "https//www.reddit.com/r/nevertellmethebots";
        String stringToBeInserted = ":";
        int index = 4;


        System.out.println("Modified String: "
                + insertString(originalString,
                stringToBeInserted,
                index));
    }
}
