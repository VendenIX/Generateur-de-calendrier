package solvers;
import constraints.*;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
public class Verifier
{
    private Set<Constraint> contraintes;
    public Verifier(Set<Constraint>contraintes)
    {
        this.contraintes=contraintes;
    }

    /*return ensemble des contraintes non satisfaites*/
    public Set<Constraint> unsatisfied(Map<Activity, Integer> map)
    {
        Set<Constraint> contraintesConcernees=new HashSet<Constraint>();
        for (Constraint constraint : contraintes) {
            if(!constraint.isSatisfied(map)){
                contraintesConcernees.add(constraint);
            }
        }
        return contraintesConcernees;
    }
}