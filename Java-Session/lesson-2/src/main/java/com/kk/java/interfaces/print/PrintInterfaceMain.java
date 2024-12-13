/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.interfaces.print;


interface Printable{
    void print();
}

abstract class CommonPrintBehavior implements Printable{

    @Override
    public abstract void print();

    public void loadPage(){
        System.out.println("Page is loaded");
    }

}


class LaserJetPrinter extends CommonPrintBehavior{

    @Override
    public void print() {
        super.loadPage();
        System.out.println("It's a LaserJet");
    }
}

class DotMatrixPrinter extends CommonPrintBehavior{

    @Override
    public void print() {
        super.loadPage();
        System.out.println("It's a DotMatrix");
    }
}


class InkJetPrinter extends CommonPrintBehavior{

    @Override
    public void print() {
        super.loadPage();
        System.out.println("It's a InkJetPrinter");
    }
}

public class PrintInterfaceMain {

    public static void main(String[] args) {
        Printable inkJetPrinter = new InkJetPrinter();
        Printable dotMatrixPrinter = new DotMatrixPrinter();
        Printable laserJetPrinter = new LaserJetPrinter();
        inkJetPrinter.print();
        dotMatrixPrinter.print();
        laserJetPrinter.print();
    }
}
