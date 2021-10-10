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
		
		//created some Text objects for instructions and final output
		Text text1 = new Text();
		Text instructions = new Text("Category, Weight (%), Grade (%) \n \n E.g. homework, 30, 98");
		Text solution = new Text();
		
		//created a TextField object which will get the input from the user
		TextField textField1 = new TextField();
		textField1.setText("homework, 30, 90");
		
		Button button1 = new Button("Enter");
		Button button2 = new Button("Calculate");
		
		//created a VBox which puts all of its children nodes vertically from the first to the last specified
		VBox vBox1 = new VBox(instructions, textField1, button1, button2, text1, solution);
		
		Scene scene1 = new Scene(vBox1);
		
		primaryStage.setScene(scene1);
		primaryStage.show();
		
		/**When button1 (Enter) is clicked it gets the latest input in textField1, 
		splits it in the "," and stores it into a String array. Then it stores the 3 strings
		as parameters in the Subject array. The first string stays as it is and the others are converted from
		Strings to doubles. i is increased by one so the next time the button is clicked it is stored in the next index.
		userSize is increased by one (Explained in line 61)**/
		button1.setOnAction(action -> {
			text1.setText("Latest Input: " + textField1.getText());
            stringInput = textField1.getText().split(",", 0);
            subject[i]= new Subject(stringInput[0], Double.parseDouble(stringInput[1]), Double.parseDouble(stringInput[2]));
            userSize++;
            i++;
        });
		
		//Prints the grade on the screen. I have to convert calculate(subject) to a String because setText() only accepts Strings.
		button2.setOnAction(action -> {
            solution.setText("Grade: " + Double.toString(calculate(subject)) + "%");
        });
	  }
	
	//I use i<userSize instead of i<input.length because it will go out of scope if I don't. There is a solution but I'm lazy...
	double calculate(Subject[] input){
		double grade = 0;
		for(int i=0; i<userSize; i++) {
			grade = grade + input[i].getWeight() * input[i].getGrade();
		}
		
		return grade/100;
	}
}