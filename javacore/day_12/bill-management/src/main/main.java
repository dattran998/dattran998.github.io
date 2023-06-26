package main;

import entity.Bill;
import entity.BillDetail;
import entity.Customer;
import entity.Service;
import logichandle.MenuLogic;

import java.security.cert.CertificateNotYetValidException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        MenuLogic menuLogic = new MenuLogic();
        menuLogic.menu();
    }


}
