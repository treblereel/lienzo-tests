package com.ait.lienzo.test.stub.overlays;

import java.util.List;

import com.ait.lienzo.test.annotation.StubClass;
import jsinterop.base.Any;

@StubClass("jsinterop.base.JsArrayLike")
public interface JsArrayLike<T> {

    default int getLength() {
        throw new UnsupportedOperationException();
    }

    default void setLength(int length) {
        throw new UnsupportedOperationException();
    }

    @SuppressWarnings("unchecked")
    default T getAt(int index) {
        throw new UnsupportedOperationException();
    }

    default Any getAnyAt(int index) {
        throw new UnsupportedOperationException();
    }

    default void setAt(int index, T value) {
        throw new UnsupportedOperationException();
    }

    default List<T> asList() {
        throw new UnsupportedOperationException();
    }
}
