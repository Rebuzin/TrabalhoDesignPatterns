
package br.com.designpatternModelGanharMassa;

import br.com.designpatternInterface.Button;
import br.com.designpatternInterface.TextBox;
import br.com.designpatternInterface.WidgetFactory;


public class GanharMassaFactory implements WidgetFactory {

    @Override
    public Button createButton() {
    return new GanharMassaButton();
    }

    @Override
    public TextBox createTextBox() {
    return new GanharMassaTextBox();
    }
    
}
