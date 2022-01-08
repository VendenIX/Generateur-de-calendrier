package solvers;
import constraints.*;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Random;
import java.util.Random.*;
public class RandomScheduler
{
    private Random instance = new Random();
    /*rnd.setSeed(seed);*/
    public RandomScheduler(Random instance)
    {
        this.instance=instance;
    }

    public Map<Activity, Integer> generateOneSchedule(Set<Activity> activities,int dateMin, int dateMax)
    {
        /* Date aléatoire de début dans l'intervalle [DateMin - DateMax] */
        
        Map<Activity, Integer> map=new HashMap<Activity, Integer>();
        
        for (Activity act : activities) {
            int dateAlea= instance.nextInt((dateMax-dateMin)+1)+dateMin;
            map.put(act,dateAlea);
        }

        return map;
    }

    public Map<Activity, Integer> generateSchedule(Set<Activity> activities,Set<Constraint> constraints,int dateMin, int dateMax, int nombreTirage)
    {
        Map<Activity, Integer> emploieDuTempsFinal=new HashMap<Activity, Integer>();
        int min=activities.size()+1;
        Verifier verificateur = new Verifier(constraints);
        for (int i = 0; i < nombreTirage; i++) {
            Map<Activity, Integer> emploieDuTempsActuel=generateOneSchedule(activities, dateMin, dateMax);
            if((verificateur.unsatisfied(emploieDuTempsActuel).size()) < min){
                min=verificateur.unsatisfied(emploieDuTempsActuel).size();
                emploieDuTempsFinal=emploieDuTempsActuel;
            }
            
            
        }
        return emploieDuTempsFinal;

    }

}