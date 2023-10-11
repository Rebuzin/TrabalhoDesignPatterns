

package br.com.designpatternMain;

import br.com.designpatternView.ContactForm;
import br.com.designpatternModelPerderPeso.PerderPesoFactory;


public class DesignPatternMain {

    public static void main(String[] args) {
      
        new ContactForm().render(new PerderPesoFactory());
        
    }
}
