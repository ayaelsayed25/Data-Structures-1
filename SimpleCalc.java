public class SimpleCalc implements ICalculator{

    public int add(int x, int y)
    {
        return x + y ;
    }
    public float divide(int x, int y)
    {
        if(y == 0)
        {
            throw new RuntimeException("Can't divide by zero!");
        }
        else
        {
        
            return (float)x/y;
        }
    }
    
}