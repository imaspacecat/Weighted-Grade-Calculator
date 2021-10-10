class Subject{
	String inputCat;
	double inputWeight;
	double inputGrade;
	  


	public Subject(String inputCat, double inputWeight, double inputGrade){
		this.inputCat = inputCat;
	    this.inputWeight = inputWeight;
	    this.inputGrade = inputGrade;

	  }

	void print(){
	    System.out.println(inputCat + " " + inputWeight + " " + inputGrade);
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
  
