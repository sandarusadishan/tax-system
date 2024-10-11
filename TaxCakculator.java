/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taxcakculator;

/**
 *
 * @author Shan
 */
import java.util.Scanner;

public class TaxCakculator {

    public static void main(String[] args) {
        int number;

        L6:
        do {

            System.out.println("");
            System.out.println("\t\t\t\t\t\t  __  ______  _________ ________\n"
                    + "\t\t\t\t\t\t |  \\/      \\|         |        \\\n"
                    + "\t\t\t\t\t\t  \\$|  $$$$$$| $$$$$$$$$\\$$$$$$$$\n"
                    + "\t\t\t\t\t\t |  | $$   \\$| $$__       | $$\n"
                    + "\t\t\t\t\t\t | $| $$     | $$  \\      | $$\n"
                    + "\t\t\t\t\t\t | $| $$   __| $$$$$      | $$\n"
                    + "\t\t\t\t\t\t | $| $$__/  | $$_____    | $$\n"
                    + "\t\t\t\t\t\t | $$\\$$    $| $$     \\   | $$\n"
                    + "\t\t\t\t\t\t  \\$$ \\$$$$$$ \\$$$$$$$$    \\$$");

            System.out.println(" \n"
                    + "  _______           __    __    _____              _         _____   _    _    _                  _______    _____     ____\n"
                    + " |__   __|   /\\     \\ \\  / /   / ____|     /\\     | |       / ____| | |  | |  | |          /\\    |__   __|  / ___ \\   |  _  \\\n"
                    + "    | |     /  \\     \\ \\/ /   | |         /  \\    | |      | |      | |  | |  | |         /  \\      | |    | |   | |  | |_)  |\n"
                    + "    | |    / /\\ \\     >  <    | |        / /\\ \\   | |      | |      | |  | |  | |        / /\\ \\     | |    | |   | |  |  _  /\n"
                    + "    | |   / ____ \\   /  .  \\  | |____   / ___  \\  | |____  | |____  | |__| |  | |____   / ____ \\    | |    | |___| |  | | \\ \\\n"
                    + "    |_|  /_/    \\_\\ /_/   \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/   |______| /_/    \\_\\   |_|     \\_____/   |_|  \\_\\");

            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

            
            int i;
            for (i = 0; i < 150; i++) {
                System.out.print("-");
            }
            System.out.println("");
            int j;
            for (j = 0; j < 150; j++) {
                System.out.print("-");
            }

            Scanner Sc = new Scanner(System.in);

            System.out.println("");

            System.out.println("\t[1] Withholding Tax");
            System.out.println("\t[2] Payable Tax");
            System.out.println("\t[3] Income Tax");
            System.out.println("\t[4] Social Security Contribution Levy (SSCL) Tax");
            System.out.println("\t[5] Leasing Payment");
            System.out.println("\t[6] Exit");
            System.out.println("");
            System.out.print("Enter an option to continue ->");

            number = Sc.nextInt();

            switch (number) {

                case 1:
                    int Case1number;
                    L1:
                    do {
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("|\t\t\t\t\t\t\t\tWithholding Tax\t\t\t\t\t\t\t\t\t\t|");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

                        System.out.println("");
                        System.out.println("");
                        System.out.println("\t[1] Rent Tax");
                        System.out.println("\t[2] Bank Interest Tax");
                        System.out.println("\t[3] Divident Tax");
                        System.out.println("\t[4] Exit");

                        System.out.println("");
                        System.out.print("Enter an option to continue ->");

                        Case1number = Sc.nextInt();

                        switch (Case1number) {

                            case 1:
                                L2:
                                do {
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("|\t\t\t\t\t\t\t\t  RENT TAX\t1\t\t\t\t\t\t\t\t\t|");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.print("Enter your rent            : ");
                                    double renttax = Sc.nextInt();

                                    if (renttax <= 100000) {
                                        ;
                                        System.out.println("");
                                        System.out.println("\tYou dont have to pay rent tax...");
                                    } else if (renttax > 100000) {
                                        double renttax1 = renttax - 100000;
                                        renttax1 = renttax1 * 10;
                                        double rr = renttax1 / 100;
                                        System.out.println("\tYou  have to pay rent tax  : " + rr);
                                        System.out.println("");
                                        System.out.println("");
                                        break;

                                    }

                                    System.out.println("Do you want to calculate another rent tax (y/n) : ");
                                    String Yn = Sc.next().toLowerCase();

                                    if (Yn.equals("Y")) {
                                        continue L2;
                                    }
                                    if (Yn.equals("n")) {
                                        continue L1;

                                    } else {
                                        System.out.println("\\n\\invalid input   ...");
                                    }

                                } while (true);
                                break;

                            case 2:
                                L3:
                                do {
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("|\t\t\t\t\t\t\t\t  BANK INTEREST TAX\t\t\t\t\t\t\t\t\t\t|");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.print("Enter your bank interest per year             : ");
                                    double BankInterest = Sc.nextInt();
                                    System.out.println("");
                                    BankInterest = BankInterest * 5 / 100;
                                    System.out.println("You  have to pay bank interest Tax per year   : " + BankInterest);
                                    System.out.println("");
                                    System.out.println("");

                                    System.out.println("Do you want to calculate another BANK INTEREST TAX (y/n) : ");
                                    String Yn = Sc.next().toLowerCase();

                                    if (Yn.equals("Y")) {
                                        continue L3;
                                    }
                                    if (Yn.equals("n")) {
                                        continue L1;

                                    } else {
                                        System.out.println("ninvalid input   ...");
                                    }

                                } while (true);

                            case 3:
                                L4:
                                do {
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("|\t\t\t\t\t\t\t\tDIVIDEND TAX\t\t\t\t\t\t\t\t\t\t|");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

                                    System.out.print("Enter your total dividend per year          : ");
                                    double divident = Sc.nextInt();
                                    if (divident <= 100000) {
                                        System.out.println(" ");
                                        System.out.println("\tYou dont have to pay dividend Tax...");
                                    } else if (divident > 100000) {
                                        double divident1 = divident - 100000;
                                        double divident2 = divident1 * 0.14;
                                        System.out.println("You  have to pay dividend Tax per year     : " + divident2);
                                    }
                                    System.out.println("Do you want to calculate another DIVIDEND TAX (y/n) : ");
                                    String Yn = Sc.next().toLowerCase();

                                    if (Yn.equals("Y")) {
                                        continue L4;
                                    }
                                    if (Yn.equals("n")) {
                                        continue L1;

                                    } else {
                                        System.out.println("\\n\\ninvalid input   ...");
                                    }

                                } while (true);

                            case 4:
                                System.out.println("");
                                System.out.println("        Exit");
                                System.out.println("");
                                break;

                        }

                    } while (Case1number != 4);
                    break;

                case 2:
                    L9:
                    do {

                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("|\t\t\t\t\t\t\t\t  PAYBLE TAX\t1\t\t\t\t\t\t\t\t\t|");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

                       
                        System.out.println("");
                        System.out.print("Enter your employee payment per month      :");
                        double employeePayment = Sc.nextInt();

                        if (employeePayment <= 100000) {

                            System.out.println("You dont have to pay payble Tax ...");

                        } else if (employeePayment <= 141667) {
                            double A = (employeePayment - 100000) * 6 / 100;
                            System.out.println("You  have to pay payble Tax per month  : " + A);

                        } else if (100000 >= employeePayment && employeePayment <= 183333) {
                            double a = employeePayment - 100000;
                            double aa = a - 41667;
                            double aaa = 41667 * 6 / 100;
                            double aaaa = aa * 12 / 100;
                            double aaaaa = aaa + aaaa;
                            System.out.println("You  have to pay payble Tax per month  : " + aaaaa);

                        } else if (183333 >= employeePayment && employeePayment <= 225000) {
                            double b = employeePayment - 100000;
                            double bb = b - 41667;
                            double bbb = 41667 * 6 / 100;
                            double bbbb = 183333 - 141667;
                            double bbbbb = bbbb * 12 / 100;
                            double bbbbbb = employeePayment - 183333;
                            double bbbbbbb = bbbbbb * 18 / 100;
                            double bbbbbbbb = bbb + bbbbb + bbbbbbb;
                            System.out.println("You  have to pay payble Tax per month  : " + bbbbbbbb);

                        } else if (225000 >= employeePayment && employeePayment <= 266667) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = employeePayment - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = ddd + ddddd + ddddddd + ddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddd);

                        } else if (266667 >= employeePayment && employeePayment <= 308333) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 266667 - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = employeePayment - 266667;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddddd);

                        } else if (308333 >= employeePayment && employeePayment <= 350000) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 266667 - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = 308333 - 266667;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = employeePayment - 308333;
                            double ddddddddddddd = dddddddddddd * 36 / 100;
                            double dddddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd + ddddddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddddddd);

                        } else if (350000 >= employeePayment && employeePayment <= 450000) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 266667 - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = 308333 - 266667;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = 350000 - 308333;
                            double ddddddddddddd = dddddddddddd * 36 / 100;
                            double dddddddddddddd = employeePayment - 350000;
                            double ddddddddddddddd = dddddddddddddd * 36 / 100;
                            double dddddddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd + ddddddddddddd + ddddddddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddddddddd);

                        } else if (450000 >= employeePayment && employeePayment <= 550000) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 266667 - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = 308333 - 266667;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = 350000 - 308333;
                            double ddddddddddddd = dddddddddddd * 36 / 100;
                            double dddddddddddddd = 450000 - 350000;
                            double ddddddddddddddd = dddddddddddddd * 36 / 100;
                            double dddddddddddddddd = employeePayment - 450000;
                            double ddddddddddddddddd = dddddddddddddddd * 36 / 100;
                            double dddddddddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd + ddddddddddddd + ddddddddddddddd + ddddddddddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddddddddddd);

                        } else if (550000 >= employeePayment && employeePayment <= 650000) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 266667 - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = 308333 - 266667;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = 350000 - 308333;
                            double ddddddddddddd = dddddddddddd * 36 / 100;
                            double dddddddddddddd = 450000 - 350000;
                            double ddddddddddddddd = dddddddddddddd * 36 / 100;
                            double dddddddddddddddd = 550000 - 450000;
                            double ddddddddddddddddd = dddddddddddddddd * 36 / 100;
                            double dddddddddddddddddd = employeePayment - 550000;
                            double ddddddddddddddddddd = dddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd + ddddddddddddd + ddddddddddddddd + ddddddddddddddddd + ddddddddddddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddddddddddddd);

                        } else if (650000 >= employeePayment && employeePayment <= 750000) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 266667 - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = 308333 - 266667;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = 350000 - 308333;
                            double ddddddddddddd = dddddddddddd * 36 / 100;
                            double dddddddddddddd = 450000 - 350000;
                            double ddddddddddddddd = dddddddddddddd * 36 / 100;
                            double dddddddddddddddd = 550000 - 450000;
                            double ddddddddddddddddd = dddddddddddddddd * 36 / 100;
                            double dddddddddddddddddd = 650000 - 550000;
                            double ddddddddddddddddddd = dddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddd = employeePayment - 650000;
                            double ddddddddddddddddddddd = dddddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd + ddddddddddddd + ddddddddddddddd + ddddddddddddddddd + ddddddddddddddddddd + ddddddddddddddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddddddddddddddd);

                        } else if (750000 >= employeePayment && employeePayment <= 900000) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 266667 - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = 308333 - 266667;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = 350000 - 308333;
                            double ddddddddddddd = dddddddddddd * 36 / 100;
                            double dddddddddddddd = 450000 - 350000;
                            double ddddddddddddddd = dddddddddddddd * 36 / 100;
                            double dddddddddddddddd = 550000 - 450000;
                            double ddddddddddddddddd = dddddddddddddddd * 36 / 100;
                            double dddddddddddddddddd = 650000 - 550000;
                            double ddddddddddddddddddd = dddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddd = 750000 - 650000;
                            double ddddddddddddddddddddd = dddddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddddd = employeePayment - 750000;
                            double ddddddddddddddddddddddd = dddddddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd + ddddddddddddd + ddddddddddddddd + ddddddddddddddddd + ddddddddddddddddddd + ddddddddddddddddddddd + ddddddddddddddddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddddddddddddddddd);

                        } else if (employeePayment >= 1000000) {
                            double d = employeePayment - 100000;
                            double dd = d - 41667;
                            double ddd = 41667 * 6 / 100;
                            double dddd = 183333 - 141667;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 225000 - 183333;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 266667 - 225000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = 308333 - 266667;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = 350000 - 308333;
                            double ddddddddddddd = dddddddddddd * 36 / 100;
                            double dddddddddddddd = 450000 - 350000;
                            double ddddddddddddddd = dddddddddddddd * 36 / 100;
                            double dddddddddddddddd = 550000 - 450000;
                            double ddddddddddddddddd = dddddddddddddddd * 36 / 100;
                            double dddddddddddddddddd = 650000 - 550000;
                            double ddddddddddddddddddd = dddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddd = 750000 - 650000;
                            double ddddddddddddddddddddd = dddddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddddd = 90000 - 750000;
                            double ddddddddddddddddddddddd = dddddddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddddddd = employeePayment - 90000;
                            double ddddddddddddddddddddddddd = dddddddddddddddddddddddd * 36 / 100;
                            double dddddddddddddddddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd + ddddddddddddd + ddddddddddddddd + ddddddddddddddddd + ddddddddddddddddddd + ddddddddddddddddddddd + ddddddddddddddddddddddd + ddddddddddddddddddddddddd;
                            System.out.println("You  have to pay payble Tax per month  : " + dddddddddddddddddddddddddd);
                        }
                       
                        System.out.print("Enter your employee payment per month      : ");

                        System.out.println("");

                        if (employeePayment <= 0) {
                            System.out.println("You Enter the in valid value...");
                        } else if (employeePayment > 0) {
                            if (employeePayment <= 100000) {
                                System.out.println(" ");
                                System.out.println("\tYou Don't have pay payble tax...");
                            } else if (employeePayment > 100000 && employeePayment <= 141667) {
                                double d = (employeePayment - 100000) * 6 / 100;
                                System.out.println("You have to pay payble tax per month     : " + d);
                            } else if (employeePayment > 141667 && employeePayment <= 183333) {
                                double d = 2500.0;
                                double dd = (employeePayment - 141667) * 12 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per month     : " + ddd);
                            } else if (employeePayment >= 183333 && employeePayment <= 225000) {

                                double d = 7500.00;
                                double dd = (employeePayment - 183333) * 18 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per month     : " + ddd);
                            } else if (employeePayment > 225000 && employeePayment <= 266667) {

                                double d = 15000.00;
                                double dd = (employeePayment - 225000) * 24 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per month     : " + ddd);
                            } else if (employeePayment > 266667 && employeePayment <= 308333) {

                                double d = 25000.00;
                                double dd = (employeePayment - 266667) * 30 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per month     : " + ddd);
                            } else if (employeePayment > 308333) {

                                double d = 37500.00;
                                double dd = (employeePayment - 308333) * 36 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per month     : " + ddd);
                                break;
                            }
                            System.out.println("Do you want to calculate another payble tax (y/n) : ");
                            String a = Sc.next().toLowerCase();

                            if (a.equals("Y")) {
                                continue L9;

                            }
                            if (a.equals("n")) {
                                continue L6;

                            } else {
                                System.out.println("");
                            }
                        }
                    } while (true);

                case 3:
                    L22:
                    do {
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("|\t\t\t\t\t\t\t\t  INCOME TAX\t1\t\t\t\t\t\t\t\t\t|");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

                        
                        System.out.println("");
                        System.out.print("Enter your total income per year  :");
                        double income = Sc.nextInt();

                        if (income <= 1200000) {
                            System.out.println("You dont have to Income Tax ...");

                        } else if (income <= 1700000) {
                            double A = income - 1200000 * 6 / 100;
                            System.out.println("You  have to pay Income Tax per year  : " + A);

                        } else if (income <= 2200000) {
                            double a = 1700000 - 1200000;
                            double aaa = a * 6 / 100;
                            double aa = income - 1700000;
                            double aaaa = aa * 12 / 100;
                            double aaaaa = aaa + aaaa;
                            System.out.println("You  have to pay Income Tax per year  : " + aaaaa);

                        } else if (income <= 2700000) {
                            double b = 1700000 - 1200000;

                            double bbb = b * 6 / 100;
                            double bbbb = 1700000 - 1200000;
                            double bbbbb = bbbb * 12 / 100;
                            double bbbbbb = income - 2200000;
                            double bbbbbbb = bbbbbb * 18 / 100;
                            double bbbbbbbb = bbb + bbbbb + bbbbbbb;
                            System.out.println("You  have to pay Income Tax per year  : " + bbbbbbbb);

                        } else if (income <= 3200000) {
                            double d = 1700000 - 1200000;

                            double ddd = d * 6 / 100;
                            double dddd = 1700000 - 1200000;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 2700000 - 2200000;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = income - 2700000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = ddd + ddddd + ddddddd + ddddddddd;
                            System.out.println("You  have to pay Income Tax per year  : " + dddddddddd);

                        } else if (income <= 3700000) {
                            double d = 1700000 - 1200000;

                            double ddd = d * 6 / 100;
                            double dddd = 1700000 - 1200000;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 2700000 - 2200000;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 3200000 - 2700000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = income - 3200000;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd;
                            System.out.println("You  have to pay Income Tax per year  : " + dddddddddddd);

                        } else if (income > 3700000) {
                            double d = 1700000 - 1200000;

                            double ddd = d * 6 / 100;
                            double dddd = 1700000 - 1200000;
                            double ddddd = dddd * 12 / 100;
                            double dddddd = 2700000 - 2200000;
                            double ddddddd = dddddd * 18 / 100;
                            double dddddddd = 3200000 - 2700000;
                            double ddddddddd = dddddddd * 24 / 100;
                            double dddddddddd = 3700000 - 3200000;
                            double ddddddddddd = dddddddddd * 30 / 100;
                            double dddddddddddd = income - 3700000;
                            double ddddddddddddd = dddddddddddd * 36 / 100;
                            double dddddddddddddd = ddd + ddddd + ddddddd + ddddddddd + ddddddddddd + ddddddddddddd;
                            System.out.println("You  have to pay Income Tax per year  : " + dddddddddddddd);
                        }
                       
                        System.out.print("Enter your Total income per year        : ");

                        System.out.println("");

                        if (income <= 0) {
                            System.out.println("You Enter the in valid value...");
                        } else if (income > 0) {
                            if (income <= 1200000) {
                                System.out.println(" ");
                                System.out.println("/tYou Don't have pay Income tax...");
                            } else if (income > 1200000 && income <= 1700000) {
                                double d = (income - 1200000) * 6 / 100;
                                System.out.println("You have to pay payble tax per year  : " + d);
                            } else if (income > 1700000 && income <= 2200000) {
                                double d = 30000.0;
                                double dd = (income - 1700000) * 12 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per year  : " + ddd);
                            } else if (income >= 2200000 && income <= 2700000) {

                                double d = 90000.00;
                                double dd = (income - 2200000) * 18 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per year  : " + ddd);
                            } else if (income > 2700000 && income <= 3200000) {

                                double d = 180000.00;
                                double dd = (income - 2700000) * 24 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per year  : " + ddd);
                            } else if (income > 3200000 && income <= 3700000) {

                                double d = 300000.00;
                                double dd = (income - 3200000) * 30 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per year  : " + ddd);
                            } else if (income > 3700000) {

                                double d = 450000.00;
                                double dd = (income - 3700000) * 36 / 100;
                                double ddd = d + dd;
                                System.out.println("You have to pay payble tax per year  : " + ddd);
                            }

                        }

                        System.out.println("Do you want to calculate another INCOME TAX (y/n) : ");
                        String b = Sc.next().toLowerCase();

                        if (b.equals("Y")) {
                            continue L22;

                        }
                        if (b.equals("n")) {
                            continue L6;

                        } else {
                            System.out.println("");
                        }

                    } while (true);

                case 4:
                    L8:
                    do {
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("|\t\t\t\t\t\t\t\tSocial Security Contribution Levy (SSCL) Tax\t\t\t\t\t\t\t\t\t\t|");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

                        System.out.println("");
                        System.out.print("Enter value of Good or Service  : ");
                        double Goods = Sc.nextInt();

                        double saleTax = Goods * 0.025;
                        double ValueGoods = Goods + saleTax;
                        double Vat = ValueGoods * 0.15;

                        double SSCL = saleTax + Vat;
                        System.out.println("You have to pay SSCL Tax         : " + SSCL);

                        System.out.println("Do you want to calculate another payble tax (y/n) : ");
                        String b = Sc.next().toLowerCase();

                        if (b.equals("Y")) {
                            continue L8;

                        }
                        if (b.equals("n")) {
                            continue L6;

                        } else {
                            System.out.println("");
                        }

                    } while (true);

                case 5:

                    int option;
                    L23:
                    do {
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("|\t\t\t\t\t\t\t\tLeasing Payment\t\t\t\t\t\t\t\t\t\t|");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

                        System.out.println("");
                        System.out.println("");
                        System.out.println("\t [1] Calculate Monthly Installment");
                        System.out.println("\t [2] Search Leasing Category");
                        System.out.println("\t [3] Find Leasing Amount");
                        System.out.println("\t [4] Exit");
                        System.out.println("");
                        System.out.print("Enter an option to continue ->");
                        option = Sc.nextInt();
                        switch (option) {

                            case 1:

                                L24:
                                do {

                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("|\t\t\t\t\t\t\t\t  Calculate Leasing Payment\t\t\t\t\t\t\t\t\t\t|");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.print("Enter lease amount          : ");
                                    double amount = Sc.nextInt();
                                    double amountt = amount;
                                    double amount1 = amount;

                                    System.out.print("Enter annual interest rate  : ");
                                    double rate = Sc.nextDouble();
                                    double cal = rate / 1200;

                                    System.out.print("Enter number of year        : ");
                                    double year = Sc.nextInt();
                                    double pay = year * 12;

                                    double monthly = amountt * cal;
                                    double monthly2 = Math.pow((1 + cal), pay);
                                    double monthly3 = 1 / monthly2;
                                    double monthly4 = 1 - monthly3;

                                    double monthly5 = monthly / monthly4;
                                    System.out.println("Your monthly instalment     : " + monthly5);
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("You like to choose another one you  can select. If you dont want it");
                                    System.out.println("You can exit press number [4] ");

                                    System.out.println("Do you want to calculate another rent tax (y/n) : ");
                                    String Yn = Sc.next().toLowerCase();

                                    if (Yn.equals("Y")) {
                                        continue L24;
                                    }
                                    if (Yn.equals("n")) {
                                        continue L23;

                                    } else {
                                        System.out.println("\\n\\ninvalid input   ...");
                                    }

                                } while (true);

                            case 2:

                                L25:
                                do {

                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("|\t\t\t\t\t\t\t\t  Search Leasing Category\t\t\t\t\t\t\t\t\t\t|");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

                                    System.out.print("Enter lease amount         : ");
                                    double leaseAmount2 = Sc.nextDouble();

                                    System.out.print("Enter anual interest rate  : ");
                                    double interestRate2 = Sc.nextDouble();
                                    double interestRate22 = interestRate2 / 1200;

                                    double yer = 3 * 12;
                                    double yer2 = 4 * 12;
                                    double yer3 = 5 * 12;

                                    double intrt = leaseAmount2 * interestRate22;

                                    double xx = Math.pow((1 + interestRate22), yer);
                                    double xxx = Math.pow((1 + interestRate22), yer2);
                                    double xxxx = Math.pow((1 + interestRate22), yer3);

                                    double y = 1 / xx;
                                    double yy = 1 / xxx;
                                    double yyy = 1 / xxxx;

                                    double h = 1 - y;
                                    double hh = 1 - yy;
                                    double hhh = 1 - yyy;

                                    double monthly22 = intrt / h;
                                    double monthly33 = intrt / hh;

                                    double monthly44 = intrt / hhh;
                                    System.out.println("");

                                    System.out.println("Your monthly instalment for 3 years leasing plan  -  : " + monthly22);
                                    System.out.println("Your monthly instalment for 4 years leasing plan  -  : " + monthly33);
                                    System.out.println("Your monthly instalment for 5 years leasing plan  -  : " + monthly44);

                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("You like to choose another one you  can select. If you dont want it");
                                    System.out.println("You can exit press number [4] ");

                                    System.out.println("Do you want to calculate another rent tax (y/n) : ");
                                    String Yn = Sc.next().toLowerCase();

                                    if (Yn.equals("Y")) {
                                        continue L25;
                                    }
                                    if (Yn.equals("n")) {
                                        continue L23;

                                    } else {
                                        System.out.println("\\n\\ninvalid input   ...");
                                    }

                                } while (true);

                            case 3:

                                L26:
                                do {

                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("|\t\t\t\t\t\t\t\t  Find Leasing Amount\t\t\t\t\t\t\t\t\t\t|");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

                                    System.out.print("Enter the monthly lase payment you can afford  : ");
                                    double afford = Sc.nextDouble();

                                    System.out.print("Enter number of year                           : ");
                                    double yearrr = Sc.nextDouble();
                                    double yearrrrr = yearrr * 12;

                                    System.out.print("Enter annual interest rate                     : ");
                                    double rrate = Sc.nextDouble();
                                    double newrate = rrate / 1200;

                                    double gg = Math.pow((1 + newrate), yearrrrr);
                                    double ee = 1 / gg;
                                    double qq = 1 - ee;
                                    double swe = afford * qq;
                                    double new1 = swe / newrate;
                                    System.out.println("You can get Amount                             : " + new1);
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("You like to choose another one you  can select. If you dont want it");
                                    System.out.println("You can exit press number [4] ");

                                    System.out.println("Do you want to calculate another rent tax (y/n) : ");
                                    String Yn = Sc.next().toLowerCase();

                                    if (Yn.equals("Y")) {
                                        continue L26;
                                    }
                                    if (Yn.equals("n")) {
                                        continue L23;

                                    } else {
                                        System.out.println("\\n\\ninvalid input   ...");
                                    }

                                } while (true);

                            case 4:
                                System.out.println("");
                                System.out.println("\tExit");
                                break;

                        }

                    } while (option != 4);

                case 6:
                    System.out.println("");
                    System.out.println("\t\t\t\t\t\t\t       _      _ _  ___\n"
                            + "\t\t\t\t\t\t\t      |_  \\/   |    |\n"
                            + "\t\t\t\t\t\t\t      |_  /\\  _|_   |");
                    System.out.println("");

            }
        } while (number != 6);

        int ppp;
        System.out.print("\t\t\t\t\t\t\t\t");
        for (ppp = 0; ppp < 11; ppp++) {

            System.out.print("*");

        }
        System.out.println("");
        int pppp;
        for (pppp = 0; pppp < 1; pppp++) {

            System.out.println("\t\t\t\t\t\t\t\t" + "*" + "  *   *  " + "*");
        }
        int pppppp;
        for (pppppp = 0; pppppp < 1; pppppp++) {

            System.out.println("\t\t\t\t\t\t\t\t" + "*" + "    *   " + " *");
        }
        int pppppppp;
        for (pppppppp = 0; pppppppp < 1; pppppppp++) {

            System.out.println("\t\t\t\t\t\t\t\t" + "*" + "   ***  " + " *");
        }

        int ppppppp;
        System.out.print("\t\t\t\t\t\t\t\t");
        for (ppppppp = 0; ppppppp <= 10; ppppppp++) {

            System.out.print("*");
        }

        System.out.println("");

        System.out.println("\t\t\t\t\t\t\tThank you use my Tax Calculator");
        System.out.println("\t\t\t\t\t\t\tHave a nice Day.......");
        System.out.println("");
        System.out.println("");

    }
}
