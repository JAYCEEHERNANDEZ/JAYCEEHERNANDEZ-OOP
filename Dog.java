public class Dog {
    String name;
    boolean isMale;
    int papi;
    Dog[] dogie;

    public void setName(String name){
        this.name = name;
    }
    public String showName(){
        return "My dog's name is " + name;
    }
    public String bark(){
        return "woof! woof!";
    }
    public void setNumPuppies(int papi){
        this.papi = papi;
    }
    public String showPuppies(){
        return "There are" + papi + "Puppies";
    }
    public void setPuppies(Dog[] dogie){
        this.dogie = dogie;
    }
    
    
}
