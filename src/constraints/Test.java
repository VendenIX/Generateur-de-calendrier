package constraints;
import constraintstests.*;
import solverstests.*;
public class Test
{
  public static void main(String[] args)
  {
    //test1/
    /*
    boolean ok = true;
    ActivityTests activityTester = new ActivityTests();
    ok = ok && activityTester.testGetDescription();
    ok = ok && activityTester.testGetDuration();
    System.out.println(ok ? "All tests passed" : "At least one test failed");

    //test2:
    PrecedenceConstraintTests precedenceConstraintTester = new PrecedenceConstraintTests();
    ok = ok && precedenceConstraintTester.testGetFirst();
    ok = ok && precedenceConstraintTester.testGetSecond();
    ok = ok && precedenceConstraintTester.testIsSatisfiedBy();

    //test3:
    MeetConstraintTests meetConstraintTester = new MeetConstraintTests();
    ok = ok && meetConstraintTester.testGetFirst();
    ok = ok && meetConstraintTester.testGetSecond();
    ok = ok && meetConstraintTester.testIsSatisfiedBy();

    /*
    boolean ok = true;
    TopologicalSorterTests tester = new TopologicalSorterTests();
    ok = ok && tester.testBruteForceSort();
    ok = ok && tester.testSchedule();
    System.out.println(ok ? "All tests passed" : "At least one test failed");
    */
    /*
    boolean ok = true;
    MeetConstraintTests meetConstraintTester = new MeetConstraintTests();  
    ok = ok && meetConstraintTester.testGetFirst();
    ok = ok && meetConstraintTester.testGetSecond();
    ok = ok && meetConstraintTester.testIsSatisfiedBy();
    */

// Activities
boolean ok = true;

/*
ActivityTests activityTester = new ActivityTests();
ok = ok && activityTester.testGetDescription();
ok = ok && activityTester.testGetDuration();


// Precedence constraints
PrecedenceConstraintTests precedenceConstraintTester = new PrecedenceConstraintTests();
ok = ok && precedenceConstraintTester.testGetFirst();
ok = ok && precedenceConstraintTester.testGetSecond();
ok = ok && precedenceConstraintTester.testExtends();
ok = ok && precedenceConstraintTester.testIsSatisfiedBy();
   
// Meet constraints
MeetConstraintTests meetConstraintTester = new MeetConstraintTests();
ok = ok && meetConstraintTester.testGetFirst();
ok = ok && meetConstraintTester.testGetSecond();
ok = ok && meetConstraintTester.testExtends();
ok = ok && meetConstraintTester.testIsSatisfiedBy();
   VerifierTests();
ok = ok && verifierTester.testUnsa
// Precedence constraints with gap
PrecedenceConstraintWithGapTests precedenceConstraintWithGapTester = new PrecedenceConstraintWithGapTests();
ok = ok && precedenceConstraintWithGapTester.testExtends();
ok = ok && precedenceConstraintWithGapTester.testGetFirst();
ok = ok && precedenceConstraintWithGapTester.testGetSecond();
ok = ok && precedenceConstraintWithGapTester.testIsSatisfiedBy();
/*
// Abstract class
AbstractionTests abstracttionTester = new AbstractionTests();
ok = ok && abstracttionTester.test();

System.out.println(ok ? "All tests passed" : "At least one test failed");
  /**/

// Activities
/*
ActivityTests activityTester = new ActivityTests();
ok = ok && activityTester.testGetDescription();
ok = ok && activityTester.testGetDuration();

// Precedence constraints
/*
PrecedenceConstraintTests precedenceConstraintTester = new PrecedenceConstraintTests();
ok = ok && precedenceConstraintTester.testExtends();
ok = ok && precedenceConstraintTester.testImplements();
ok = ok && precedenceConstraintTester.testGetActivities();
ok = ok && precedenceConstraintTester.testGetFirst();
ok = ok && precedenceConstraintTester.testGetSecond();
ok = ok && precedenceConstraintTester.testIsSatisfied();

// Meet constraints
/*
MeetConstraintTests meetConstraintTester = new MeetConstraintTests();
ok = ok && meetConstraintTester.testExtends();
ok = ok && meetConstraintTester.testImplements();
ok = ok && meetConstraintTester.testGetActivities();
ok = ok && meetConstraintTester.testGetFirst();
ok = ok && meetConstraintTester.testGetSecond();
ok = ok && meetConstraintTester.testIsSatisfied();

// Precedence constraints with gap
/*
PrecedenceConstraintWithGapTests precedenceConstraintWithGapTester = new PrecedenceConstraintWithGapTests();
ok = ok && precedenceConstraintWithGapTester.testExtends();
ok = ok && precedenceConstraintWithGapTester.testImplements();
ok = ok && precedenceConstraintWithGapTester.testGetActivities();
ok = ok && precedenceConstraintWithGapTester.testGetFirst();
ok = ok && precedenceConstraintWithGapTester.testGetSecond();
ok = ok && precedenceConstraintWithGapTester.testIsSatisfied();

// Abstract class
/*
AbstractionTests abstractionTester = new AbstractionTests();
ok = ok && abstractionTester.testImplements();
ok = ok && abstractionTester.testGetActivities();
ok = ok && abstractionTester.testIsSatisfied();

// Precedence constraints with gap
/*
MaxSpanConstraintTests maxSpanConstraintTester = new MaxSpanConstraintTests();
ok = ok && maxSpanConstraintTester.testImplements();
ok = ok && maxSpanConstraintTester.testGetActivities();
ok = ok && maxSpanConstraintTester.testIsSatisfied();
/**/
//Test Verifier 
/*
VerifierTests verifierTester = new VerifierTests();
ok = ok && verifierTester.testUnsatisfied();
*/
RandomSchedulerTests randomSchedulerTester = new RandomSchedulerTests();
ok = ok && randomSchedulerTester.testGenerateSchedule();
System.out.println(ok ? "All tests passed" : "At least one test failed");
/**/
  }
}
