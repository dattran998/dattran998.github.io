package main;

import entity.PaperType;
import entity.Reporter;
import entity.ReportingManagement;
import entity.ReportingManagementDetail;
import logichandle.MenuLogicManagement;

import java.util.Scanner;

public class main {
//    private static Reporter[] reporters = new Reporter[100];
//    private static PaperType[] paperTypes = new PaperType[100];


    public static void main(String[] args) {
        MenuLogicManagement menuLogicManagement = new MenuLogicManagement();
        menuLogicManagement.menu();
    }

}
