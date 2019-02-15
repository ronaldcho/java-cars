package us.ronaldcho.carmodels;

public class CarNotFoundException extends RuntimeException
{
    public CarNotFoundException(Long id)
    {
        super("Could not find car with id: " + id);
    }
}
