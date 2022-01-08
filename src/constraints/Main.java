package constraints;
import solvers.RandomScheduler;
import solvers.TopologicalSorter;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;
/* javac -d build src/constraints/*.java */
/* java -cp build constraints.Main */
/* javac -d build -cp lib/solverstests.jar src/constraints/*.java src/solvers/*.java */
/* java -cp build:lib/solverstests.jar constraints.Test */

public class Main{
public static void main(String[] args)
{

System.out.println("Le main s'est bien lancé:");

/* Je cree 4 activites*/
Activity activity1= new Activity("s'habiller",5);
Activity activity2= new Activity("dejeuner",10);
Activity activity3= new Activity("se laver",12);
Activity activity4= new Activity("partir a la fac",30);
/* Je cree une liste d'activites */
HashSet<Activity> listeActivites=new HashSet<Activity>();
/* J'ajoute des activites a ma liste d'activites */
listeActivites.add(activity1);
listeActivites.add(activity2);
listeActivites.add(activity3);
listeActivites.add(activity4);
System.out.println(listeActivites);

/* Je cree des contraintes */
PrecedenceConstraint contrainte1=new PrecedenceConstraint(activity3,activity2);
PrecedenceConstraint contrainte2=new PrecedenceConstraint(activity2,activity4);
PrecedenceConstraint contrainte3=new PrecedenceConstraint(activity2,activity1);         /*se laver < dejeuner < s'habiller < partir a la fac*/
/* Je creer une liste de contraintes */
HashSet<PrecedenceConstraint> listeContraintes=new HashSet<PrecedenceConstraint>();
listeContraintes.add(contrainte1);
listeContraintes.add(contrainte2);
listeContraintes.add(contrainte3);
System.out.println(listeContraintes);

TopologicalSorter solveur= new TopologicalSorter(); 
System.out.println(solveur.bruteForceSort(listeActivites,listeContraintes));

HashMap<Activity, Integer>planning =solveur.schedule(listeActivites, listeContraintes);
System.out.println(planning);

PrecedenceConstraintWithGap contrainteGap= new PrecedenceConstraintWithGap(activity2, activity3, 0, 1000);
System.out.println(contrainteGap);


HashSet<Constraint> constraints = new HashSet<>();

// Contrainte : activity1 doit être planifiée avant activity2
constraints.add(new PrecedenceConstraint(activity1, activity2));

// Contrainte : activity4 doit commencer précisément quand activity3 se termine
constraints.add(new MeetConstraint(activity3, activity4));

// Contrainte : activity1, activity2 et activity3 doivent toutes
// être exécutées en au plus 90 minutes
HashSet<Activity> activities = new HashSet<> ();
activities.add(activity1);
activities.add(activity2);
activities.add(activity3);
MaxSpanConstraint spanConstraint = new MaxSpanConstraint(activities, 90);
constraints.add(spanConstraint);

// Je demande un emploie du temps viable avec ma liste d'activites et de contraintes
Random seed = new Random();
RandomScheduler EmploieDuTemps = new RandomScheduler(seed);
EmploieDuTemps.generateSchedule(listeActivites,constraints,240,10_080,10_000);
/* entre le temps 240 et 10 080 avec 10 000 recherches pour avoir emploie du temps satisfaisant */


}
}
