
/**
 *Super class for taxis and shuttles.
 * 
 * @Sam Dutie
 * @16/01/2017
 */
public class Vehicle
{
     // A unique ID for this taxi.
    private String id;
    // The destination of this taxi.
    private String destination;
    // The location of this taxi.
    private String location;
    // Whether it is free or not.
    
    /**
     * @param base The starting. location 
     * @param id The vehicle id
     */
    public Vehicle(String base, String id)
    {
        this.id = id;
        location = base;
        destination = null;
    }

    /**
     * Return the status of this taxi.
     * @return The status.
     */
    public String getStatus()
    {
        if (destination != null){
            return id + " at " + location + " headed for " + destination;
        }
        else {
            return id + " at " + location + " is available for booking ";
        }
    }
    
    /**
     * Return the ID of the taxi.
     * @return The ID of the taxi.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the location of the taxi.
     * @return The location of the taxi.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Return the destination of the taxi.
     * @return The destination of the taxi.
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Set the intented destination of the taxi.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
       
    }

      /**
     * Indicate that this taxi has arrived at its destination.
     * As a result, it will be free.
     */
    public void arrived()
    {
        location = destination;
        destination = null;
      //  free = true;
    }
    
     /**
     * @param location Sets the location
     */
    public void setLocation(String location)
    {
        this.location = location;
    }

}

