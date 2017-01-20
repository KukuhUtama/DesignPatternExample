package org.personal.design.bridgepattern;

public class ConcretePrinter extends AbstractPrinter {

	public ConcretePrinter(IPrinterDocument printDocument) {
		super(printDocument);
	}

	@Override
	public void printDocument() {
		printDocument.printDocument();
	}

}
