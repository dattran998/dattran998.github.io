package main;

import entity.Employee;
import entity.Factory;
import entity.Timesheet;
import entity.TimesheetDetail;
import logichandle.MenuLogicManagement;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MenuLogicManagement menuLogicManagement = new MenuLogicManagement();
        menuLogicManagement.menu();
    }

}
