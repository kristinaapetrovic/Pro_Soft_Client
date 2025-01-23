/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package language;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Korisnik
 */
public class LanguageManager {
    
   private String jezici[];
    private static Locale currentLocale=new Locale("sr");
    private static ResourceBundle resourceBundle= ResourceBundle.getBundle("language.Messages", currentLocale);
    
    public static void setLanguage(String language) {
        if (language.equals("Engleski jezik") || language.equals("English")) {
            currentLocale = new Locale("en");
            
        } else if (language.equals("Srpski jezik") || language.equals("Serbian")) {
            currentLocale = new Locale("sr");
        }
        resourceBundle = ResourceBundle.getBundle("language.Messages", currentLocale);
    }
    
    public static String getString(String key) {
        return resourceBundle.getString(key);
    }
    
    
    
}
