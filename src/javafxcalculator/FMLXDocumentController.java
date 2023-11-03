package javafxcalculator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonClean;
    @FXML
    private Button buttonDelet;
    @FXML
    private Button buttonDiv;
    @FXML
    private Button buttonEqual;
    @FXML
    private Button buttonMult;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonRest;
    @FXML
    private Label label;
    @FXML
    private TextField resultField;  
    @FXML
    void addOperation(ActionEvent event) {
         if("Sintax Error".equals(resultField.getText())){
            clean();
        }
        resultField.setText(resultField.getText() + ((Button)event.getSource()).getText());      
    }
    @FXML
    void addNumber(ActionEvent event) {
        if("Sintax Error".equals(resultField.getText())){
            clean();
        }
        resultField.setText(resultField.getText() + ((Button)event.getSource()).getText());
      
    }
    @FXML
    public void clean(){
      resultField.setText("");
    }
    @FXML
    public void delete(){
      if(resultField.getText().length()!= 0)  {
          resultField.setText(resultField.getText().substring(0,resultField.getText().length()-1));
      }    
    }
    @FXML
    public void result(){
        
        String operation = resultField.getText().replace("X", "*");
        
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine;
        engine = mgr.getEngineByName("js");
        
        Object result;
        try {
            result = engine.eval(operation);
            resultField.setText(result.toString());
            
        } catch (ScriptException ex) {
            resultField.setText("Sintax Error");
        }        
    }  
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
  
}
