/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.util.HashMap;
import org.insset.client.service.RomanConverterService;


/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        return "XV/III/MX";
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        //Implement your code
        return 3;
    }   
  
    

      class GFG{
    
private static final Map<Character,
        Integer> convertRomanToArab = new HashMapImpl();
{
    
    int sum = 0;
    int n = string.length();
     
    for(int i = 0; i < n; i++)
    {       
        // If present value is less than
        // next value, subtract present
        // from next value and add the
        // resultant to the sum variable.
        if (i != n - 1 &&
            convertRomanToArabe.get(string.charAt(i)) <
            convertRomanToArabe.get(string.charAt(i + 1)))
        {
            sum += convertRomanToArabe.get(string.charAt(i + 1)) -
                   convertRomanToArabe.get(string.charAt(i));
            i++;
        }
        else
        {
            sum += convertRomanToArabe.get(string.charAt(i));
        }
    }
    return sum;
}
        
      //  return 3;

            private static class HashMapImpl extends HashMap<Character, Integer> {

                public HashMapImpl() {
                }
                {
                    put('I', 1);
                    put('V', 5);
                    put('X', 10);
                    put('L', 50);
                    put('C', 100);
                    put('D', 500);
                    put('M', 1000);
                }
                
                private void put(char c, int i) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            }
    }
 
    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        //Implement your code
        return new String("XVXX");
    }

    
}
