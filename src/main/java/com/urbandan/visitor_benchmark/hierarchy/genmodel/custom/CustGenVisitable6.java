package com.urbandan.visitor_benchmark.hierarchy.genmodel.custom;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.AGenVisitable6;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.GenVisitor;

public class CustGenVisitable6 extends AGenVisitable6 {
    @Override
    public void accept(GenVisitor visitor) {
        visitor.visit(this);
    }
}
