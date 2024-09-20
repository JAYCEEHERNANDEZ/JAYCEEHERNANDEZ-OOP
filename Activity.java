public class Activity{
    public static void main(String[] args){
    
        Dog aso = new Dog();
        

        Dog aso1 = new Dog("Jaycee");
        Dog aso2 = new Dog("tere");

        Dog[] dogie = {aso1, aso2};
        
    
        aso.setName("Edcaluag");
        System.out.println(aso.showName());
        System.out.println(aso.bark());
        aso.setNumPuppies(5);
        System.out.println("Number of Puppies: " + aso.numOfPapi());
        
    
        
    
    }
    }