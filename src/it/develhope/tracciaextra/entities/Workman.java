package it.develhope.tracciaextra.entities;

public class Workman extends Employee {

    private int weeklyWorkingHours;

    public Workman(int id, String name, float efficiencyIndex, int weeklyWorkingHours) {
        super(id, name, efficiencyIndex);
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    @Override
    public boolean canApplyPromotion() {
        if (weeklyWorkingHours > 35 && getEfficiencyIndex() > 0.65)
            return true;
        else
            return false;
    }

    @Override
     public boolean mayBeDemoted() {
        return false;
    }

    public int getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    public void setWeeklyWorkingHours(int weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }
}
