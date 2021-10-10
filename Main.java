import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Main extends Application{
	String[] stringInput;
	Subject[] subject = new Subject[10];
	int i=0;
	int userSize=0;
  	
	public static void main(String[] args) {
  		Application.launch(args);
  	}

@Override
	public void start(Stage primaryStage) throws Exception {
		  
		primaryStage.setTitle("Weighted Grade Calculator");
		
		Text text1 = new Text();
		Text instructions = new Text("Category, Weight (%), Grade (%) \n \n E.g. homework, 30, 98");
		Text solution = new Text();
		
		TextField textField1 = new TextField();
		textField1.setText("homework, 30, 90");
		
		Button button1 = new Button("Enter");
		Button button2 = new Button("Calculate");
		
		
		VBox vBox1 = new VBox(instructions, textField1, button1, button2, text1, solution);
		
		Scene scene1 = new Scene(vBox1);
		
		primaryStage.setScene(scene1);
		primaryStage.show();
				
		button1.setOnAction(action -> {
			text1.setText("Latest Input: " + textField1.getText());
            stringInput = textField1.getText().split(",", 0);
            subject[i]= new Subject(stringInput[0], Double.parseDouble(stringInput[1]), Double.parseDouble(stringInput[2]));
            userSize++;
            i++;
        });
		
		button2.setOnAction(action -> {
            solution.setText("Grade: " + Double.toString(calculate(subject)) + "%");
        });

	  }

	double calculate(Subject[] input){
		double grade = 0;
		for(int i=0; i<userSize; i++) {
			grade = grade + input[i].getWeight() * input[i].getGrade();
		}
		
		return grade/100;
	}
}