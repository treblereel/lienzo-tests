package com.ait.lienzo.test.stub;

import com.ait.lienzo.client.core.types.BoundingBox;
import com.ait.lienzo.client.core.util.ScratchPad;
import com.ait.lienzo.shared.core.types.TextAlign;
import com.ait.lienzo.shared.core.types.TextBaseLine;
import com.ait.lienzo.shared.core.types.TextUnit;
import com.ait.lienzo.test.annotation.StubClass;
import com.ait.lienzo.tools.client.collection.NFastDoubleArray;
import com.ait.lienzo.tools.client.collection.NFastStringMap;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 11/1/19
 */
@StubClass("com.ait.lienzo.client.core.shape.TextUtils")
public class TextUtils {

    static ScratchPad FORBOUNDS = new ScratchPad(1, 1);

    static com.ait.lienzo.tools.client.collection.NFastStringMap<NFastDoubleArray> OFFSCACHE = new NFastStringMap<>();

    public static BoundingBox getBoundingBox(final String text, final double size, final String style, final String family, final TextUnit unit, final TextBaseLine baseline, final TextAlign align) {
        return BoundingBox.fromDoubles(0, 0, 2d, 0);
    }

    public static String getFontString(final double size, final TextUnit unit, final String style, final String family) {
        return style + " " + size + unit.toString() + " " + family;
    }

    public static String padString(String string, int targetSize, char padChar, TextAlign where) {
        return "a     ";

    }

}