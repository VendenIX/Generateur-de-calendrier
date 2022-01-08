package constraints;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public abstract class BinaryConstraint implements Constraint
{
    protected Activity activity1,activity2;
    public BinaryConstraint(Activity activity1, Activity activity2)
    {
        this.activity1 = activity1;
        this.activity2 = activity2;
    }

    public Activity getFirst()
    {
        return this.activity1;
    }

    public Activity getSecond()
    {
        return this.activity2;
    }

    public abstract boolean isSatisfied(int date1,int date2);
    
    public Set<Activity> getActivities(){
        Set<Activity> listActivities=new HashSet<Activity>();
        listActivities.add(this.activity1);
        listActivities.add(this.activity2);
        return listActivities;
    }

    public boolean isSatisfied(Map<Activity, Integer> map){
        return isSatisfied(map.get(this.activity1),map.get(this.activity2));
    }

}