package constraints;
import java.util.HashSet;
import java.util.Map;
public class PrecedenceConstraintWithGap extends PrecedenceConstraint
{
    protected int DelaiMin,DelaiMax;
    public PrecedenceConstraintWithGap(Activity activity1,Activity activity2, int DelaiMin, int DelaiMax)
    {
        super(activity1,activity2);
        this.DelaiMin=DelaiMin;
        this.DelaiMax=DelaiMax;
    }

    @Override
    public boolean isSatisfied(int date1,int date2)
    {
        if(date1+DelaiMin+this.activity1.getDuration()<=date2){
            /* Si ma date1 + le delai min est tjr inferieur a date 2, c'est valide puis*/
            if(date1+DelaiMax+this.activity1.getDuration()>=date2){
                /* Si ma date1 avec de delai max est superieur a date2, ca satisfait la contrainte*/
                return true;
            }
        }
        return false;

    }

    @Override
    public String toString()
    {   
    return "L'activitee "+this.activity2+" doit commencer a "+this.DelaiMin+" unité(s) de temps de "+this.activity1+" dans la limite de "+this.DelaiMax+" unité(s) de temps.";
    }
    public HashSet<Activity> getActivities()
    {
        HashSet<Activity> listActivities=new HashSet<Activity>();
        listActivities.add(activity1);
        listActivities.add(activity2);
        return listActivities;
    }
    public boolean isSatisfied(Map<Activity, Integer> map)
    {
        return isSatisfied(map.get(this.activity1),map.get(this.activity2));
        /* Je prends ma méthode isSatisfied et je remplace date1 par map.get(this.activity2) et même schéma pour date2*/
    }
    



    
}

