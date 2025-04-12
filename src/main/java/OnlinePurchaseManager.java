import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    int matches = 0;

    for(Gizmo g : purchases)
        if(g.isElectronic() && g.getMaker().equals(maker))
            matches++;

    return matches;
  
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
     for(int i = 1; i < purchases.size(); i++)
        if(purchases.get(i - 1).equals(purchases.get(i)))
            return true;

    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
