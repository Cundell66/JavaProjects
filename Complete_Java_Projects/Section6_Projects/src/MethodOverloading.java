public class MethodOverloading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5, 4);
        System.out.println(result);

        result = getResult(5, "12");
        System.out.println(result);

        System.out.println(clean("my   Id"));

        System.out.println(getResult("good", "boy"));
    }//end main
    
    public static int getResult(int num){
        return num * 2;
    }// end getResult

    public static int getResult(int num1, int num2){
        return num1 * num2;
    }// end GetResult

    public static int getResult(int num1, String value){
        return num1 * Integer.parseInt(value);
    }// end getresult

    public static String getResult(String first, String second){
        return first + " " + second;
    }// end getresult$

    public static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++){
            char c = identifier.charAt(i);
            if (c == '-'){
                capitalizeNext = true;
                continue;
            }
            
            if (Character.isISOControl(c)){
                sb.append("CTRL");
                continue;
            }
            if (Character.isWhitespace(c)){
                sb.append("_");
                continue;
            }
                       
            if (c >= '\u03B1' && c <= '\u03C9'){
                continue;
            }
            if (Character.isLetter(c)){
                if (capitalizeNext){
                    sb.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                    continue;
                }
                sb.append(c);
            }
           
            
        }
        return sb.toString();
    }
}
