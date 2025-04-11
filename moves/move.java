package moves;

public class  Move { 
    
    String name = ""; 
    String type = ""; 
    double power = 0; 
    double accuracy = 0; 
    double priority = 0; 
    String category = ""; 
    String effect = ""; 
    
    public Move(String name, String type, double power, double accuracy, double priority, String category, String effect) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.priority = priority;
        this.category = category;
        this.effect = effect;
    }
    
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public double getPower() {
        return power;
    }
    
    public double getAccuracy() {
        return accuracy;
    }
    
    public double getPriority() {
        return priority;
    }
}
    

