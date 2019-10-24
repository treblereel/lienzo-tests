package com.ait.lienzo.test.stub.overlays;

import com.ait.lienzo.test.annotation.StubClass;

public class NFastPrimitiveArrayBase<T extends NFastPrimitiveArrayBase<T>> extends NArrayBase<T>
{
    protected NFastPrimitiveArrayBase()
    {
    }

    public T sort()
    {
        // TODO
        return copy();
    }

    public T uniq()
    {
        // TODO
        return copy();
    }
}
