package solvers;
import solverstests.*;
public class Test
{
  public static void main(String[] args)
  {
    boolean ok = true;
    //Test Verifier 
    VerifierTests verifierTester = new VerifierTests();
    ok = ok && verifierTester.testUnsatisfied();
  }
}