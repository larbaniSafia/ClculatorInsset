package org.insset.shared;

/**
 * <p>
 * FieldVerifier validates that the name the user enters is valid.
 * </p>
 * <p>
 * This class is in the <code>shared</code> packing because we use it in both
 * the client code and on the server. On the client, we verify that the name is
 * valid before sending an RPC request so the user doesn't have to wait for a
 * network round trip to get feedback. On the server, we verify that the name is
 * correct to ensure that the input is correct regardless of where the RPC
 * originates.
 * </p>
 * <p>
 * When creating a class that is used on both the client and the server, be sure
 * that all code is translatable and does not use native JavaScript. Code that
 * is note translatable (such as code that interacts with a database or the file
 * system) cannot be compiled into client side JavaScript. Code that uses native
 * JavaScript (such as Widgets) cannot be run on the server.
 * </p>
 */
public class FieldVerifier {

    /**
     * Verifies that the specified name is valid for our service.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidName(String name) {
        if ((name == null) || (name.isEmpty())) {
            return false;
        }
        return true;
    }

    /**
     * Verifies that the specified value is valide.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */

     
    //terence

    public static boolean isValidDecimal(Integer nbr) {
        //Implement your code
         if (!(nbr>0 && nbr<4000))  
            return false;
          return true;
    }

    //celia
    public static boolean isValidRoman(String nbr) {
        //Implement your code
        if(nbr.length()==0){
            return false;
        }
        
        boolean tmp=false ;
        String [] tabDechiffresRomains={"I","V","X","L","C","D","M"};
        for(int i=0; i<nbr.length(); i++)
        {
            for(int j=0;j<tabDechiffresRomains.length;j++){
                if(nbr.substring(i,i+1).equals(tabDechiffresRomains[j]))
                    tmp=true;
            }
            if(tmp==false) return false;
        }   
        return true;
    }


    //safia
    public static boolean formatDateValide(String date){
        Boolean trOrFs=false;
        if(date.charAt(2)==('-') && date.charAt(5)==('-')){
            trOrFs=true;
        }
        if(trOrFs==true){
            boolean isDdNumeric=date.substring(0, 2).matches("[+-]?\\d*(\\.\\d+)?");
            boolean isMmNumeric=date.substring(3, 5).matches("[+-]?\\d*(\\.\\d+)?");
            boolean isYyyyNumeric=date.substring(6).matches("[+-]?\\d*(\\.\\d+)?");
            
            if(isDdNumeric==true && isMmNumeric==true && isYyyyNumeric==true){
                return true;
            }
        }
        return false;
    }

    //safia
    public static boolean isValidDate(String date) {
        //Implement your code
        
        if(date.length()==0){
            return false;
        }else if(date.length()!=10){
            return false;
        }

        if(formatDateValide(date)==false){
            return false;
        }
        return true;
    }
}
