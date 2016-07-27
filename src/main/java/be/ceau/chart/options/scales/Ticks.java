package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import be.ceau.chart.JavaScriptFunction;
import be.ceau.chart.color.Color;

/**
 * The grid line configuration is nested under the scale configuration in the
 * ticks key. It defines options for the tick marks that are generated by the
 * axis.
 */
public class Ticks {

	/**
	 * If true, automatically calculates how many labels that can be shown and
	 * hides labels accordingly. Turn it off to show all labels no matter what
	 * Default: true
	 */
	private Boolean autoSkip;

	/**
	 * Returns the string representation of the tick value as it should be
	 * displayed on the chart. See callback section below. Default:
	 * function(value) { return helpers.isArray(value) ? value : '' + value; }
	 */
	private JavaScriptFunction callback;

	/**
	 * If true, show the ticks. Default: true
	 */
	private Boolean display;

	/**
	 * Font color for the tick labels. Default: "#666"
	 */
	private Color fontColor;

	/**
	 * Font family for the tick labels, follows CSS font-family options.
	 * Default: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 */
	private String fontFamily;

	/**
	 * Font size for the tick labels. Default: 12
	 */
	private BigDecimal fontSize;

	/**
	 * Font style for the tick labels, follows CSS font-style options (i.e.
	 * normal, italic, oblique, initial, inherit). Default: "normal"
	 */
	private String fontStyle;

	/**
	 * Distance in pixels to offset the label from the centre point of the tick
	 * (in the y direction for the x axis, and the x direction for the y axis).
	 * Note: this can cause labels at the edges to be cropped by the edge of the
	 * canvas Default: 0
	 */
	private BigDecimal labelOffset;

	/**
	 * Maximum rotation for tick labels when rotating to condense labels. Note:
	 * Rotation doesn't occur until necessary. Note: Only applicable to
	 * horizontal scales. Default: 90
	 */
	private BigDecimal maxRotation;

	/**
	 * Minimum rotation for tick labels. Note: Only applicable to horizontal
	 * scales. Default: 0
	 */
	private BigDecimal minRotation;

	/**
	 * Flips tick labels around axis, displaying the labels inside the chart
	 * instead of outside. Note: Only applicable to vertical scales. Default:
	 * false
	 */
	private Boolean mirror;

	/**
	 * Padding between the tick label and the axis. Note: Only applicable to
	 * horizontal scales. Default: 10
	 */
	private BigDecimal padding;

	/**
	 * Reverses order of tick labels. Default: false
	 */
	private Boolean reverse;

	public Boolean getAutoSkip() {
		return autoSkip;
	}

	public void setAutoSkip(Boolean autoSkip) {
		this.autoSkip = autoSkip;
	}

	public JavaScriptFunction getCallback() {
		return callback;
	}

	public void setCallback(JavaScriptFunction callback) {
		this.callback = callback;
	}

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public Color getFontColor() {
		return fontColor;
	}

	public void setFontColor(Color fontColor) {
		this.fontColor = fontColor;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}

	public BigDecimal getFontSize() {
		return fontSize;
	}

	public void setFontSize(BigDecimal fontSize) {
		this.fontSize = fontSize;
	}

	public String getFontStyle() {
		return fontStyle;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

	public BigDecimal getLabelOffset() {
		return labelOffset;
	}

	public void setLabelOffset(BigDecimal labelOffset) {
		this.labelOffset = labelOffset;
	}

	public BigDecimal getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(BigDecimal maxRotation) {
		this.maxRotation = maxRotation;
	}

	public BigDecimal getMinRotation() {
		return minRotation;
	}

	public void setMinRotation(BigDecimal minRotation) {
		this.minRotation = minRotation;
	}

	public Boolean getMirror() {
		return mirror;
	}

	public void setMirror(Boolean mirror) {
		this.mirror = mirror;
	}

	public BigDecimal getPadding() {
		return padding;
	}

	public void setPadding(BigDecimal padding) {
		this.padding = padding;
	}

	public Boolean getReverse() {
		return reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
	}

}