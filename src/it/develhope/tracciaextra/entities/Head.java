package it.develhope.tracciaextra.entities;

public class Head extends Employee {
    private int yearsAsHead;

    public Head(int id, String name, float efficiencyIndex, int yearsAsHead) {
        super(id, name, efficiencyIndex);
        this.yearsAsHead = yearsAsHead;
    }

    @Override
    public boolean canApplyPromotion() {
        return false;
    }

    @Override
    public boolean mayBeDemoted() {
        if (yearsAsHead < 10) return true;
        else return false;
    }

    public int getYearsAsHead() {
        return yearsAsHead;
    }

    public void setYearsAsHead(int yearsAsHead) {
        this.yearsAsHead = yearsAsHead;
    }
}
