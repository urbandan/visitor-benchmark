package com.urbandan.visitor_benchmark.hierarchy.genmodel.custom;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.AGenVisitable2;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.GenVisitor;

public class CustGenVisitable2 extends AGenVisitable2 {
    @Override
    public void accept(GenVisitor visitor) {
        visitor.visit(this);
    }
}
