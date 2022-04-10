public class ConvertingFunctions {

    public String getSentenceCase(String text){
        if (text == null || text.isEmpty()) {
            return text;
        }

        boolean convertNext = true;
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()){
            if (c == '.' || c == '!' || c == '?' || c == '\n') {
                convertNext = true;
            } else if (Character.isLetter(c) && convertNext) {
                c = Character.toUpperCase(c);
                convertNext = false;
            } else if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
            }
            result.append(c);
        }

        return result.toString();
    }


    public String getTitleCase(String text){
        if (text == null || text.isEmpty()) {
            return text;
        }

        boolean convertNext = true;
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()){
            if (!Character.isLetter(c)) {
                convertNext = true;
            } else if (Character.isLetter(c) && convertNext) {
                c = Character.toUpperCase(c);
                convertNext = false;
            } else if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
            }
            result.append(c);
        }

        return result.toString();
    }


    public String getLowerCase(String text){
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()){
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
            }
            result.append(c);
        }

        return result.toString();
    }


    public String getUpperCase(String text){
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()){
            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
            }
            result.append(c);
        }

        return result.toString();
    }

}
