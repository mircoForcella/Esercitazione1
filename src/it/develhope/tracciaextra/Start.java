package it.develhope.tracciaextra;

import it.develhope.tracciaextra.entities.Employee;
import it.develhope.tracciaextra.entities.Head;
import it.develhope.tracciaextra.entities.Workman;

public class Start {
    public static void main(String[] args) {

        Workman workman1 = new Workman(0, "Mario Gialli", 0.5f, 20);
        Workman workman2 = new Workman(6, "Gianni Fannulloni", 0.2f, 30);
        Workman workman3 = new Workman(17, "Giorgia Lavoroni", 0.85f, 40);
        Workman[] workmenList = {workman1, workman2, workman3};

        Head head1 = new Head(3, "Alessio Antichi", 0.55f, 20);
        Head head2 = new Head(1, "Marianna Figlidelcapo", 0.3f, 2);
        Head head3 = new Head(9, "Gianluigi Figlidelcapo", 0.3f, 4);
        Head[] headList = {head1, head2, head3};

        for (int i = 0; i < workmenList.length; i++) {
            if (workmenList[i].canApplyPromotion()) {
                System.out.println(workmenList[i].getName() + " Can Apply For Promotion.");
            } else {
                System.out.println(workmenList[i].getName() + " Can't Apply For Promotion.");
            }
        }

        for (int i = 0; i < headList.length; i++) {
            if (headList[i].mayBeDemoted()) {
                System.out.println(headList[i].getName() + " Can be demoted.");
            } else {
                System.out.println(headList[i].getName() + " Can't be demoted.");
            }
        }

        Employee[] employeesList = {head1, head2, head3, workman1, workman2, workman3};

        for (int i = 0; i < employeesList.length; i++) {
            System.out.println("Employee name: "+ employeesList[i].getName());
            System.out.println("Employee EfficiencyIndex: "+ employeesList[i].getEfficiencyIndex());
        }
        for (int i = 0; i < employeesList.length; i++) {
            System.out.println("Employee name: "+ employeesList[i].getName());
            System.out.println("Employee EfficiencyIndex: "+ employeesList[i].getEfficiencyIndex());
        }
        for(Employee empFor : employeesList){
            String name = empFor.getName().replace(".",",");
            String empIndex = String.valueOf(empFor.getEfficiencyIndex()).replaceAll("[0-9]", "?").replace(".", ",");
            System.out.printf("-Modified name: %s - Modified Eff.Index: %s \n", name, empIndex);

            String name1 = empFor.getName().replaceAll("[A-Z]", "");
            System.out.println(name1);


        }



    }
}
