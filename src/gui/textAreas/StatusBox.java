package gui.textAreas;


public class StatusBox extends AbstractEditableTextBox {

	public StatusBox(double prefHeightRatio, double prefWidthRatio,
			double xLocation, double yLocation, double overlayWidth,
			double overlayHeight, String initText, boolean isPrompt) {
		super(prefHeightRatio, prefWidthRatio, xLocation, yLocation, overlayWidth,
				overlayHeight, initText, isPrompt);
		
		this.prefHeightRatio = prefHeightRatio;
		this.prefWidthRatio = prefWidthRatio;
		this.setxLocation(xLocation);
		this.setyLocation(yLocation);
		this.overlayHeight = overlayHeight; 
		this.overlayWidth = overlayWidth;
		this.initText = initText;
		this.isPrompt = isPrompt;
		
		this.textArea = makeTextArea();
		this.textArea.setEditable(false);

		
		this.label.getStyleClass().add("toplabel");

		setRegionPreferences();
		addTextAreaToRegion();
	}

	@Override
	public void updateText() {
		// TODO Auto-generated method stub
		
	}

}
