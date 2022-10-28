/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
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

        String dayString = nbr.substring(0,2);
        int dayConverti = Integer.parseInt(dayString);

        String monthString = nbr.substring(3,5);
        int monthConverti  = Integer.parseInt(monthString);

        String yearString = nbr.substring(6);
        int yearConverti  = Integer.parseInt(yearString);

        String dayEnRomain=convertArabeToRoman(dayConverti);
        String montEnRomain= convertArabeToRoman(monthConverti);
        String yearEnRomain=convertArabeToRoman(yearConverti);
        

        return dayEnRomain+"-"+montEnRomain+"-"+yearEnRomain;
    }
    
    public Integer chiffreBasiqueRomain(char unCar){
        switch (unCar)
		{
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
		}
		return 0;
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        //Implement your code
        int valeurNouvelleRomain, valeurAncienneRomain=0, resultat=0;

        for(int i=0; i<nbr.length(); i++){
            valeurNouvelleRomain= chiffreBasiqueRomain(nbr.toCharArray()[i]);
            if(valeurNouvelleRomain>valeurAncienneRomain){
                resultat+= valeurNouvelleRomain-(valeurAncienneRomain<<1);
            }else
            {
                resultat+=valeurNouvelleRomain;
            }
            valeurAncienneRomain=valeurNouvelleRomain;
        }
        return resultat;
    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        //Implement your code
        String [] chiffresRomains={"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        Integer [] chiffresArab={500,400,100,90,50,40,10,9,5,4,1};

        String romain="";
        for(int i=0; i<chiffresArab.length; i++){
            while(nbr>=chiffresArab[i]){
                romain+=chiffresRomains[i];
                nbr-=chiffresArab[i];
            }
        }
        return romain;
    }

}