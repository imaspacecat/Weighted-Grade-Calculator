class Subject{
	String inputCat;
	double inputWeight;
	double inputGrade;
	
	//created a constructor which has the parameters I need
	public Subject(String inputCat, double inputWeight, double inputGrade){
		this.inputCat = inputCat;
	    this.inputWeight = inputWeight;
	    this.inputGrade = inputGrade;

	  }
	
	String getCat(){
	    return inputCat;
	  }

	double getWeight(){
	    return inputWeight;
	  }

	double getGrade(){
	    return inputGrade;
	  }
	  
	}