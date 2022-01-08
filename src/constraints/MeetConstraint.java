package constraints;
public class MeetConstraint extends BinaryConstraint{

    /* La prochaine activitée démarre directement */
    public MeetConstraint(Activity activity1, Activity activity2) {
        super(activity1,activity2);
    }


    @Override
    public boolean isSatisfied(int date1, int date2) {
        if (date1 + this.activity1.getDuration() == date2) {
            return true;
        } else {
            return false;
        }

    }

   
}
