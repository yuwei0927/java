abstract class Demo
{
    abstract void study();
    void sleep()
    {
        System.out.println("sleep...");
    }
}

class De extends Demo
{
    void study()
    {
        System.out.println("study...");
    }
}

class AbstractDemo
{
    public static void main(String[] args)
    {
    
        new De().sleep();
        new De().study();
    }
        
}