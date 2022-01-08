package constraints;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public interface Constraint 
{
    /*public HashSet<Activity> Activities=new HashSet<Activity>();*/
    /* retourne l'ensemble des activités concernées par la contrainte*/
    public Set<Activity> getActivities();

    /* activité , date */
    public boolean isSatisfied(Map<Activity, Integer> map);

}