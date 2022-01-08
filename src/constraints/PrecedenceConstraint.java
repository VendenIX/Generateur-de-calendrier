package constraints;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
public class PrecedenceConstraint extends BinaryConstraint
{

    /* La 2ème activité commence au plus tôt quand la première se termine */
    public PrecedenceConstraint(Activity activity1,Activity activity2)
    {
        super(activity1,activity2);
    }

    /* représenteront des dates candidates pour le démarrage de la première et la seconde activité concernées par la contrainte */
    @Override
    public boolean isSatisfied(int date1,int date2)
    {
        return (date1+this.activity1.getDuration()<=date2);

    }
    @Override
    
    public String toString()
    {
        return "L'activitee "+this.activity1+" doit etre avant "+this.activity2;
    }

    public Set<Activity> getActivities()
    {
        Set<Activity> listActivities=new HashSet<Activity>();
        listActivities.add(activity1);
        listActivities.add(activity2);
        return listActivities;
    }
    
    public boolean isSatisfied(Map<Activity, Integer> map)
    {
        return isSatisfied(map.get(this.activity1),map.get(this.activity2));
    }

}