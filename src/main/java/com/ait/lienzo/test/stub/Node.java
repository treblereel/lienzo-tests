package com.ait.lienzo.test.stub;

import com.ait.lienzo.test.annotation.StubClass;
import elemental2.dom.Attr;
import elemental2.dom.Document;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.EventTarget;
import elemental2.dom.HTMLSlotElement;
import elemental2.dom.NamedNodeMap;
import elemental2.dom.NodeList;

@StubClass("Node")
public class Node implements EventTarget {
    public static double ATTRIBUTE_NODE;
    public static double CDATA_SECTION_NODE;
    public static double COMMENT_NODE;
    public static double DOCUMENT_FRAGMENT_NODE;
    public static double DOCUMENT_NODE;
    public static double DOCUMENT_POSITION_CONTAINED_BY;
    public static double DOCUMENT_POSITION_CONTAINS;
    public static double DOCUMENT_POSITION_DISCONNECTED;
    public static double DOCUMENT_POSITION_FOLLOWING;
    public static double DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC;
    public static double DOCUMENT_POSITION_PRECEDING;
    public static double DOCUMENT_TYPE_NODE;
    public static double ELEMENT_NODE;
    public static double ENTITY_NODE;
    public static double ENTITY_REFERENCE_NODE;
    public static double NOTATION_NODE;
    public static double PROCESSING_INSTRUCTION_NODE;
    public static double TEXT_NODE;
    public static double XPATH_NAMESPACE_NODE;
    public HTMLSlotElement assignedSlot;
    public NamedNodeMap<Attr> attributes;
    public String baseURI;
    public NodeList<Node> childNodes;
    public Node firstChild;
    public boolean isConnected;
    public Node lastChild;
    public String localName;
    public String namespaceURI;
    public Node nextSibling;
    public String nodeName;
    public int nodeType;
    public String nodeValue;
    public Document ownerDocument;
    public Node parentNode = new Node();
    public String prefix;
    public Node previousSibling;
    public String textContent;


    public Node removeChild(Node oldChild) {
        return new Node();
    }



    @Override
    public void addEventListener(String type, EventListener listener, AddEventListenerOptionsUnionType options) {

    }

    @Override
    public void addEventListener(String type, EventListener listener) {

    }

    @Override
    public boolean dispatchEvent(Event evt) {
        return false;
    }

    @Override
    public void removeEventListener(String type, EventListener listener, RemoveEventListenerOptionsUnionType options) {

    }

    @Override
    public void removeEventListener(String type, EventListener listener) {

    }
}
