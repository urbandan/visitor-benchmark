package com.urbandan.visitor_benchmark.hierarchy.genmodel.custom;

import com.urbandan.visitor_benchmark.hierarchy.genmodel.AGenVisitable3;
import com.urbandan.visitor_benchmark.hierarchy.genmodel.GenVisitor;

public class CustGenVisitable3 extends AGenVisitable3 {
    @Override
    public void accept(GenVisitor visitor) {
        visitor.visit(this);
    }
}
