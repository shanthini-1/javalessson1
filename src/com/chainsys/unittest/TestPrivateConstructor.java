package com.chainsys.unittest;

import com.chainsys.usingfinal.ShapeAPrivateConstructor;

public class TestPrivateConstructor {
    public static void testPrivateConstructor() {
        ShapeAPrivateConstructor refShapeA=
                ShapeAPrivateConstructor.getObject();
        refShapeA.height=123;
        refShapeA.width=500;
        refShapeA.echo();
    }

}