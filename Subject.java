class Subject{

  String inputCat;
  double inputWeight;
  double inputGrade;
  


  public Subject(String inputCat, double inputWeight, double inputGrade){
    this.inputCat = inputCat;
    this.inputWeight = inputWeight;
    this.inputGrade = inputGrade;

  }

  public void print(){
    System.out.println(inputCat + " " + inputWeight + " " + inputGrade);
  }

  public String getCat(){
    return inputCat;
  }

  public double getWeight(){
    return inputWeight;
  }

  public double getGrade(){
    return inputGrade;
  }
  
}