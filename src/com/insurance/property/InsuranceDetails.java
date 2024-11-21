package com.insurance.property;

import java.util.List;
import java.util.Scanner;

import com.ims.client.InsuranceClient;
import com.ims.dao.impl.InsuranceDaoImpl;
import com.ims.model.Insurance;

public class InsuranceDetails {

    Scanner sc = new Scanner(System.in);
    InsuranceDaoImpl daoImpl = new InsuranceDaoImpl();

    public void adminInsuranceMenu() {
        System.out.println("============================================");
        System.out.println("            Admin Menu:                   ");
        System.out.println("            1) Add Property Insurance      ");
        System.out.println("            2) View All Insurances         ");
        System.out.println("            3) View Current Insurance      ");
        System.out.println("            4) Delete Insurance            ");
        System.out.println("            5) Update Property Insurance   ");
        System.out.println("            6) Back                        ");
        System.out.println("============================================");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                daoImpl.addInsurance();
                adminInsuranceMenu();
                break;

            case 2:
                List<Insurance> viewInsurances = daoImpl.viewAllInsurances();
                System.out.println("ID" + "\t" + "Name" + "\t" + "Price" + "\t" + "Type");
                for (Insurance i : viewInsurances) {
                    System.out.println(i.getInsuranceId() + "\t" + i.getInsuranceName() + "\t" + i.getInsurancePrice() + "\t" + i.getInsuranceType());
                }
                adminInsuranceMenu();
                break;

            case 3:
                System.out.println("Enter Insurance id:");
                int viewId = sc.nextInt();
                Insurance insId = daoImpl.viewInsurnace(viewId);
                if (insId != null) {
                    System.out.println("ID" + "\t" + "Name" + "\t" + "Price" + "\t" + "Type");
                    System.out.println(insId.getInsuranceId() + "\t" + insId.getInsuranceName() + "\t" + insId.getInsurancePrice() + "\t" + insId.getInsuranceType());
                } else {
                    System.out.print("Insurance does not exist");
                }
                adminInsuranceMenu();
                break;

            case 4:
                System.out.println("Enter Insurance id:");
                int delId = sc.nextInt();
                boolean delIns = daoImpl.deleteInsurance(delId);
                if (delIns)
                    System.out.println("Successfully deleted");
                else
                    System.out.print("Insurance does not exist");
                adminInsuranceMenu();
                break;

            case 5:
                System.out.println("Enter Insurance id:");
                int updateId = sc.nextInt();
                int uid = daoImpl.updateInsurance(updateId);
                if (uid != 0)
                    System.out.println("Updated successfully");
                else
                    System.out.print("Insurance does not exist");
                adminInsuranceMenu();
                break;

            case 6:
                InsuranceClient.main(null); // If you want to return to the client menu
                break;

            default:
                System.out.print("Choose between 1 to 6");
        }
    }

    public void userInsuranceMenu() {
        while(true) {
            System.out.println("============================================");
            System.out.println("            1) View My Property Insurance   ");
            System.out.println("            2) View All Property Insurances ");
            System.out.println("            3) Upgrade Existing Insurance   ");
            System.out.println("            4) Remove Property Insurance    ");
            System.out.println("            5) Buy Property Insurance       ");
            System.out.println("            6) Back                         ");
            System.out.println("============================================");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Feature under progress");
                    userInsuranceMenu();
                    break;

                case 2:
                    List<Insurance> viewInsurances = daoImpl.viewAllInsurances();
                    System.out.println("ID" + "\t" + "Name" + "\t" + "Price" + "\t" + "Type");
                    for (Insurance i : viewInsurances) {
                        System.out.println(i.getInsuranceId() + "\t" + i.getInsuranceName() + "\t" + i.getInsurancePrice() + "\t" + i.getInsuranceType());
                    }
                    userInsuranceMenu();
                    break;

                case 3:
                    System.out.println("Enter Insurance id:");
                    int updateId = sc.nextInt();
                    int uid = daoImpl.updateInsurance(updateId);
                    if (uid != 0)
                        System.out.println("Updated successfully");
                    else
                        System.out.print("Insurance does not exist");
                    userInsuranceMenu();
                    break;

                case 4:
                    System.out.println("Enter Insurance id:");
                    int delId = sc.nextInt();
                    boolean delIns = daoImpl.deleteInsurance(delId);
                    if (delIns)
                        System.out.println("Successfully deleted");
                    else
                        System.out.print("Insurance does not exist");
                    userInsuranceMenu();
                    break;

                case 5:
                    System.out.println("Enter which insurance you want to buy:");
                    int insuranceId = sc.nextInt();
                    for (Insurance i : daoImpl.addInsurances) {
                        if (i.getInsuranceId() == insuranceId) {
                            daoImpl.addInsurances.remove(i);
                            System.out.print("Insurance bought successfully");
                            break;
                        }
                    }
                    userInsuranceMenu();
                    break;

                case 6:
                    InsuranceClient.main(null);
                    break;

                default:
                    System.out.print("Choose between 1 to 6");
            }
        }
    }
}
