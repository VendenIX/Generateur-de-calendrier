package constraints;
import java.util.Set;
import java.util.Map;
public class MaxSpanConstraint implements Constraint
{

    protected int dureeMax;
    protected Set<Activity> activities;

    public MaxSpanConstraint(Set<Activity> activities,int dureeMax)
    {
            this.dureeMax=dureeMax;
            this.activities=activities;
    }

    /* Je recupère toutes les activitées*/
    public Set<Activity> getActivities()
    {
        return this.activities;
    }

    /* */
    @Override
    public boolean isSatisfied(Map<Activity, Integer> map)
    {
        int premier=100000;
        int dernier=0;

        if(this.getActivities().isEmpty()){
            return true;
        }
        for(Activity act: this.activities){
     
            if( map.get(act)<premier){ 
                premier=map.get(act);
            }

            if(map.get(act) + act.getDuration() >= dernier){
                dernier=map.get(act)+act.getDuration();
            }

            if(!map.containsKey(act)){
                return false;
            }
        }

        return ((dernier-premier)<=this.dureeMax );
    }
}





            
 
            