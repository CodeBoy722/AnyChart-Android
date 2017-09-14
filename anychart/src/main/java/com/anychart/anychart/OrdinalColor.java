package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class OrdinalColor extends JsObject {

    
    private String colorToValue;

    public void setColortovalue(String colorToValue) {
        this.colorToValue = colorToValue;
    }

    private String[] colors;

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    private Boolean silently;

    public void setFinishautocalc(Boolean silently) {
        this.silently = silently;
    }

    private Double getIndexByValue;

    public void setGetindexbyvalue(Double getIndexByValue) {
        this.getIndexByValue = getIndexByValue;
    }

    private Double getRangeByValue;

    public void setGetrangebyvalue(Double getRangeByValue) {
        this.getRangeByValue = getRangeByValue;
    }

    private Double ratio;

    public void setInversetransform(Double ratio) {
        this.ratio = ratio;
    }

    private Boolean inverted;

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String names;

    public void setNames(String names) {
        this.names = names;
    }

    private String ranges;

    public void setRanges(String ranges) {
        this.ranges = ranges;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private String[] ticks;

    public void setTicks(String[] ticks) {
        this.ticks = ticks;
    }

    private Double subRangeRatio;

    public void setTransform(Double subRangeRatio) {
        this.subRangeRatio = subRangeRatio;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Double valueToColor;

    public void setValuetocolor(Double valueToColor) {
        this.valueToColor = valueToColor;
    }

    private String generateJScolorToValue() {
        if (colorToValue != null) {
            return String.format(Locale.US, "colorToValue: \"%s\",", colorToValue);
        }
        return "";
    }

    private String generateJScolors() {
        if (colors != null) {
            return String.format(Locale.US, "colors: %s,", Arrays.toString(colors));
        }
        return "";
    }

    private String generateJSsilently() {
        if (silently != null) {
            return String.format(Locale.US, "silently: %b,", silently);
        }
        return "";
    }

    private String generateJSgetIndexByValue() {
        if (getIndexByValue != null) {
            return String.format(Locale.US, "getIndexByValue: %f,", getIndexByValue);
        }
        return "";
    }

    private String generateJSgetRangeByValue() {
        if (getRangeByValue != null) {
            return String.format(Locale.US, "getRangeByValue: %f,", getRangeByValue);
        }
        return "";
    }

    private String generateJSratio() {
        if (ratio != null) {
            return String.format(Locale.US, "ratio: %f,", ratio);
        }
        return "";
    }

    private String generateJSinverted() {
        if (inverted != null) {
            return String.format(Locale.US, "inverted: %b,", inverted);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: \"%s\",", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSnames() {
        if (names != null) {
            return String.format(Locale.US, "names: \"%s\",", names);
        }
        return "";
    }

    private String generateJSranges() {
        if (ranges != null) {
            return String.format(Locale.US, "ranges: %s,", ranges);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: \"%s\",", type2);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", Arrays.toString(ticks));
        }
        return "";
    }

    private String generateJSsubRangeRatio() {
        if (subRangeRatio != null) {
            return String.format(Locale.US, "subRangeRatio: %f,", subRangeRatio);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSvalueToColor() {
        if (valueToColor != null) {
            return String.format(Locale.US, "valueToColor: %f,", valueToColor);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJScolorToValue());
        js.append(generateJScolors());
        js.append(generateJSsilently());
        js.append(generateJSgetIndexByValue());
        js.append(generateJSgetRangeByValue());
        js.append(generateJSratio());
        js.append(generateJSinverted());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSnames());
        js.append(generateJSranges());
        js.append(generateJStype2());
        js.append(generateJSticks());
        js.append(generateJSsubRangeRatio());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSvalueToColor());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}