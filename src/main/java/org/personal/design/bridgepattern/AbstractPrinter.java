package org.personal.design.bridgepattern;

public abstract class AbstractPrinter {

	protected IPrinterDocument printDocument;
	
	public AbstractPrinter(IPrinterDocument printDocument){
		this.printDocument = printDocument;
	}
	
	public abstract void printDocument();
}
