package solvers;
import constraints.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class TopologicalSorter
{
  public TopologicalSorter()
  {

  }

/*bruteForceSort:
/*retourne HashSet Activities toutes ordonnées en fonction des restrictions dans contraints*/
/*ou retourne pas de solutions donc null car les contraints rendent impossible un ordre cohérent */
public ArrayList<Activity> bruteForceSort(HashSet<Activity>activities,HashSet<PrecedenceConstraint>contraintes)
{

  HashSet<Activity>  activitesAVider= new HashSet<Activity>(activities);
  ArrayList<Activity> resultatFinal= new ArrayList<Activity>();

  while (!activitesAVider.isEmpty())
  {
    boolean continuer = false;
    for (Activity a : activities) 
    {
      if(!resultatFinal.contains(a))
      {
      boolean ok = true;
      /*System.out.println("test"+a+"  " +resultatFinal);*/
      /* On considere chaque element pour voir si toutes les contraintes sont satisfaites ou si des contraintes empechent propagation*/
      for (PrecedenceConstraint c : contraintes) 
      {
        if (a.equals(c.getSecond()) && !resultatFinal.contains(c.getFirst())) {
          ok = false;
          break;
        }

      }
      if (ok) {
        resultatFinal.add(a);
        activitesAVider.remove(a); 
        continuer = true;
        break;
      }
    }
    }
      if (!continuer) {
       return null;
      }

  }
return resultatFinal;

}

public HashMap <Activity, Integer> schedule(HashSet <Activity> activities, HashSet <PrecedenceConstraint> contraintes)
{
  /* Ma liste d'activites rangée*/
    ArrayList<Activity> liste = bruteForceSort(activities, contraintes);

    /*Dictionnaire initié pour ranger les valeurs finales */
    HashMap<Activity, Integer> dico = new HashMap<Activity, Integer>();
    int horaire=0; /* Incrémenteur d'horaires init à 0*/

    /* Parcours de mes activites rangées pour remplir mon dictionnaire des horaires */
    if(liste != null)
    {
      for(Activity activite : liste){
          dico.put(activite,horaire);
          horaire+=activite.getDuration();
      }
      return dico;
    }
    return null;

}



}