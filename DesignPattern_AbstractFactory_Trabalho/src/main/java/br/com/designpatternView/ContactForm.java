
package br.com.designpatternView;

import javax.xml.parsers.FactoryConfigurationError;

import br.com.designpatternInterface.WidgetFactory;


public class ContactForm {
    
    public void render(WidgetFactory factory){
        
        factory.createButton().render();
        factory.createTextBox().render();
   
}
}
