package com.ait.lienzo.test.stub;

import com.ait.lienzo.test.annotation.StubClass;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 10/30/19
 */
@StubClass("elemental2.core.Uint8ClampedArray")
public class Uint8ClampedArray {

    public <T> T getAt(int index) {
        return (T) new Object();
    }

}
